package Morethread;


import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * FileName		:com.rock 	Client.java
 * TODO			:
 * Copyright	:Copyright (c) 2015-2016 All Rights Reserved. Company: 01skill-soft.com Inc.
 * @author: 	:Rock
 * @Date		:2019年2月18日:下午3:59:19
 * @version 	:1.0
 * 
 *           Modification History: Date			Author 		Version 	Description
 *           ----------------------------------------------------------------------
 *           					   2019年2月18日 	Rock 		1.0 		1.0 Version
 * 
 */
public class Client {
	public static void main(String[] args) {
		try {
			Socket client=new Socket("192.168.36.48",6645);
			DataOutputStream out=new DataOutputStream(client.getOutputStream());
			
			out.writeUTF(new Scanner(System.in).next());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
