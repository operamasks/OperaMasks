/*
 * $Id: TreeNodeChangeImage.java,v 1.2 2007/12/11 04:20:12 jacky Exp $
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

package org.operamasks.faces.component.widget.tree.state;


public class TreeNodeChangeImage implements TreeStateChange {
	private String oldImage;
	private String newImage;
	
	public TreeNodeChangeImage(String oldImage, String newImage) {
		this.oldImage = oldImage;
		this.newImage = newImage;
	}

	public String getNewImage() {
		return newImage;
	}

	public void setNewImage(String newImage) {
		this.newImage = newImage;
	}

	public String getOldImage() {
		return oldImage;
	}

	public void setOldImage(String oldImage) {
		this.oldImage = oldImage;
	}
}
