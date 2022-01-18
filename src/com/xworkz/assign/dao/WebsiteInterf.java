package com.xworkz.assign.dao;

import java.util.List;

import com.xworkz.assign.entity.WebsiteEntity;

public interface WebsiteInterf {
	
public void save(WebsiteEntity webEntity);
public void putAll(List<WebsiteEntity> entity);
}
