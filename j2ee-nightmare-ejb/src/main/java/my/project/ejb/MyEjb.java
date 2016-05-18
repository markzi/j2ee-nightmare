package my.project.ejb;

import javax.ejb.Stateless;

import my.project.common.MyLocal;

@Stateless(name = "MyEjb")
public class MyEjb implements MyLocal {
	public void myLocalBusinessMethod() {
		System.out.println("Hello from my EJB");
	}
}