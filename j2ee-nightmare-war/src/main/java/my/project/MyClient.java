package my.project;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import my.project.common.MyLocal;

public class MyClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyClient.class);
	
	private final InitialContext initialContext;

	public MyClient() {

		InitialContext ic = null;
		try {
			ic = new InitialContext();
		} catch (Exception e) {
		}

		this.initialContext = ic;
	}

	
	/**
	 * ejblocal:<package.qualified.interface>
	 * 
	 * ejblocal:my.project.common.MyLocal
	 * 
	 */
	
	public void callMyLocalBusinessMethod() {

		try {
//			MyLocal myLocal = (MyLocal) initialContext.lookup("ejblocal:my.project.common.MyLocal");
			MyLocal myLocal = (MyLocal) initialContext.lookup("java:comp/env/ejb/session/MyEjb");
			myLocal.myLocalBusinessMethod();
		} catch (NamingException e) {
			LOGGER.error("Problem looking up EJB", e);
		}
	}
}
