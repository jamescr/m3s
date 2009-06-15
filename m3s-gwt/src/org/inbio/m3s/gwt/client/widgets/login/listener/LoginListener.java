/*
 * LoginListener.java
 *
 *@author james
 *
 * Created on February 7, 2007, 2:51 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.inbio.m3s.gwt.client.widgets.login.listener;

import java.util.EventListener;

/**
 * Login Listener interface for the event to be generated by the Login Widget
 * 
 * This class extends from java.util.EventListener
 */
public interface LoginListener extends EventListener {

	/**
	 * @param username
	 *            textual username value for being display in some widgets
	 */
	void userLogin(String username);

	/**
	 * 
	 * 
	 */
	void userLogout();

}