package com;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class Sendmail {

    public static void main(String []args)
    {
        String recive="haoruipeng@hccl.ioa.ac.cn";
        String send="haoruipeng@hccl.ioa.ac.cn";
        String host="hccl.ioa.ac.cn";
        Properties properties=System.getProperties();
        properties.setProperty("mail.smtp.host",host);

        Session session=Session.getDefaultInstance(properties);

        try{
            MimeMessage message=new MimeMessage(session);

            message.setFrom(new InternetAddress(send));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(recive));

            message.setSubject("this is test");
            message.setText("This is a message");
            Transport.send(message);
            System.out.println("Sent message successfully....");

        }catch (MessagingException e)
        {
               e.printStackTrace();
        }
    }
}
