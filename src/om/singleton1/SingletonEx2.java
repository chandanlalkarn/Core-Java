package om.singleton1;

public class SingletonEx2 {
	
	//instance should be static and private 
	private static SingletonEx2 ex21 = new SingletonEx2();
	
	//constructor should be private
	private SingletonEx2() {
		
	}
	
	//static method to access the instance of object
	
	public static SingletonEx2 get_SingletonEx2_Instance() {
		return SingletonEx2.ex21;
	}
	
	public void fun21() {
		System.out.println(get_SingletonEx2_Instance());
	}

}
