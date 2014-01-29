/*******************************************************************************
 * Copyright (c) 2009 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package figures;

import org.eclipse.draw2d.ImageFigure;

import filesystem.figures.activator.PluginActivator;

/**
 * @generated
 */
public class FileFigure extends ImageFigure {

	public FileFigure() { 
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/File.jpg").createImage(), 0);
	}

}
