package om.singleton1;

public class SingletonLazyEx1 {
	
	int x=24;
	
	//Lazy instantiation when required its object is created
	private static SingletonLazyEx1 sLEx1 = null;
			
    private SingletonLazyEx1() {
		
	}
    
  public static SingletonLazyEx1 get_SingletonLazyEx1() {
	  
	  if(sLEx1 == null) {
		  sLEx1 = new SingletonLazyEx1();
	      }
	      return sLEx1;
  }
  
  public void fun4() {
	  System.out.println("ref of sLEx1 object>>"+sLEx1+":"+"value of x"+x);
  }
	
	

}
