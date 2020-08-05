package util;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class MailSend {
//	public static void main(String[] args) {
//		try {
//			sendMail("1543018407@qq.com", "这里填写邮箱的是具体内容，可以嵌套" );
//		} catch (AddressException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MessagingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
		public static void sendMail(String email, String code)
	            throws AddressException, MessagingException {
			// 1.创建连接对象javax.mail.Session
	        // 2.创建邮件对象 javax.mail.Message
	        // 3.发送一封激活邮件
	        String from = "756859752@qq.com";// 发件人电子邮箱
	        String host = "smtp.qq.com"; // 指定发送邮件的主机smtp.qq.com(QQ)|smtp.163.com(网易)
	 
	        Properties properties = System.getProperties();// 获取系统属性
	 
	        properties.setProperty("mail.smtp.host", host);// 设置邮件服务器
	        properties.setProperty("mail.smtp.auth", "true");// 打开认证
	        properties.setProperty("mail.smtp.port", "587");//设置端口
	        properties.setProperty("mail.smtp.socketFactory.port", "587");//设置ssl端口
//	        properties.setProperty("mail.smtp.socketFactory.fallback", "false");
//	        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	 
	        try {
	            //QQ邮箱需要下面这段代码，163邮箱不需要
	            MailSSLSocketFactory sf = new MailSSLSocketFactory();
	            sf.setTrustAllHosts(true);
	            properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//	            properties.put("mail.smtp.ssl.enable", "true");
	            properties.put("mail.smtp.ssl.socketFactory", sf);
	            
	 
	            // 1.获取默认session对象
	            Session session = Session.getDefaultInstance(properties, new Authenticator() {
	                public PasswordAuthentication getPasswordAuthentication() {
	                    return new PasswordAuthentication("756859752@qq.com", "wdidaceiujmubede"); // 发件人邮箱账号、授权码
	                }
	            });
	 
	            // 2.创建邮件对象
	            Message message = new MimeMessage(session);
	            // 2.1设置发件人
	            message.setFrom(new InternetAddress(from));
	            // 2.2设置接收人
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
	            // 2.3设置邮件主题
	            message.setSubject("账号激活");
	            // 2.4设置邮件内容
	            String content = "<html><head></head><body><h1>这是一封kere验证邮件,详情请点击以下链接</h1><h3><a href='http://localhost:8082/Kere_web_server/index.jsp"
	                    + code + "'>http://localhost:8080/Kere_web_server"
	                    + "</href><p>验证码:   "+code+"</p></h3></body></html>";
	            message.setContent(content, "text/html;charset=UTF-8");
	            // 3.发送邮件
	            Transport.send(message);
	            System.out.println("邮件成功发送!");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
		public static String getNumberStr(int len){
			if(len<0){
				return null;
			}
			String numberStr="";
			Random r = new Random();
			for(int i=0;i<len;i++){
				Integer a=r.nextInt(10);
				numberStr+=a.toString();
			}
			return numberStr;
		}
}
