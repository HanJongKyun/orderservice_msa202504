package com.playdata.userservice.common.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

public class EmailConfig {

    @Value( "${spring.mail.host}")
    private String host;
    @Value( "${spring.mail.port}")
    private String port;
    @Value( "${spring.mail.username}")
    private String username;
    @Value( "${spring.mail.password}")
    private String password;
    @Value( "${spring.mail.properties.mail.smtp.auth}")
    private boolean auth;
    @Value( "${spring.mail.properties.mail.smtp.starttls.enable}") // 구글
    private String starttlsEnable; // 구글
//    @Value("${spring.mail.properties.mail.smtp.ssl.enable}")  // 네이버
//    private boolean sslEnable;
//    @Value( "${spring.mail.properties.mail.smtp.ssl.trust}") // 네이버
//    private String sslTrust;

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(host);
        mailSender.setPort(Integer.parseInt(port));
        mailSender.setUsername(username);
        mailSender.setPassword(password);
        mailSender.setDefaultEncoding("UTF-8");

        // 기타 보안 전송 및 전송 방식에 대한 사항은 Properties 객체 형태로 전달.
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", auth);
        properties.put("mail.smtp.starttls.enable", starttlsEnable); // (구글)
//        properties.put("mail.smtp.ssl.enable", sslEnable); // (네이버)
//        properties.put("mail.smtp.ssl.trust", sslTrust); // (네이버)


        mailSender.setJavaMailProperties(properties);

        return mailSender;
    }

}
