package towinterfacewithsamedwfaultmethod;

public class VariableArgument {
	
	public static void main(String ...args) {
		System.out.println("Main Method..");
		print("Mukesh", "fukesh","lukesh","sukesh");
		String arr[]= {"m","u","k"};
		print("Mukesh",arr );
		
//		try {
//			System.out.println(5/0);
//			System.out.println("try");
//			System.exit(0);
//			return;
//		} catch (Exception e) {
//			System.out.println("catch");
//			System.exit(0);
//			return;
//		}finally {
//			System.out.println("finally");
//			return;
//		}
	}
	
private static void print(String first,String ...num) {
	System.out.println(first);
	for(String s:num) {
		System.out.println(s);
	}
}
}
