package singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException, ClassNotFoundException {
	SingleTonLazyLoading instance1 = SingleTonLazyLoading.getInstance();
	SingleTonLazyLoading instance2 = SingleTonLazyLoading.getInstance();
	SingleTonEagerLoading instance3 = SingleTonEagerLoading.getInstance();
	SingleTonEagerLoading instance4 = SingleTonEagerLoading.getInstance();
	SingleTonEnum instance5 = SingleTonEnum.INSTANCE;
	SingleTonEnum instance6 = SingleTonEnum.INSTANCE;
	System.out.println(instance1);
	System.out.println(instance2);
	System.out.println(instance3);
	System.out.println(instance4);
	System.out.println(instance5);
	System.out.println(instance6);
 // Breaking SingleTon Using Reflection (To prevent we need to check if instance is not null throw exception
//	Constructor<SingleTonLazyLoading> Constructor = SingleTonLazyLoading.class.getDeclaredConstructor();
//	Constructor.setAccessible(true);
//	SingleTonLazyLoading newInstance = Constructor.newInstance();
//	System.out.println(newInstance);
	
	Constructor<SingleTonEagerLoading> Constructor = SingleTonEagerLoading.class.getDeclaredConstructor();
	Constructor.setAccessible(true);
	SingleTonEagerLoading newInstance = Constructor.newInstance();
	System.out.println(newInstance);
	//2. 
	File file = new File("singleton.ser");
	if(!file.exists()) {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		oos.writeObject(instance1);
		oos.close();
	}
	
	//deserilizion  (we can avid this by overriding readResolve method
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
//	SingleTonLazyLoading instanceDeLazyLoading=(SingleTonLazyLoading)ois.readObject();
//	ois.close();
//	System.out.println(instance1);
//	System.out.println(instanceDeLazyLoading);
	
	// by cloning(we can avoid not implementing clonebale interface
	//instance1.clone();
	
}

}
