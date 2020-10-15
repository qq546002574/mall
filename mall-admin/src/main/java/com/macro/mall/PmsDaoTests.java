package com.macro.mall;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PmsDaoTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(PmsDaoTests.class);

    public static void main(String[] args) {
        PasswordEncoder passwordEncoder =  new BCryptPasswordEncoder();
        String encodePassword = passwordEncoder.encode("123456");
        System.out.println(encodePassword);
    }
}
