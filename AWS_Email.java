    import java.util.Properties;
    import javax.mail.Message;
    import javax.mail.Multipart;
    import javax.mail.Session;
    import javax.mail.Transport;
    import javax.mail.internet.InternetAddress;
    import javax.mail.internet.MimeBodyPart;
    import javax.mail.internet.MimeMessage;
    import javax.mail.internet.MimeMultipart;
    public class AWS_Email {
    public static void main(String[] args) throws Exception {
    


         String FROM = "chandan.lalkarn@gmail.com";
         String FROMNAME = "Chandan Lal Karn";
         
            

    String TO = "chankarn@in.ibm.com";

     // Replace smtp_username with your Amazon SES SMTP user name.

    String SMTP_USERNAME = "AKIA5LK2SL25QEPL6DY6";

     // Replace smtp_password with your Amazon SES SMTP password.

       String SMTP_PASSWORD = "BGE/cWfL84YUj0Bz8ny4yEpwoVMdbXwTm6WGGNVkJTvE";

     // Amazon SES SMTP host name. This example uses the US West (Oregon) region.

     // See https://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html#region-endpoints

     // for more information.

         String HOST = "feedback-smtp.us-east-1.amazonses.com";

       // The port you will connect to on the Amazon SES SMTP endpoint.

     // This port is used by STARTTLS to encrypt the email

         int PORT = 587;
         String SUBJECT = "Amazon SES mail test";
         String BODY =  "<h1>Amazon SES Mail</h1>" +
                 "<p> Cloud Academy - Cloud Training "
                 + "That Drives Digital Transformation </p> ";

     // Create a Properties object to contain connection configuration information.

    Properties props = System.getProperties();
      props.put("mail.transport.protocol", "smtp");
      props.put("mail.smtp.port", PORT);
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.auth", "true");

     // Create a Session object to represent a mail session with the specified properties.

        Session session = Session.getDefaultInstance(props);

     // Create a message with the specified information.

         MimeMessage msg = new MimeMessage(session);
         msg.setFrom(new InternetAddress(FROM,FROMNAME));
         msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
         msg.setSubject(SUBJECT);
         msg.setContent(BODY,"text/html");

     // Create a transport.

         Transport transport = session.getTransport();

     // Send the message.

         try
         {
             System.out.println("Sending...");

         // Connect to Amazon SES using the SMTP username and password you specified above.

    transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);

         // Send the email.

             transport.sendMessage(msg, msg.getAllRecipients());
             System.out.println("Email sent!");
         }
         catch (Exception ex) {
             System.out.println("The email was not sent.");
             System.out.println("Error message: " + ex.getMessage());
         }
         finally
         {

         // Close and terminate the connection.

             transport.close();
         }
    }
    }