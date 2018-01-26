package com.guzelsemme.controllers;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.guzelsemme.services.DirectoryInfoService;

@RestController
public class AboutController {
	
	@Autowired
	DirectoryInfoService directoryService;
	
	@RequestMapping("/")
	public ResponseEntity<String> getIndex() throws JSONException, JsonParseException, JsonMappingException, IOException {
		
		String jsonObj="{\"arr\":[{\"ADI\":\"AHMET\"}]}";
		
		String jsonArray="[{\"ADI\":\"AHMET\"}]";
		
		System.out.println(jsonArray);
		
		Object json = new JSONTokener(jsonArray).nextValue();
		
		System.out.println(json instanceof JSONObject);
		
		System.out.println(json instanceof JSONArray);
		
		directoryService.getAnnouncementListById("name");
		
		
		directoryService.getMahmutsService();
		
		return ResponseEntity.status(HttpStatus.OK).body("Allah Irazı olsun...");
	}
	
	
	@RequestMapping("/about")
	public String getAbout() {
		return "Hello World... just for now...";
	}
}
