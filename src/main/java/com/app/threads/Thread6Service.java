package com.app.threads;

import java.util.Objects;

import com.app.util.Util;

public class Thread6Service implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (Objects.equals(i, 5)) {
				throw new RuntimeException();
			}
			System.out.println(i + "回目：" + Util.getCurrentClassName());
		}

	}

}
