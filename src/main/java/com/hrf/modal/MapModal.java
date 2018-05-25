package com.hrf.modal;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class MapModal implements Serializable {
	public Map<String, Object> toMap() {
		Map<String, Object> result = new HashMap<>();
		Class<?> clazz = getClass();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor descriptor : propertyDescriptors) {

				Method readMethod = descriptor.getReadMethod();
				if (readMethod != null) {
					try {
						result.put(descriptor.getName(), readMethod.invoke(this));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return result;
	}

}
