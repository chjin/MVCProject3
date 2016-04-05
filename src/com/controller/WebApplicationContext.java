package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/*
 * MVC 프레임워크의 빈을 관리하기 위해 
 * 각 DispatcherServelt은 WebApplicationContext 루트내에 
 * 사전에 정의된 모든 빈을 가진 자신만의 WebApplicationContext를 가짐. 
 */
public class WebApplicationContext {
	//맵객체 생성
	private Map classMap=new HashMap();
	
	public WebApplicationContext(String path){
		
		//빈 객체를 xml로 설정해 놓았으므로 그 설정파일인 xml을 
		//WebApplicationContext 생성자에서 파싱함.
		try{
			//싱글톤 객체 생성
			SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
			SAXParser saxParser=saxParserFactory.newSAXParser();
			
			//컨트롤러 매핑 클래스는 따로 생성함.
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
}



























































