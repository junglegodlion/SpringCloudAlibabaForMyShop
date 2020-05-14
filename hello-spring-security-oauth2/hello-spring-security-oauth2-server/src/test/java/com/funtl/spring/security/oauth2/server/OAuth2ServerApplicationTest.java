package com.funtl.spring.security.oauth2.server;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.Assert.*;

public class OAuth2ServerApplicationTest {

    @Test
    public void main() {
        System.out.println("123");
    }

    @Test
    public void testPasswordEncoder() {
        System.out.println(new BCryptPasswordEncoder().encode("admin888"));
    }
}
