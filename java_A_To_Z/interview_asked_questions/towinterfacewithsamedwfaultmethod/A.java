package towinterfacewithsamedwfaultmethod;

public interface A {
	int a=10;
	void print();
	default void deafaultMethod() {
		System.out.println("I am Default Method from A");
	}
	static void staticMethod() {
		System.out.println("I am Static Method from A");
	}
	//we can have private method java 9 onwards is used to remove code duplication i.e helper method
//	private static void privateStatic() {
//		
//	}
}
