package com.app.threads;

import com.app.util.Util;

public class Thread3Service implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "回目：" + Util.getCurrentClassName());
		}
	}

}
