/*******************************************************************************
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - Initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.server.core;

import org.eclipse.wst.server.core.IModule;
/**
 * A J2EE web module.
 * <p>
 * <b>Provisional API:</b> This class/interface is part of an interim API that is still under development and expected to 
 * change significantly before reaching stability. It is being made available at this early stage to solicit feedback 
 * from pioneering adopters on the understanding that any code that uses this API will almost certainly be broken 
 * (repeatedly) as the API evolves.
 * </p>
 * @plannedfor 3.0
 */
public interface IWebModule extends IJ2EEModule {
	/**
	 * Returns the context root of the module.
	 * 
	 * @return java.lang.String
	 */
	public String getContextRoot();

	/**
	 * Returns the utility modules contained within this WAR.
	 *
	 * @return a possibly empty array of modules contained within this application
	 */
	public IModule[] getModules();

	/**
	 * Returns the URI of the given contained module.
	 *
	 * @param module a module
	 * @return the URI of the given module, or <code>null</code> if the URI could
	 *    not be found
	 */
	public String getURI(IModule module);
}