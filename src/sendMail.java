import java.text.SimpleDateFormat;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class sendMail {

	public static void sendGMail() {
		// Setting up configurations for the email connection to the Google SMTP server
		// using TLS
		Properties props = new Properties();
		props.put("mail.smtp.host", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		// Establishing a session with required user details
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("<From Mail id>", "<Password of Mail>");
			}
		});

		// 2) compose message try {
		// Creating a Message object to set the email content

		try {
			MimeMessage msg = new MimeMessage(session);
			// Storing the comma seperated values to email addresses
			String to = "<To email>";
			/*
			 * Parsing the String with defualt delimiter as a comma by marking the boolean
			 * as true and storing the email addresses in an array of InternetAddress
			 * objects
			 */
			InternetAddress[] address = InternetAddress.parse(to, true);

			// Setting the recepients from the address variable
			msg.setRecipients(Message.RecipientType.TO, address);
			String timeStamp = new SimpleDateFormat("yyyymmdd_hh-mm-ss").format(new Date());
			msg.setSubject("Sample Mail : " + timeStamp);
			msg.setSentDate(new Date());
			msg.setText("Sampel System Generated mail");

			// 3) create MimeBodyPart object and set your message text
			BodyPart messageBodyPart1 = new MimeBodyPart();
			messageBodyPart1.setText("<Body of the mail>");

			MimeBodyPart messageBodyPart2 = new MimeBodyPart();

			String filename = "<File path which you would like to share>";// change accordingly
			DataSource source = new FileDataSource(filename);
			messageBodyPart2.setDataHandler(new DataHandler(source));
			messageBodyPart2.setFileName(filename);

			// 5) create Multipart object and add MimeBodyPart objects to this object
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart1);
			multipart.addBodyPart(messageBodyPart2);

			msg.setHeader("XPriority", "1");
			msg.setContent(multipart);

			Transport.send(msg);

			System.out.println("Mail has been sent successfully");
		} catch (MessagingException mex) {
			System.out.println("Exception :" + mex);
		}
	}

	public static void main(String[] args) {
		sendGMail();
	}

}
