/**
 * UIPanel.java
 * DO NOT EDIT THIS FILE
 * This file was automatically generated by org.operamasks.faces.tools.apt.ComponentAnnotationProcessorFactory
 * at Sat Nov 03 15:46:26 CST 2012
 */

package org.operamasks.faces.component.layout.impl;

import org.operamasks.faces.component.layout.base.UIPanelBase;

@javax.annotation.Generated(value="org.operamasks.faces.tools.apt.ComponentAnnotationProcessorFactory", date="2012-11-03T15:46:26Z")
public class UIPanel extends UIPanelBase {
    public static final String COMPONENT_FAMILY = "org.operamasks.faces.component.layout.impl.UIPanel";
    public static final String COMPONENT_TYPE = "org.operamasks.faces.component.layout.impl.UIPanel";

    public UIPanel() {
	super.setRendererType("org.operamasks.faces.component.layout.impl.UIPanel");
    }

    public String getFamily() {
	return COMPONENT_FAMILY;
    }

    public java.lang.Boolean getAnimCollapse() {
	if (this.animCollapse != null) {
	    return this.animCollapse;
	}
	javax.el.ValueExpression ve = this.getValueExpression("animCollapse");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setAnimCollapse(java.lang.Boolean value) {
	this.animCollapse = value;
    }

    public java.lang.Boolean getAutoHeight() {
	if (this.autoHeight != null) {
	    return this.autoHeight;
	}
	javax.el.ValueExpression ve = this.getValueExpression("autoHeight");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setAutoHeight(java.lang.Boolean value) {
	this.autoHeight = value;
    }

    public java.lang.Boolean getAutoScroll() {
	if (this.autoScroll != null) {
	    return this.autoScroll;
	}
	javax.el.ValueExpression ve = this.getValueExpression("autoScroll");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setAutoScroll(java.lang.Boolean value) {
	this.autoScroll = value;
    }

    public java.lang.Boolean getAutoShow() {
	if (this.autoShow != null) {
	    return this.autoShow;
	}
	javax.el.ValueExpression ve = this.getValueExpression("autoShow");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setAutoShow(java.lang.Boolean value) {
	this.autoShow = value;
    }

    public java.lang.Boolean getAutoWidth() {
	if (this.autoWidth != null) {
	    return this.autoWidth;
	}
	javax.el.ValueExpression ve = this.getValueExpression("autoWidth");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setAutoWidth(java.lang.Boolean value) {
	this.autoWidth = value;
    }

    public java.lang.Boolean getBodyBorder() {
	if (this.bodyBorder != null) {
	    return this.bodyBorder;
	}
	javax.el.ValueExpression ve = this.getValueExpression("bodyBorder");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setBodyBorder(java.lang.Boolean value) {
	this.bodyBorder = value;
    }

    public java.lang.String getBodyStyle() {
	if (this.bodyStyle != null) {
	    return this.bodyStyle;
	}
	javax.el.ValueExpression ve = this.getValueExpression("bodyStyle");
	if (ve != null) {
	    try {
		return (java.lang.String)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setBodyStyle(java.lang.String value) {
	this.bodyStyle = value;
    }

    public java.lang.Boolean getBorder() {
	if (this.border != null) {
	    return this.border;
	}
	javax.el.ValueExpression ve = this.getValueExpression("border");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setBorder(java.lang.Boolean value) {
	this.border = value;
    }

    public java.lang.Boolean getCollapseFirst() {
	if (this.collapseFirst != null) {
	    return this.collapseFirst;
	}
	javax.el.ValueExpression ve = this.getValueExpression("collapseFirst");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setCollapseFirst(java.lang.Boolean value) {
	this.collapseFirst = value;
    }

    public java.lang.Boolean getCollapsed() {
	if (this.collapsed != null) {
	    return this.collapsed;
	}
	javax.el.ValueExpression ve = this.getValueExpression("collapsed");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setCollapsed(java.lang.Boolean value) {
	this.collapsed = value;
    }

    public java.lang.Boolean getCollapsible() {
	if (this.collapsible != null) {
	    return this.collapsible;
	}
	javax.el.ValueExpression ve = this.getValueExpression("collapsible");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setCollapsible(java.lang.Boolean value) {
	this.collapsible = value;
    }

    public java.lang.Boolean getDraggable() {
	if (this.draggable != null) {
	    return this.draggable;
	}
	javax.el.ValueExpression ve = this.getValueExpression("draggable");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setDraggable(java.lang.Boolean value) {
	this.draggable = value;
    }

    public java.lang.Boolean getFloating() {
	if (this.floating != null) {
	    return this.floating;
	}
	javax.el.ValueExpression ve = this.getValueExpression("floating");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setFloating(java.lang.Boolean value) {
	this.floating = value;
    }

    public java.lang.Boolean getFooter() {
	if (this.footer != null) {
	    return this.footer;
	}
	javax.el.ValueExpression ve = this.getValueExpression("footer");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setFooter(java.lang.Boolean value) {
	this.footer = value;
    }

    public java.lang.Boolean getFrame() {
	if (this.frame != null) {
	    return this.frame;
	}
	javax.el.ValueExpression ve = this.getValueExpression("frame");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setFrame(java.lang.Boolean value) {
	this.frame = value;
    }

    public java.lang.Boolean getHeader() {
	if (this.header != null) {
	    return this.header;
	}
	javax.el.ValueExpression ve = this.getValueExpression("header");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setHeader(java.lang.Boolean value) {
	this.header = value;
    }

    public java.lang.Boolean getHeaderAsText() {
	if (this.headerAsText != null) {
	    return this.headerAsText;
	}
	javax.el.ValueExpression ve = this.getValueExpression("headerAsText");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setHeaderAsText(java.lang.Boolean value) {
	this.headerAsText = value;
    }

    public java.lang.Integer getHeight() {
	if (this.height != null) {
	    return this.height;
	}
	javax.el.ValueExpression ve = this.getValueExpression("height");
	if (ve != null) {
	    try {
		return (java.lang.Integer)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setHeight(java.lang.Integer value) {
	this.height = value;
    }

    public java.lang.Boolean getHideBorders() {
	if (this.hideBorders != null) {
	    return this.hideBorders;
	}
	javax.el.ValueExpression ve = this.getValueExpression("hideBorders");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setHideBorders(java.lang.Boolean value) {
	this.hideBorders = value;
    }

    public java.lang.Boolean getHideCollapseTool() {
	if (this.hideCollapseTool != null) {
	    return this.hideCollapseTool;
	}
	javax.el.ValueExpression ve = this.getValueExpression("hideCollapseTool");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setHideCollapseTool(java.lang.Boolean value) {
	this.hideCollapseTool = value;
    }

    public java.lang.Boolean getHideParent() {
	if (this.hideParent != null) {
	    return this.hideParent;
	}
	javax.el.ValueExpression ve = this.getValueExpression("hideParent");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setHideParent(java.lang.Boolean value) {
	this.hideParent = value;
    }

    public java.lang.String getLayout() {
	if (this.layout != null) {
	    return this.layout;
	}
	javax.el.ValueExpression ve = this.getValueExpression("layout");
	if (ve != null) {
	    try {
		return (java.lang.String)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setLayout(java.lang.String value) {
	this.layout = value;
    }

    public java.lang.Boolean getMaskDisabled() {
	if (this.maskDisabled != null) {
	    return this.maskDisabled;
	}
	javax.el.ValueExpression ve = this.getValueExpression("maskDisabled");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setMaskDisabled(java.lang.Boolean value) {
	this.maskDisabled = value;
    }

    public java.lang.Boolean getShadow() {
	if (this.shadow != null) {
	    return this.shadow;
	}
	javax.el.ValueExpression ve = this.getValueExpression("shadow");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setShadow(java.lang.Boolean value) {
	this.shadow = value;
    }

    public java.lang.Integer getShadowOffset() {
	if (this.shadowOffset != null) {
	    return this.shadowOffset;
	}
	javax.el.ValueExpression ve = this.getValueExpression("shadowOffset");
	if (ve != null) {
	    try {
		return (java.lang.Integer)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setShadowOffset(java.lang.Integer value) {
	this.shadowOffset = value;
    }

    public java.lang.Boolean getShim() {
	if (this.shim != null) {
	    return this.shim;
	}
	javax.el.ValueExpression ve = this.getValueExpression("shim");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setShim(java.lang.Boolean value) {
	this.shim = value;
    }

    public java.lang.Boolean getTitleCollapse() {
	if (this.titleCollapse != null) {
	    return this.titleCollapse;
	}
	javax.el.ValueExpression ve = this.getValueExpression("titleCollapse");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setTitleCollapse(java.lang.Boolean value) {
	this.titleCollapse = value;
    }

    public java.lang.Integer getWidth() {
	if (this.width != null) {
	    return this.width;
	}
	javax.el.ValueExpression ve = this.getValueExpression("width");
	if (ve != null) {
	    try {
		return (java.lang.Integer)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setWidth(java.lang.Integer value) {
	this.width = value;
    }

    public java.lang.Boolean getAnimFloat() {
	if (this.animFloat != null) {
	    return this.animFloat;
	}
	javax.el.ValueExpression ve = this.getValueExpression("animFloat");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setAnimFloat(java.lang.Boolean value) {
	this.animFloat = value;
    }

    public java.lang.Boolean getAutoHide() {
	if (this.autoHide != null) {
	    return this.autoHide;
	}
	javax.el.ValueExpression ve = this.getValueExpression("autoHide");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setAutoHide(java.lang.Boolean value) {
	this.autoHide = value;
    }

    public java.lang.String getCmargins() {
	if (this.cmargins != null) {
	    return this.cmargins;
	}
	javax.el.ValueExpression ve = this.getValueExpression("cmargins");
	if (ve != null) {
	    try {
		return (java.lang.String)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setCmargins(java.lang.String value) {
	this.cmargins = value;
    }

    public java.lang.String getCollapseMode() {
	if (this.collapseMode != null) {
	    return this.collapseMode;
	}
	javax.el.ValueExpression ve = this.getValueExpression("collapseMode");
	if (ve != null) {
	    try {
		return (java.lang.String)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setCollapseMode(java.lang.String value) {
	this.collapseMode = value;
    }

    public java.lang.Boolean getFloatable() {
	if (this.floatable != null) {
	    return this.floatable;
	}
	javax.el.ValueExpression ve = this.getValueExpression("floatable");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setFloatable(java.lang.Boolean value) {
	this.floatable = value;
    }

    public java.lang.String getMargins() {
	if (this.margins != null) {
	    return this.margins;
	}
	javax.el.ValueExpression ve = this.getValueExpression("margins");
	if (ve != null) {
	    try {
		return (java.lang.String)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setMargins(java.lang.String value) {
	this.margins = value;
    }

    public java.lang.String getRegion() {
	if (this.region != null) {
	    return this.region;
	}
	javax.el.ValueExpression ve = this.getValueExpression("region");
	if (ve != null) {
	    try {
		return (java.lang.String)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setRegion(java.lang.String value) {
	this.region = value;
    }

    public java.lang.Integer getMinSize() {
	if (this.minSize != null) {
	    return this.minSize;
	}
	javax.el.ValueExpression ve = this.getValueExpression("minSize");
	if (ve != null) {
	    try {
		return (java.lang.Integer)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setMinSize(java.lang.Integer value) {
	this.minSize = value;
    }

    public java.lang.Integer getMaxSize() {
	if (this.maxSize != null) {
	    return this.maxSize;
	}
	javax.el.ValueExpression ve = this.getValueExpression("maxSize");
	if (ve != null) {
	    try {
		return (java.lang.Integer)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setMaxSize(java.lang.Integer value) {
	this.maxSize = value;
    }

    public java.lang.Boolean getSplit() {
	if (this.split != null) {
	    return this.split;
	}
	javax.el.ValueExpression ve = this.getValueExpression("split");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setSplit(java.lang.Boolean value) {
	this.split = value;
    }

    public java.lang.Float getColumnWidth() {
	if (this.columnWidth != null) {
	    return this.columnWidth;
	}
	javax.el.ValueExpression ve = this.getValueExpression("columnWidth");
	if (ve != null) {
	    try {
		return (java.lang.Float)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setColumnWidth(java.lang.Float value) {
	this.columnWidth = value;
    }

    public java.lang.Integer getRowspan() {
	if (this.rowspan != null) {
	    return this.rowspan;
	}
	javax.el.ValueExpression ve = this.getValueExpression("rowspan");
	if (ve != null) {
	    try {
		return (java.lang.Integer)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setRowspan(java.lang.Integer value) {
	this.rowspan = value;
    }

    public java.lang.Integer getColspan() {
	if (this.colspan != null) {
	    return this.colspan;
	}
	javax.el.ValueExpression ve = this.getValueExpression("colspan");
	if (ve != null) {
	    try {
		return (java.lang.Integer)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setColspan(java.lang.Integer value) {
	this.colspan = value;
    }

    public java.lang.Integer getX() {
	if (this.x != null) {
	    return this.x;
	}
	javax.el.ValueExpression ve = this.getValueExpression("x");
	if (ve != null) {
	    try {
		return (java.lang.Integer)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setX(java.lang.Integer value) {
	this.x = value;
    }

    public java.lang.Integer getY() {
	if (this.y != null) {
	    return this.y;
	}
	javax.el.ValueExpression ve = this.getValueExpression("y");
	if (ve != null) {
	    try {
		return (java.lang.Integer)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setY(java.lang.Integer value) {
	this.y = value;
    }

    public java.lang.Boolean getClosable() {
	if (this.closable != null) {
	    return this.closable;
	}
	javax.el.ValueExpression ve = this.getValueExpression("closable");
	if (ve != null) {
	    try {
		return (java.lang.Boolean)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setClosable(java.lang.Boolean value) {
	this.closable = value;
    }

    public java.lang.String getOnactivate() {
	if (this.onactivate != null) {
	    return this.onactivate;
	}
	javax.el.ValueExpression ve = this.getValueExpression("onactivate");
	if (ve != null) {
	    try {
		return (java.lang.String)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setOnactivate(java.lang.String value) {
	this.onactivate = value;
    }

    public java.lang.String getJsvar() {
	if (this.jsvar != null) {
	    return this.jsvar;
	}
	javax.el.ValueExpression ve = this.getValueExpression("jsvar");
	if (ve != null) {
	    try {
		return (java.lang.String)ve.getValue(this.getFacesContext().getELContext());
	    } catch (javax.el.ELException e) {
		throw new javax.faces.FacesException(e);
	    }
	}
	return null;
    }

    public void setJsvar(java.lang.String value) {
	this.jsvar = value;
    }

    public Object saveState(javax.faces.context.FacesContext context) {
	return new Object[] {
	    super.saveState(context),
	    this.animCollapse,
	    this.autoHeight,
	    this.autoScroll,
	    this.autoShow,
	    this.autoWidth,
	    this.bodyBorder,
	    this.bodyStyle,
	    this.border,
	    this.collapseFirst,
	    this.collapsed,
	    this.collapsible,
	    this.draggable,
	    this.floating,
	    this.footer,
	    this.frame,
	    this.header,
	    this.headerAsText,
	    this.height,
	    this.hideBorders,
	    this.hideCollapseTool,
	    this.hideParent,
	    this.layout,
	    this.maskDisabled,
	    this.shadow,
	    this.shadowOffset,
	    this.shim,
	    this.title,
	    this.titleCollapse,
	    this.width,
	    this.animFloat,
	    this.autoHide,
	    this.cmargins,
	    this.collapseMode,
	    this.floatable,
	    this.margins,
	    this.region,
	    this.minSize,
	    this.maxSize,
	    this.split,
	    this.columnWidth,
	    this.rowspan,
	    this.colspan,
	    this.x,
	    this.y,
	    this.closable,
	    this.onactivate,
	    this.jsvar,
	};
    }

    public void restoreState(javax.faces.context.FacesContext context, Object state) {
	Object[] values = (Object[])state;
	super.restoreState(context, values[0]);
	this.animCollapse = (java.lang.Boolean)values[1];
	this.autoHeight = (java.lang.Boolean)values[2];
	this.autoScroll = (java.lang.Boolean)values[3];
	this.autoShow = (java.lang.Boolean)values[4];
	this.autoWidth = (java.lang.Boolean)values[5];
	this.bodyBorder = (java.lang.Boolean)values[6];
	this.bodyStyle = (java.lang.String)values[7];
	this.border = (java.lang.Boolean)values[8];
	this.collapseFirst = (java.lang.Boolean)values[9];
	this.collapsed = (java.lang.Boolean)values[10];
	this.collapsible = (java.lang.Boolean)values[11];
	this.draggable = (java.lang.Boolean)values[12];
	this.floating = (java.lang.Boolean)values[13];
	this.footer = (java.lang.Boolean)values[14];
	this.frame = (java.lang.Boolean)values[15];
	this.header = (java.lang.Boolean)values[16];
	this.headerAsText = (java.lang.Boolean)values[17];
	this.height = (java.lang.Integer)values[18];
	this.hideBorders = (java.lang.Boolean)values[19];
	this.hideCollapseTool = (java.lang.Boolean)values[20];
	this.hideParent = (java.lang.Boolean)values[21];
	this.layout = (java.lang.String)values[22];
	this.maskDisabled = (java.lang.Boolean)values[23];
	this.shadow = (java.lang.Boolean)values[24];
	this.shadowOffset = (java.lang.Integer)values[25];
	this.shim = (java.lang.Boolean)values[26];
	this.title = (java.lang.String)values[27];
	this.titleCollapse = (java.lang.Boolean)values[28];
	this.width = (java.lang.Integer)values[29];
	this.animFloat = (java.lang.Boolean)values[30];
	this.autoHide = (java.lang.Boolean)values[31];
	this.cmargins = (java.lang.String)values[32];
	this.collapseMode = (java.lang.String)values[33];
	this.floatable = (java.lang.Boolean)values[34];
	this.margins = (java.lang.String)values[35];
	this.region = (java.lang.String)values[36];
	this.minSize = (java.lang.Integer)values[37];
	this.maxSize = (java.lang.Integer)values[38];
	this.split = (java.lang.Boolean)values[39];
	this.columnWidth = (java.lang.Float)values[40];
	this.rowspan = (java.lang.Integer)values[41];
	this.colspan = (java.lang.Integer)values[42];
	this.x = (java.lang.Integer)values[43];
	this.y = (java.lang.Integer)values[44];
	this.closable = (java.lang.Boolean)values[45];
	this.onactivate = (java.lang.String)values[46];
	this.jsvar = (java.lang.String)values[47];
    }

}
