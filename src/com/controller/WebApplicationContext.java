package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/*
 * MVC �����ӿ�ũ�� ���� �����ϱ� ���� 
 * �� DispatcherServelt�� WebApplicationContext ��Ʈ���� 
 * ������ ���ǵ� ��� ���� ���� �ڽŸ��� WebApplicationContext�� ����. 
 */
public class WebApplicationContext {
	//�ʰ�ü ����
	private Map classMap=new HashMap();
	
	public WebApplicationContext(String path){
		
		//�� ��ü�� xml�� ������ �������Ƿ� �� ���������� xml�� 
		//WebApplicationContext �����ڿ��� �Ľ���.
		try{
			//�̱��� ��ü ����
			SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
			SAXParser saxParser=saxParserFactory.newSAXParser();
			
			//��Ʈ�ѷ� ���� Ŭ������ ���� ������.
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
}



























































