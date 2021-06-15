import javax.swing.JOptionPane;
class ShutdownSys {
	

public static void ShutdownSys()
{
  try {
            String command;
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("linux") || os.contains("mac os x"))
                command = "shutdown -h now";
            else if (os.contains("windows"))
                command = "shutdown /p";
            else
                throw new Exception("Unsupported operating system.");
            
            Runtime.getRuntime().exec(command);
            System.exit(0);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
}
public static void main(String[] om){
	ShutdownSys.ShutdownSys();
}
}