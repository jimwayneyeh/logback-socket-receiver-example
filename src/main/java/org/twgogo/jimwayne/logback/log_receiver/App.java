package org.twgogo.jimwayne.logback.log_receiver;

import java.security.SecureRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger("org.twgogo.jimwayne.logback.log_receiver");
		SecureRandom rand = new SecureRandom();
		log.info("Start log receiver.");
		
		while(true && !Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(750 + rand.nextInt(500));
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
