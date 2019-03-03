package com.example.event.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.event.pojo.Data;
import com.example.event.util.Constant;
import com.google.gson.Gson;

@Service
public class ConnectionsServiceImpl {

	@Autowired
	private Gson gson;

	private final static String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:56.0) Gecko/20100101 Firefox/56.0";
	private static Logger logger = Logger.getLogger(ConnectionsServiceImpl.class.getName());

	public Data loadData(String queryParam) throws Exception {
		String url = Constant.BASE_URL + Constant.EVENTS_CATEGORY + queryParam;
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		// optional default is GET
		con.setRequestMethod("GET");
		con.setConnectTimeout(100000);
		con.setReadTimeout(100000);
		con.setRequestProperty("User-Agent", USER_AGENT);
		logger.info("\nSending 'GET' request to URL : " + url);
		int responseCode = con.getResponseCode();
		logger.info("POST Response Code :  " + responseCode);
		try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			return gson.fromJson(response.toString().trim(), Data.class);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
