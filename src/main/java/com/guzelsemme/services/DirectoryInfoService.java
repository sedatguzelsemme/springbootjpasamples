package com.guzelsemme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guzelsemme.repositories.DirectoryInfoRepository;

@Service
public class DirectoryInfoService {

	@Autowired
	DirectoryInfoRepository directoryRepository;
	
	
	
	public void getAnnouncementListById(String name){
		directoryRepository.findByName(name);
	}
	
	
	public void getMahmutsService(){
		directoryRepository.getAllAnnouncement();
	}
	
}
