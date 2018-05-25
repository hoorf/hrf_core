package com.hrf.utils.common;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
public class ObjectUtils {

	public static <T> T defalutValue(T source, T defalut) {
		if (isEmpty(source)) {
			return defalut;
		} else {
			return source;
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T firstNoNull(T... objs) {
		if (isNoEmpty(objs)) {
			for (T obj : objs) {
				if (isNoEmpty(obj)) {
					return obj;
				}
			}
		}
		return null;

	}

	public static boolean isEmpty(Object object) {
		if (null == object)
			return true;
		if (object instanceof String) {
			return ((String) object).length() == 0;
		}
		if (object instanceof Collection) {
			return ((Collection) object).isEmpty();
		}
		if (object instanceof Map) {
			return ((Map) object).isEmpty();

		}
		if (object.getClass().isArray()) {
			return Array.getLength(object) == 0;
		}
		return false;
	}

	public static boolean isNoEmpty(Object object) {
		return !isEmpty(object);
	}

	public static boolean isNumber(Object o) {
		if (o == null)
			return false;
		if (o instanceof Number) {
			return true;
		}
		if (o instanceof String) {
			String str = (String) o;
			if (str.length() == 0)
				return false;
			if (str.trim().length() == 0)
				return false;

			try {
				Double.parseDouble(str);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return false;
	}

}
