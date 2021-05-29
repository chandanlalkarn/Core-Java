package om.singleton1;

public class SingletonEx1 {
	
	static int x=10;
	static int y=20;
	
	void fun1(int x,int y) {
		++x;
		y++;
		System.out.println("x>>"+x+":"+"y>>"+y);
	}
	
	 void fun2() {
		++x;
		y++;
		System.out.println("x>>"+x+":"+"y>>"+y);
	}

	public static void main(String[] om) {
	
		SingletonEx1 ex1 = new SingletonEx1();
		SingletonEx1 ex2 = new SingletonEx1();
		
		System.out.println("ex1>>"+ex1+"ex2>>"+ex2);
		
		ex1.fun1(x,y);
		ex2.fun1(x,y);
		
		ex1.fun2();
		ex2.fun2();
	}

}
