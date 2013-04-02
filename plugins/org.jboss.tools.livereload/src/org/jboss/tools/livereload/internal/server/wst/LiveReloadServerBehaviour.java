/******************************************************************************* 
 * Copyright (c) 2008 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Xavier Coulon - Initial API and implementation 
 ******************************************************************************/

package org.jboss.tools.livereload.internal.server.wst;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.wst.server.core.IServer;
import org.eclipse.wst.server.core.model.ServerBehaviourDelegate;

/**
 * @author xcoulon
 * 
 */
public class LiveReloadServerBehaviour extends ServerBehaviourDelegate {

	public void setServerStarting() {
		setServerState(IServer.STATE_STARTING);
	}

	public void setServerStarted() {
		setServerState(IServer.STATE_STARTED);
	}

	public void setServerStopping() {
		setServerState(IServer.STATE_STOPPING);
	}

	public void setServerStopped() {
		setServerState(IServer.STATE_STOPPED);
	}

	@Override
	public IStatus canPublish() {
		return Status.CANCEL_STATUS;
	}

	@Override
	protected void initialize(IProgressMonitor monitor) {
		super.initialize(monitor);
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	
	
	/* (non-Javadoc)
	 * @see org.eclipse.wst.server.core.model.ServerBehaviourDelegate#restart(java.lang.String)
	 */
	@Override
	public void restart(String launchMode) throws CoreException {
		// TODO Auto-generated method stub
		super.restart(launchMode);
	}

	@Override
	public void stop(boolean force) {
		setServerStopping();
		setServerStopped();
	}

}