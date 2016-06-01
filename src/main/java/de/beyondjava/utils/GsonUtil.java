package de.beyondjava.utils;

import com.google.gson.Gson;

public final class GsonUtil {

	
	public static String getGson(Object object){
		Gson gson = new Gson();
		return gson.toJson(object);
	}
	
}
