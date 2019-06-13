package com.tjxcgt.ly.util;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

public class BaseController {

	/**
	 * 将对象转换成JSON字符串，并响应回前台
	 * 
	 * @param object
	 * @throws IOException
	 */
	protected void writeJson(Object object, HttpServletResponse response) {
		try {
			String json = JSON.toJSONStringWithDateFormat(object,
					"yyyy-MM-dd HH:mm:ss").replaceAll("\t", " ");
			response.setContentType("text/html;charset=utf-8");
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Access-Control-Allow-Methods", "POST");
			response.setHeader("Access-Control-Allow-Headers",
					"x-requested-with,content-type");
			response.getWriter().write(json.replaceAll("\\\\r\\\\n", "<br/>").replaceAll("\\r\\n", "<br/>"));
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void writeJson(Object object, HttpServletResponse response,String format) {
		try {
			String json = JSON.toJSONStringWithDateFormat(object,
					format).replaceAll("\t", " ");
			response.setContentType("text/html;charset=utf-8");
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Access-Control-Allow-Methods", "POST");
			response.setHeader("Access-Control-Allow-Headers",
					"x-requested-with,content-type");
			response.getWriter().write(json.replaceAll("\\\\r\\\\n", "<br/>").replaceAll("\\r\\n", "<br/>"));
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
