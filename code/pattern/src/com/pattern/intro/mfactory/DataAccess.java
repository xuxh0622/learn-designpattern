package com.pattern.intro.mfactory;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DataAccess {
	//解析获取数据库连接
	private static String DB;
	
	static{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = dbf.newDocumentBuilder();
			Document doc = builder.parse(new File("src/app.xml"));
			Element root = doc.getDocumentElement();
			if(root != null){
				NodeList nodeList = root.getElementsByTagName("add");
				DB = nodeList.item(0).getAttributes().getNamedItem("value").getNodeValue();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//获取对象
	public static IDepartment createDepartment(){
		IDepartment obj = null;
		try {
			Class c = Class.forName("com.pattern.intro.mfactory." + DB + "Department");
			obj = (IDepartment)c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
