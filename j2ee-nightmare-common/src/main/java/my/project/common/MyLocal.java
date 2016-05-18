package my.project.common;

import javax.ejb.Local;

@Local
public interface MyLocal {
	public void myLocalBusinessMethod();
}