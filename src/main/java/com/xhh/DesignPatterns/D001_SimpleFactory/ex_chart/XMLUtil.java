package com.xhh.DesignPatterns.D001_SimpleFactory.ex_chart;

import javax.xml.parsers.*;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
 
/**
 * @author PengHui
 */
public class XMLUtil {
	/**
	 * 该方法用于从XML配置文件中提取图表类型，并返回类型名
	 * @return
	 */
	public static String getChartType() {
		try {
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Resource resource = new ClassPathResource("config.xml");
			Document doc = builder.parse(resource.getFile());

			//获取包含图表类型的文本节点
			NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(0).getFirstChild();
			return classNode.getNodeValue().trim();
        }   
       	catch(Exception e) {
           	e.printStackTrace();
        	return null;
        }
    }
}