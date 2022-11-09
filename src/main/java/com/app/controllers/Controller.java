package com.app.controllers;

import com.app.threads.Thread1Service;
import com.app.threads.Thread2Service;
import com.app.threads.Thread3Service;
import com.app.threads.Thread4Service;
import com.app.threads.Thread5Service;
import com.app.threads.Thread6Service;

public class Controller {
	/**
	 * スレッド単純実行
	 * @param args
	 */
	public void excute1(String[] args) {
		Thread1Service t1 = new Thread1Service();
		t1.start();
		
		Thread2Service t2 = new Thread2Service();
		t2.start();
	}
	
	/**
	 * スレッド順番実行
	 * @param args
	 */
	public void excute2(String[] args) {
		try {
			Thread1Service t1 = new Thread1Service();
			Thread2Service t2 = new Thread2Service();
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	/**
	 * スレッドRunnable実装
	 * @param args
	 */
	public void excute3(String[] args) {
		try {
			Thread3Service t3 = new Thread3Service();
			Thread4Service t4 = new Thread4Service();			
			Thread thread3 = new Thread(t3);
			Thread thread4 = new Thread(t4);
			thread3.start();
			thread3.join();
			thread4.start();
			thread4.join();
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	/**
	 * スレッド例外実装
	 * @param args
	 */
	public void excute4(String[] args) {
		try {
			Thread5Service t5 = new Thread5Service();
			Thread6Service t6 = new Thread6Service();			
			Thread thread5 = new Thread(t5);
			Thread thread6 = new Thread(t6);
			thread5.start();
			thread5.join();
			thread6.start();
			thread6.join();
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
