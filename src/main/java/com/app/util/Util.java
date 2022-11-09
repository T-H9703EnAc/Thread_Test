package com.app.util;

public class Util {
	public static String getCurrentClassName() {
		return  Thread.currentThread().getStackTrace()[2].getClassName() ;
	}
}
