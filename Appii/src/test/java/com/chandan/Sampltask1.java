package com.chandan;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sampltask1 {
	public static void main(String[] args)throws ParseException, IOException {
		// Mention the path of the JSON file
		FileReader reader=new FileReader("C:\\Users\\Nishu\\eclipse-workspace111new\\Appii\\src\\test\\resources\\Fold\\Employee.json");
	//create object for jsonparser class
		
	JSONParser jsonparser = new JSONParser();
	
	// pass the Json file to fetch values from json
	Object obj=jsonparser.parse(reader);
	//CONVERT OBJECT TO JSONOBJECT-->CLASSCAST
	JSONObject j = (JSONObject)obj;
	Object objData =j.get("data");
	System.out.println(objData);
	
	Object objemail =j.get("email");
	System.out.println(objemail);
	
	Object objphoneNo=j.get("PhoneNo");
	System.out.println(objphoneNo);
	
	//Long phoneNo = (Long) objphoneNo;
	//System.out.println(phoneNo);
	
	Object objAddress=j.get("address");
	JSONObject jAddress = (JSONObject)objAddress;
	System.out.println(jAddress);
	
	Object objDist=jAddress.get("Street");
	System.out.println(objDist);
	Object objStreet=jAddress.get("District");
	System.out.println(objStreet);
	}
}
