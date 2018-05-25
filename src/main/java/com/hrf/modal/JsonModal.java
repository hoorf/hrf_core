package com.hrf.modal;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

@SuppressWarnings("serial")
public class JsonModal extends MapModal {

	public String toJsonString() {
		return JSONObject.toJSONString(this, SerializerFeature.WriteDateUseDateFormat,
				SerializerFeature.DisableCircularReferenceDetect);
	}

}
