/*
 * Ext JS Library 2.0 RC 1
 * Copyright(c) 2006-2007, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */




Ext.Tip = Ext.extend(Ext.Panel, {
    
    
    minWidth : 40,
    
    maxWidth : 300,
    
    shadow : "sides",
    
    defaultAlign : "tl-bl?",
    autoRender: true,
    quickShowInterval : 250,

    // private panel overrides
    frame:true,
    hidden:true,
    baseCls: 'x-tip',
    floating:{shadow:true,shim:true,useDisplay:true,constrain:false},
    autoHeight:true,

    // private
    initComponent : function(){
        Ext.Tip.superclass.initComponent.call(this);
        if(this.closable && !this.title){
            this.elements += ',header';
        }
    },

    // private
    afterRender : function(){
        Ext.Tip.superclass.afterRender.call(this);
        if(this.closable){
            this.addTool({
                id: 'close',
                handler: this.hide,
                scope: this
            });
        }
    },

    
    showAt : function(xy){
        Ext.Tip.superclass.show.call(this);
        if(this.measureWidth !== false && (!this.initialConfig || typeof this.initialConfig.width != 'number')){
            var bw = this.body.getTextWidth();
            if(this.title){
                bw = Math.max(bw, this.header.child('span').getTextWidth(this.title));
            }
            bw += this.getFrameWidth() + (this.closable ? 20 : 0) + this.body.getPadding("lr");
            this.setWidth(bw.constrain(this.minWidth, this.maxWidth));
        }
        if(this.constrainPosition){
            xy = this.el.adjustForConstraints(xy);
        }
        this.setPagePosition(xy[0], xy[1]);
    },

    
    showBy : function(el, pos){
        if(!this.rendered){
            this.render(Ext.getBody());
        }
        this.showAt(this.el.getAlignToXY(el, pos || this.defaultAlign));
    },

    initDraggable : function(){
        this.dd = new Ext.Tip.DD(this, typeof this.draggable == 'boolean' ? null : this.draggable);
        this.header.addClass('x-tip-draggable');
    }
});

// private - custom Tip DD implementation
Ext.Tip.DD = function(tip, config){
    Ext.apply(this, config);
    this.tip = tip;
    Ext.Tip.DD.superclass.constructor.call(this, tip.el.id, 'WindowDD-'+tip.id);
    this.setHandleElId(tip.header.id);
    this.scroll = false;
};

Ext.extend(Ext.Tip.DD, Ext.dd.DD, {
    moveOnly:true,
    scroll:false,
    headerOffsets:[100, 25],
    startDrag : function(){
        this.tip.el.disableShadow();
    },
    endDrag : function(e){
        this.tip.el.enableShadow(true);
    }
});



Ext.ToolTip = Ext.extend(Ext.Tip, {
    
    
    
    showDelay: 500,
    
    hideDelay: 200,
    
    dismissDelay: 5000,
    
    mouseOffset: [15,18],
    
    trackMouse : false,
    constrainPosition: true,

    // private
    initComponent: function(){
        Ext.ToolTip.superclass.initComponent.call(this);
        this.lastActive = new Date();
        this.initTarget();
    },

    // private
    initTarget : function(){
        if(this.target){
            this.target = Ext.get(this.target);
            this.target.on('mouseover', this.onTargetOver, this);
            this.target.on('mouseout', this.onTargetOut, this);
            this.target.on('mousemove', this.onMouseMove, this);
        }
    },

    // private
    onMouseMove : function(e){
        this.targetXY = e.getXY();
        if(!this.hidden && this.trackMouse){
            this.setPagePosition(this.getTargetXY());
        }
    },

    // private
    getTargetXY : function(){
        return [this.targetXY[0]+this.mouseOffset[0], this.targetXY[1]+this.mouseOffset[1]];
    },

    // private
    onTargetOver : function(e){
        if(this.disabled || e.within(this.target.dom, true)){
            return;
        }
        this.clearTimer('hide');
        this.targetXY = e.getXY();
        this.delayShow();
    },

    // private
    delayShow : function(){
        if(this.hidden && !this.showTimer){
            if(this.lastActive.getElapsed() < this.quickShowInterval){
                this.show();
            }else{
                this.showTimer = this.show.defer(this.showDelay, this);
            }
        }else if(!this.hidden && this.autoHide !== false){
            this.show();
        }
    },

    // private
    onTargetOut : function(e){
        if(this.disabled || e.within(this.target.dom, true)){
            return;
        }
        this.clearTimer('show');
        if(this.autoHide !== false){
            this.delayHide();
        }
    },

    // private
    delayHide : function(){
        if(!this.hidden && !this.hideTimer){
            this.hideTimer = this.hide.defer(this.hideDelay, this);
        }
    },

    
    hide: function(){
        this.clearTimer('dismiss');
        this.lastActive = new Date();
        Ext.ToolTip.superclass.hide.call(this);
    },

    
    show : function(){
        this.showAt(this.getTargetXY());
    },

    // inherit docs
    showAt : function(xy){
        this.lastActive = new Date();
        this.clearTimers();
        Ext.ToolTip.superclass.showAt.call(this, xy);
        if(this.dismissDelay && this.autoHide !== false){
            this.dismissTimer = this.hide.defer(this.dismissDelay, this);
        }
    },

    // private
    clearTimer : function(name){
        name = name + 'Timer';
        clearTimeout(this[name]);
        delete this[name];
    },

    // private
    clearTimers : function(){
        this.clearTimer('show');
        this.clearTimer('dismiss');
        this.clearTimer('hide');
    },

    // private
    onShow : function(){
        Ext.ToolTip.superclass.onShow.call(this);
        Ext.getDoc().on('mousedown', this.onDocMouseDown, this);
    },

    // private
    onHide : function(){
        Ext.ToolTip.superclass.onHide.call(this);
        Ext.getDoc().un('mousedown', this.onDocMouseDown, this);
    },

    // private
    onDocMouseDown : function(e){
        if(this.autoHide !== false && !e.within(this.el.dom)){
            this.disable();
            this.enable.defer(100, this);
        }
    },

    // private
    onDisable : function(){
        this.clearTimers();
        this.hide();
    },

    // private
    adjustPosition : function(x, y){
        // keep the position from being under the mouse
        var ay = this.targetXY[1], h = this.getSize().height;
        if(this.constrainPosition && y <= ay && (y+h) >= ay){
            y = ay-h-5;
        }
        return {x : x, y: y};
    },

    // private
    onDestroy : function(){
        Ext.ToolTip.superclass.onDestroy.call(this);
        if(this.target){
            this.target.un('mouseover', this.onTargetOver, this);
            this.target.un('mouseout', this.onTargetOut, this);
            this.target.un('mousemove', this.onMouseMove, this);
        }
    }
});



Ext.QuickTip = Ext.extend(Ext.ToolTip, {
    
    
    interceptTitles : false,

    // private
    tagConfig : {
        namespace : "ext",
        attribute : "qtip",
        width : "qwidth",
        target : "target",
        title : "qtitle",
        hide : "hide",
        cls : "qclass",
        align : "qalign"
    },

    // private
    initComponent : function(){
        this.target = this.target || Ext.getDoc();
        this.targets = this.targets || {};
        Ext.QuickTip.superclass.initComponent.call(this);
    },

    
    register : function(config){
        var cs = config instanceof Array ? config : arguments;
        for(var i = 0, len = cs.length; i < len; i++){
            var c = cs[i];
            var target = c.target;
            if(target){
                if(target instanceof Array){
                    for(var j = 0, jlen = target.length; j < jlen; j++){
                        this.targets[Ext.id(target[j])] = c;
                    }
                } else{
                    this.targets[Ext.id(target)] = c;
                }
            }
        }
    },

    
    unregister : function(el){
        delete this.targets[Ext.id(el)];
    },

    // private
    onTargetOver : function(e){
        if(this.disabled){
            return;
        }
        this.targetXY = e.getXY();
        var t = e.getTarget();
        if(!t || t.nodeType !== 1 || t == document || t == document.body){
            return;
        }
        if(this.activeTarget && t == this.activeTarget.el){
            this.clearTimer('hide');
            this.show();
            return;
        }
        if(t && this.targets[t.id]){
            this.activeTarget = this.targets[t.id];
            this.activeTarget.el = t;
            this.delayShow();
            return;
        }
        var ttp, et = Ext.fly(t), cfg = this.tagConfig;
        var ns = cfg.namespace;
        if(this.interceptTitles && t.title){
            ttp = t.title;
            t.qtip = ttp;
            t.removeAttribute("title");
            e.preventDefault();
        } else{
            ttp = t.qtip || et.getAttributeNS(ns, cfg.attribute);
        }
        if(ttp){
            var autoHide = et.getAttributeNS(ns, cfg.hide);
            this.activeTarget = {
                el: t,
                text: ttp,
                width: et.getAttributeNS(ns, cfg.width),
                autoHide: autoHide != "user" && autoHide !== 'false',
                title: et.getAttributeNS(ns, cfg.title),
                cls: et.getAttributeNS(ns, cfg.cls),
                align: et.getAttributeNS(ns, cfg.align)
            };
            this.delayShow();
        }
    },

    // private
    onTargetOut : function(e){
        this.clearTimer('show');
        if(this.autoHide !== false){
            this.delayHide();
        }
    },

    // inherit docs
    showAt : function(xy){
        var t = this.activeTarget;
        if(t){
            if(!this.rendered){
                this.render(Ext.getBody());
            }
            if(t.width){
                this.setWidth(t.width);
                this.measureWidth = false;
            } else{
                this.measureWidth = true;
            }
            this.setTitle(t.title || '');
            this.body.update(t.text);
            this.autoHide = t.autoHide;
            this.dismissDelay = t.dismissDelay || this.dismissDelay;
            if(this.lastCls){
                this.el.removeClass(this.lastCls);
                delete this.lastCls;
            }
            if(t.cls){
                this.el.addClass(t.cls);
                this.lastCls = t.cls;
            }
            if(t.align){ // TODO: this doesn't seem to work consistently
                xy = this.el.getAlignToXY(t.el, t.align);
                this.constrainPosition = false;
            } else{
                this.constrainPosition = true;
            }
        }
        Ext.QuickTip.superclass.showAt.call(this, xy);
    },

    // inherit docs
    hide: function(){
        delete this.activeTarget;
        Ext.QuickTip.superclass.hide.call(this);
    }
});



Ext.QuickTips = function(){
    var tip, locks = [];
    return {
        
        init : function(){
            if(!tip){
                tip = new Ext.QuickTip({elements:'header,body'});
            }
        },

        
        enable : function(){
            if(tip){
                locks.pop();
                if(locks.length < 1){
                    tip.enable();
                }
            }
        },

        
        disable : function(){
            if(tip){
                tip.disable();
            }
            locks.push(1);
        },

        
        isEnabled : function(){
            return tip && !tip.disabled;
        },

        
        getQuickTip : function(){
            return tip;
        },

        
        register : function(){
            tip.register.apply(tip, arguments);
        },

        
        unregister : function(){
            tip.unregister.apply(tip, arguments);
        },

        
        tips :function(){
            tip.register.apply(tip, arguments);
        }
    }
}();
