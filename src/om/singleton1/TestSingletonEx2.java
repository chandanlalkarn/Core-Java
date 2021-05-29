package om.singleton1;

public class TestSingletonEx2 {
	
	public static void main(String[] om) {
		SingletonEx2.get_SingletonEx2_Instance().fun21();
		
		SingletonEx2.get_SingletonEx2_Instance().fun21();
		
		//can't access private members of class even though it is static
		//System.out.println(SingletonEx2.ex21);
		
		System.out.println(SingletonEx1.x);
		
	}

}
