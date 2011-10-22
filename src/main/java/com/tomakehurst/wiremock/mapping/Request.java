package com.tomakehurst.wiremock.mapping;

import com.tomakehurst.wiremock.http.RequestMethod;

public interface Request {

	String getUrl();
	RequestMethod getMethod();
	String getHeader(String key);
	boolean containsHeader(String key);
	String getBodyAsString();

}