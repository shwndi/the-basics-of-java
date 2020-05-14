package com;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JsonBody {
	public static void main( String [] args) {
		Date date = new Date();
        long requestTime = date.getTime();
        int requestValidPeriod = 30;
		Map jsonBody = new HashMap();
        jsonBody.put("requestTime",requestTime);
        jsonBody.put("requestValidPeriod",requestValidPeriod);
        System.out.println(jsonBody);
	}

}
