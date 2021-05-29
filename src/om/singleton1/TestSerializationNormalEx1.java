package om.singleton1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializationNormalEx1 {
	
	public static void main(String[] om) {
	
	SerializationNormalEx1 SerializeN1 = new SerializationNormalEx1();
	String filename = "C:\\om\\EclipsePrograms\\SerializationNormalfile.ser";
    
    // Serialization 
    try
    {   
        //Saving of object in a file
        FileOutputStream file = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(file);
          
        // Method for serialization of object
        out.writeObject(SerializeN1);
          
        out.close();
        file.close();
          
        System.out.println("Object has been serialized");

    }
      
    catch(IOException ex)
    {
        System.out.println("IOException is caught");
    }
	}
}
