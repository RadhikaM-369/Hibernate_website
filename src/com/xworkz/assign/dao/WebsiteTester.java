package com.xworkz.assign.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.assign.entity.WebsiteEntity;

public class WebsiteTester {

	public static void main(String[] args) {
		List<WebsiteEntity> websiteE=new ArrayList<WebsiteEntity>();
		websiteE.add(new WebsiteEntity("Google.com", "LarryPage and SergeyBrin","https://www.google.com", 1998, ".com"));
		websiteE.add(new WebsiteEntity("Yahoo.com", "Jerryyang&David filo","https://www.yahoo.com", 1994, ".com"));
		websiteE.add(new WebsiteEntity("youtube", "Steven chen","https://www.youtube.com", 2005, ".com,.ae.al"));
		websiteE.add(new WebsiteEntity("facebook", "Mark Zukerberg","https://www.facebook.com",2004, ".com"));
		websiteE.add(new WebsiteEntity("kpsc", "gov of karnataka", "https://kpsc.kar.nic.in", 1970, ".co.in"));
		websiteE.add(new WebsiteEntity("Amazon", "Jeff Bezos", "https://www.amazon.in", 1994, ".com,.in"));
		websiteE.add(new WebsiteEntity("Wikipedia", "Bomis", "https://en.wikipedia.org", 2000, ".org"));
		websiteE.add(new WebsiteEntity("Flipcart", "Bansal", "https://www.flipkart.com", 2007, ".com"));
		websiteE.add(new WebsiteEntity("Linkedin", "Teid Hoffman", "http://www.linkedin.com",2003 ,".com"));
		websiteE.add(new WebsiteEntity("Stackoverflow", "Jeff Atwood&JoelSpolsky", "http://www.stackoverflow.com.com", 2008, ".com"));

		websiteE.add(new WebsiteEntity("Twitter", "Jack dorsey,noah glass", "http://www.twitter.com", 2006, ".com"));
		websiteE.add(new WebsiteEntity("Primevideo", "Amazon Inc", "https://www.amazon.com", 2006, ".com"));
		websiteE.add(new WebsiteEntity("Instagram", "Kevin systrom", "https://instagram.com", 2010, ".com"));
		websiteE.add(new WebsiteEntity("blogspot", "Evan Williams,Hourihan", "https://www.blogspot.com", 1999, ".com"));
		websiteE.add(new WebsiteEntity("Hdfcbank", "Antanu chakroborty", "http://www.hdfcbank.com",1994, ".com"));
		websiteE.add(new WebsiteEntity("Hotstar", "Sunil Rayan", "https://www.hotstar.com", 2015, ".com"));
		websiteE.add(new WebsiteEntity("iciciBank", "Government", "https://www.icici.com", 1955, ".com"));
		websiteE.add(new WebsiteEntity("netflix.com", "ReedHastings& MarcRandolph", "https://www.netflix.com", 0, ".com"));
		websiteE.add(new WebsiteEntity("jio.com", "Mukesh ambani", "http://www.jio.com",2007 , ".com"));
		websiteE.add(new WebsiteEntity("cowin.gov", "Government of India", "http://www.cowin.gov.in", 2021, ".in"));

		WebsiteInterf dao=new WebsiteImpl();
		dao.putAll(websiteE);
	}

}




/*WebsiteEntity Entity=( new WebsiteEntity("google.com", "abd", "www.google.com", 1990, ".com");
WebsiteInterf dao=new WebsiteImpl();
dao.save(Entity);*/