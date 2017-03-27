package com.gilmour;

import junit.framework.TestCase;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by alicana on 27/03/2017.
 */
public class PasswordHash extends TestCase {

	public void testBcryptHash(){
		String password = "wick";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		System.out.println(hashedPassword);
	}

	public void testMD5Hash() {
		String password = "wick";
		Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
		String hashedPassword = passwordEncoder.encodePassword(password, null);
		System.out.println(hashedPassword);
	}
}
