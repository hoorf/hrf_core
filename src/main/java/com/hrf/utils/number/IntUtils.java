package com.hrf.utils.number;

public class IntUtils extends NumberUtils {

	public static int inverse(String str) {
		if (isNoneNumber(str)) {
			return getVal(str) * -1;
		}
		return 0;
	}

	public static int add(String... numbers) {
		int result = 0;
		for (String num : numbers) {
			if (!isNumber(num)) {
				result += getVal(num);
			}
		}
		return result;
	}

	public static int getVal(String str) {
		try {
			return Integer.valueOf(str);
		} catch (Exception e) {

		}
		return 0;
	}

	public static boolean isZero(String str) {
		return getVal(str) == 0;
	}

	public static boolean moreThanZero(String str) {
		return getVal(str) > 0;
	}

	public static boolean lessThanZero(String str) {
		return getVal(str) < 0;
	}

}
