package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<SingleTonLazyLoading> Constructor = SingleTonLazyLoading.class.getDeclaredConstructor();
		Constructor.setAccessible(true);
		SingleTonLazyLoading newInstance = Constructor.newInstance();
		System.out.println(newInstance);
	}

}
