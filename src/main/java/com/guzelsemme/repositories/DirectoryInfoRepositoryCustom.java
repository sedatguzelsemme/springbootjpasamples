package com.guzelsemme.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

public interface DirectoryInfoRepositoryCustom {
	
	public List<Object> findByName(String name);
	
	@Query(value="select a from Announcement a")
	public List<Object> getAllAnnouncement();
}
