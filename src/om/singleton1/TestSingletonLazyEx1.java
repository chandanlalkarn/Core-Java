package om.singleton1;

public class TestSingletonLazyEx1 {
	
	public static void main(String[] om) {
		SingletonLazyEx1 slazy1 = SingletonLazyEx1.get_SingletonLazyEx1();
		slazy1.fun4();
		slazy1.fun4();
	}

}
