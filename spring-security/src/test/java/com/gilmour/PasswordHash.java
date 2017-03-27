package com.gilmour;

import junit.framework.TestCase;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

/**
 * Created by alicana on 27/03/2017.
 */
public class PasswordHash extends TestCase {

	public void testMD5Hash() {
		String password = "wick";
		Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
		String hashedPassword = passwordEncoder.encodePassword(password, null);
		System.out.println(hashedPassword);
	}
}
