/**
 * 
 */
package com.sailotech.tm;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * @author dhanunjaya.potteti
 *
 */
public class SmtpAuthenticator extends Authenticator {

	public SmtpAuthenticator() {

	    super();
	}

	@Override
	public PasswordAuthentication getPasswordAuthentication() {
	 String username = "dhanunjay.pv@gmail.com";
	 String password = "Dhanu@899";
	    if ((username != null) && (username.length() > 0) && (password != null) 
	      && (password.length   () > 0)) {

	        return new PasswordAuthentication(username, password);
	    }

	    return null;
}
}