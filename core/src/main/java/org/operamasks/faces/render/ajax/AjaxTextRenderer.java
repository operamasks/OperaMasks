/*
 * $Id: AjaxTextRenderer.java,v 1.6 2008/01/08 08:22:25 yangdong Exp $
 *
 * Copyright (C) 2006 Operamasks Community.
 * Copyright (C) 2000-2006 Apusic Systems, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see http://www.gnu.org/licenses.
 */

package org.operamasks.faces.render.ajax;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import java.io.IOException;
import org.operamasks.faces.render.html.TextRenderer;
import org.operamasks.faces.util.HtmlEncoder;
import org.operamasks.faces.util.FacesUtils;

public class AjaxTextRenderer extends TextRenderer
{
    @Override
    protected void encodeOutputText(FacesContext context, UIComponent component)
        throws IOException
    {
        if (isAjaxResponse(context)) {
            ValueExpression ve = component.getValueExpression("value");
            if (((ve == null || ve.isLiteralText()) &&
            		component.getValueExpression("binding") == null) &&
            			component.getChildren().isEmpty()) {
                return;
            }

            String text;

            Object value = getValue(component);
            if (value == null) {
                text = FacesUtils.encodeComponentChildren(context, component);
            } else {
                text = getFormattedValue(context, component, value);
            }

            if (text == null) {
                text = "";
            } else if (needsEscape(component)) {
                text = HtmlEncoder.encode(text);
            }

            AjaxResponseWriter out = (AjaxResponseWriter)context.getResponseWriter();
            out.writeInnerHtmlScript(component.getClientId(context), text);
        } else {
            super.encodeOutputText(context, component);
        }
    }
}
