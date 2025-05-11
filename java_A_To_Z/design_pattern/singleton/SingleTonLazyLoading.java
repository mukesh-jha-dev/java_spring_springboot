package singleton;

import java.io.Serializable;

//lazy loading
public class SingleTonLazyLoading implements Serializable{
	private static final long serialVersionUID = 1L; // recommended
	private static SingleTonLazyLoading singleton=null;
	private SingleTonLazyLoading() {
		if (singleton != null) {
	        throw new IllegalStateException("Instance already created!");
	    }
	}
	public static SingleTonLazyLoading getInstance() {
		if(singleton==null) {
			synchronized (SingleTonLazyLoading.class) {
				singleton=new SingleTonLazyLoading();
			}
		}
		return singleton;
	}
	public Object readResolve() {
		return getInstance();
	}

}
