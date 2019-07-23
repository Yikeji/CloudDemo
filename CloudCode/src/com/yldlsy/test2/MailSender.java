package com.yldlsy.test2;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class MailSender {
    private static MimeMessage message;

    public static void main(String[] args) {
        //你的SMTP服务器地址
        String smtpHost = "smtp.163.com";

        //发送者地址
        String from = "yldyyn@163.com";

        //收信者地址
        String to = "yldmac@163.com";


        Properties properties = new Properties();
        properties.put("mail.smtp.host",smtpHost);

        Session session = Session.getDefaultInstance(properties, null);
        try {
            InternetAddress[] addresses = {new InternetAddress()};

            //创建message对象
            message = new MimeMessage(session);
            //建造发件人位元址零件
            message.setFrom(new InternetAddress(from));
            //建造收件人位元址零件
            message.setRecipients(Message.RecipientType.TO,addresses);
            //建造主题零件
            message.setSubject("测试发送邮件");
            //建造发送时间零件
            message.setSentDate(new Date());
            //建造内容零件
            message.setText("你好吗？你收的到邮件吗？");

            //发送邮件相当于产品返还方法
            Transport.send(message);
            System.out.println("email成功发送");

        }catch (Exception e){

        }
    }
}
