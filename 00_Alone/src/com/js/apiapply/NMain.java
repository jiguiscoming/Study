package com.js.apiapply;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NMain {
	public static void main(String[] args) {
		
		Scanner k = null;
		HttpsURLConnection huc = null;
		
		try {
			
			k = new Scanner(System.in);
			System.out.println("검색어 : ");
			String str = k.next();
			
			str = URLEncoder.encode(str, "utf-8");
			
			String url = "https://openapi.naver.com/v1/search/movie.json";
			url += "?query=" + str;
			
			URL u = new URL(url);
			huc = (HttpsURLConnection) u.openConnection();
			
			huc.addRequestProperty("X-Naver-Client-Id", "UJANOt01FrbCmVQ5vRZT");
			huc.addRequestProperty("X-Naver-Client-Secret", "H55dNcW_TJ");
			
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			JSONParser jp = new JSONParser();
			
			JSONObject naverData = (JSONObject) jp.parse(isr);
			
			JSONArray items = (JSONArray) naverData.get("items");
			
			for (int i = 0; i < items.size(); i++) {
				JSONObject item = (JSONObject) items.get(i);
				String title = item.get("title")+"";
				title = title.replace("<b>", "");
				title = title.replace("</b>","");
				String director = item.get("director") + "";
				String actor = item.get("actor") + "";
				String pubData = item.get("pubDate") + "";
				
				System.out.println("영화제목	: " + title);
				System.out.println("감독	: " + director);
				System.out.println("배우	: " + actor);
				System.out.println("개봉연도	: " + pubData);
				System.out.println("========================");
				
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
