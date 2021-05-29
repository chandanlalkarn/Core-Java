package om.singleton1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationNormalEx1 {
	
	public static void main(String[] om) {
		SerializationNormalEx1 SNDeSerial1 = null;
		SerializationNormalEx1 SNDeSerial2 = null;
		String filename = "C:\\om\\EclipsePrograms\\SerializationNormalfile.ser";
		// Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
              
            // Method for deserialization of object
            SNDeSerial1 = (SerializationNormalEx1)in.readObject();
          //  SNDeSerial2 = (SerializationNormalEx1)in.readObject();
            
              
            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            System.out.println("Ref of object 1st time "+SNDeSerial1);
            System.out.println("a = " + SNDeSerial1.a);
            System.out.println("b = " + SNDeSerial1.b);
            
        /*
            System.out.println("Ref of object 2nd time "+SNDeSerial2);
            System.out.println("a = " + SNDeSerial2.a);
            System.out.println("b = " + SNDeSerial2.b);
            */
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
		
	}

}
