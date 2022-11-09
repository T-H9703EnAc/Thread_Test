package com.app.controllers;

import com.app.threads.Thread1Service;
import com.app.threads.Thread2Service;

public class Controller {
	public void run(String[] args) {
		Thread1Service t1 = new Thread1Service();
		t1.start();
		
		Thread2Service t2 = new Thread2Service();
		t2.start();
	}
}
