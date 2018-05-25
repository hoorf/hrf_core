package com.hrf.utils.number;

public class NumberUtils {

	public static boolean isNumber(String str) {
		String reg = "^[0-9]+(.[0-9]+)?$";
		return str.matches(reg);
	}

	public static boolean isNoneNumber(String str) {
		return !isNumber(str);
	}

}
