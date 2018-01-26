package com.guzelsemme.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DirectoryInfoRepositoryCustomImpl implements DirectoryInfoRepositoryCustom {
	@PersistenceContext
    private EntityManager em;

    //custom method implementation
    public List<Object> findByName(String name) {
        List<Object> list = em.createNativeQuery("select * from K_ANONS").getResultList();
        return list;
    }

	@Override
	public List<Object> getAllMahmuts() {
		// TODO Auto-generated method stub
		return null;
	}
}
