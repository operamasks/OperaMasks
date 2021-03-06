/**
 * UITimeField.java
 * DO NOT EDIT THIS FILE
 * This file was automatically generated by org.operamasks.faces.tools.apt.ComponentAnnotationProcessorFactory
 * at Sat Nov 03 15:46:26 CST 2012
 */

package org.operamasks.faces.webapp.form;

/**
* @jsp.tag name="timeField" body-content="JSP"
*/
public class UITimeFieldTag extends org.operamasks.faces.webapp.html.HtmlBasicELTag {
    public String getComponentType() {
	return "org.operamasks.faces.component.form.impl.UITimeField";
    }

    public String getRendererType() {
	return "org.operamasks.faces.component.form.impl.UITimeField";
    }

    private javax.el.ValueExpression altFormats;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setAltFormats(javax.el.ValueExpression value) {
	this.altFormats = value;
    }
    private javax.el.ValueExpression format;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setFormat(javax.el.ValueExpression value) {
	this.format = value;
    }
    private javax.el.ValueExpression increment;
    /**
    * @jsp.attribute type="java.lang.Integer"
    */
    public void setIncrement(javax.el.ValueExpression value) {
	this.increment = value;
    }
    private javax.el.ValueExpression invalidText;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setInvalidText(javax.el.ValueExpression value) {
	this.invalidText = value;
    }
    private javax.el.ValueExpression maxText;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setMaxText(javax.el.ValueExpression value) {
	this.maxText = value;
    }
    private javax.el.ValueExpression maxValue;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setMaxValue(javax.el.ValueExpression value) {
	this.maxValue = value;
    }
    private javax.el.ValueExpression minText;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setMinText(javax.el.ValueExpression value) {
	this.minText = value;
    }
    private javax.el.ValueExpression minValue;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setMinValue(javax.el.ValueExpression value) {
	this.minValue = value;
    }
    protected void setProperties(javax.faces.component.UIComponent c) {
	super.setProperties(c);
	c.setValueExpression("altFormats", this.altFormats);
	c.setValueExpression("format", this.format);
	c.setValueExpression("increment", this.increment);
	c.setValueExpression("invalidText", this.invalidText);
	c.setValueExpression("maxText", this.maxText);
	c.setValueExpression("maxValue", this.maxValue);
	c.setValueExpression("minText", this.minText);
	c.setValueExpression("minValue", this.minValue);
    }

    public void release() {
	super.release();
	this.altFormats = null;
	this.format = null;
	this.increment = null;
	this.invalidText = null;
	this.maxText = null;
	this.maxValue = null;
	this.minText = null;
	this.minValue = null;
    }

}
