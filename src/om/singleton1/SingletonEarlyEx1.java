package om.singleton1;

public class SingletonEarlyEx1 {
	 int dna1 = 20;
	 
	
	// only 1 instance of a class will be created and not accessible outside the class due to private
	//access modifier and it is early Instantiation of an object 
	private static SingletonEarlyEx1 sEx1= new SingletonEarlyEx1();
	
	//private constructor restricts to create instance of an object outside of class
	private SingletonEarlyEx1() {
		
	}
	
	public static SingletonEarlyEx1 get_SingletonEarlyEx1() {
		return SingletonEarlyEx1.sEx1;
		
	}
	
	public void fun3() {
		System.out.println("value of dna1"+dna1);
	}
	
	

}
