package io.anusha.proxy.test;

import io.anusha.proxy.CommandExecutor;
import io.anusha.proxy.CommandExecutorProxy;



public class TestProxyPattern {

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}