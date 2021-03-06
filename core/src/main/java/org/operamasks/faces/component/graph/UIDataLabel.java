/*
 * $Id: UIDataLabel.java,v 1.3 2007/07/02 07:37:55 jacky Exp $
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

package org.operamasks.faces.component.graph;

import javax.faces.component.UIOutput;

import org.operamasks.faces.util.FacesUtils;

public class UIDataLabel extends UIOutput
{
    public static final String COMPONENT_TYPE = "org.operamasks.faces.graph.DataLabel";

    public UIDataLabel() {
        setRendererType(null);
    }

    public String getText() {
        return FacesUtils.getFormattedValue(getFacesContext(), this, getValue());
    }
}
