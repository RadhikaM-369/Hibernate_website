package com.xworkz.assign.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.assign.entity.WebsiteEntity;
import com.xworkz.assign.util.EMFUtil;

public class WebsiteImpl implements WebsiteInterf{

	@Override
	public void save(WebsiteEntity webEntity) {

		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
				
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction trans=entityManager.getTransaction();
		
		trans.begin();
		entityManager.persist(webEntity);
		trans.commit();
	}

	public void putAll(List<WebsiteEntity> entity) {
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		
		EntityTransaction trans=manager.getTransaction();
		trans.begin();
		int flushcount=0;
		
							
			try {
				for(WebsiteEntity webEntity:entity) {
					manager.persist(webEntity);
					if(flushcount==10) {
						manager.flush();
						flushcount=0;
						manager.clear();
					}
					manager.flush();
					flushcount++;
				}
			} 
			catch (PersistenceException e) {
				e.printStackTrace();
				trans.rollback();
			}
			trans.commit();
		}
	
	
	}