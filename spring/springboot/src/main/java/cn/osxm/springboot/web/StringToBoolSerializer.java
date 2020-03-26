/**
 * @Title: StringToBoolSerializer.java
 * @Package cn.osxm.springboot.web
 * @Description: TODO
 * @author oscarchen
 * @date 2020��3��26��
 * @version V1.0
 */
package cn.osxm.springboot.web;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @ClassName: StringToBoolSerializer
 * @Description: TODO
 * @author oscarchen
 */
public class StringToBoolSerializer extends JsonSerializer<String> {

	@Override
	public void serialize(String str, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
			throws IOException {
		jsonGenerator.writeBoolean(str.equalsIgnoreCase("true"));
	}

}