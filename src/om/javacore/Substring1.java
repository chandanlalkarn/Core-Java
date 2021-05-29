package om.javacore;

public class Substring1 {
	
	public static void main(String[] om) {
		String mainString = "Shiv is everyting<>'+\\-&";
		String subString ="%";
		System.out.println(Substring1.isSubStringPresent(mainString, subString));
		
	}

	public static boolean isSubStringPresent(String mainStr,String substr) {
		return (mainStr.matches("(.*)"+substr+"(.*)"));
	}
}
