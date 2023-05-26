package modelo;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    public static void main(String[] args) {
        // Información de autenticación
        final String username = "soportetucarrouniquindio@gmail.com\n";
        final String password = "123456Tucarro$";

        // Información del correo electrónico
        String to = "destinatario@dominio.com";
        String subject = "Asunto del correo";
        String body = "Contenido del correo electrónico.";

        // Configuración de la conexión SMTP
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Creación de la sesión SMTP
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Creación del mensaje
            Message message = new MimeMessage(session);
             message.setFrom(new InternetAddress(username));
             message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
             message.setSubject(subject);
             message.setText(body);

            // Envío del mensaje
            Transport.send(message);

            System.out.println("El mensaje se ha enviado exitosamente.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}