package com.packa;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {
public static void main(String[] args)throws ParseException, IOException {
	// Mention the path of the JSON file
	FileReader reader=new FileReader("C:\\Users\\Nishu\\eclipse-workspace111new\\Api\\src\\test\\resources\\FOLDER\\Employee.json");
//create object for jsonparser class
JSONParser jsonparser = new JSONParser();
// pass the Json file to fetch values from json
Object obj=jsonparser.parse(reader);
//CONVERT OBJECT TO JSONOBJECT-->CLASSCAST
JSONObject j = (JSONObject)obj;
Object objemail=j.get("email");
String email=(String)objemail;
System.out.println(email);
Object objphoneno=j.get("phoneno");
System.out.println(objphoneno);
}
}
