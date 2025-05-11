package singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SingleTonLazyLoading instance1 = SingleTonLazyLoading.getInstance();
		//serilizing the object
		File file = new File("singleton.ser");
		if(!file.exists()) {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
			oos.writeObject(instance1);
			oos.close();
		}
		
		//deserilizion  (
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
		SingleTonLazyLoading instance2=(SingleTonLazyLoading)ois.readObject();
		ois.close();
		System.out.println(instance1);
		System.out.println(instance2);
		
	}
}
