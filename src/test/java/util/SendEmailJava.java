package util;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import utility.PropertyManager;

public class SendEmailJava {

    private static PropertyManager properties = PropertyManager.getInstance();

    public static void sendEmail() throws EmailException {

        /******************************************************************************
         SENDING EMAIL WITHOUT ATTACHMENT
         *****************************************************************************/

        String emailAddressSetFrom = properties.setEmailAddressFrom();
        String emailAddressSetTo = properties.setEmailAddressTo();
        String emailUsername = properties.setUsernameEmailAccount();
        String emailPassword = properties.setPasswordEmailAccount();

        System.out.println("================ Start sending report to Email =================");

        Email email = new SimpleEmail();

        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(emailUsername, emailPassword));
        email.setStartTLSEnabled(true);
        email.setSSLOnConnect(true);
        email.setFrom(emailAddressSetFrom);
        email.setSubject("TEST REPORT");
        email.setMsg("TEST JOB IS COMPLETED ON JENKINS");
        email.getSentDate();
        email.addTo(emailAddressSetTo);

        email.send();

        System.out.println("========== Successfully send notification on Email address ===========");


        /******************************************************************************
         SENDING EMAIL WITH ATTACHMENT
         *****************************************************************************/

        /*
        String userDir = "/Users/ppopovic/Project/ProjectGeckoExample/";
        String attachmentPath = (userDir + "target/Report.zip");
        System.out.println("========== Start sending report to Email ===========");
        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath(attachmentPath);
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Picture of John");
        attachment.setName("John");
        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.sbb.rs");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator(emaillUsername, emailPassword));
        email.setStartTLSEnabled(true);
        email.setSSLOnConnect(false);
        email.addTo(emailAddressSetTo, "Predrag Popovic");
        email.setFrom(emailAddressSetFrom);
        email.setSubject("TEST REPORT");
        email.setMsg("TEST JOB IS COMPLETED ON JENKINS");
        // add the attachment
        email.attach(attachment);
        // send the email
        email.send();
        System.out.println("========== Successfully send report to Email ===========");
        */
    }
}
