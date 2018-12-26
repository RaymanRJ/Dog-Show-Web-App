package ca.sheridancollege.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import ca.sheridancollege.beans.BreedBean;
import ca.sheridancollege.beans.ListBean;
import ca.sheridancollege.dao.DAO;
import ca.sheridancollege.enums.DogGender;
import ca.sheridancollege.enums.DogGroup;
import ca.sheridancollege.enums.DogSpecialty;

public class DogGroupMap {
	
	public static HashMap<DogGroup, ArrayList<BreedBean>> getDogGroupMap() {
		
		HashMap <DogGroup, ArrayList<ListBean>> dogMap = new HashMap<>();
		String[] breeds;
		ArrayList<ListBean> dogList;
				
		for(DogGroup dg: DogGroup.values()) {
			breeds = DAO.get("select distinct dogbreed from dogs where doggroup='" + dg.toString() + "'");
			dogList = new ArrayList<>();
					
			for(String db : breeds) {
						
				for(DogGender dgn : DogGender.values()) {
							
					for(DogSpecialty ds : DogSpecialty.values()) {
						String query = "select * from dogs where doggroup = '"
								+ dg.toString() + "' and dogbreed = '"
								+ db + "' and doggender = '"
								+ dgn.toString() + "' and dogclassspeciality = '"
								+ ds.toString() + "'";
										
						dogList.addAll(DAO.getListBeans(query));
					}
				}
			}

			dogMap.put(dg, dogList);
		}
		
		ArrayList<BreedBean> breedBeanList;
		ArrayList<String> breedList;
		HashMap<DogGroup, ArrayList<BreedBean>> dogGroupMap = new HashMap<>();
				
		for(DogGroup dg : dogMap.keySet()) {
			breedBeanList = new ArrayList<>();
			breedList = new ArrayList<>();
			
			for(ListBean lb : dogMap.get(dg)) {
				breedList.add(lb.getBreed());
				Set<String> hs = new HashSet<>();
				hs.addAll(breedList);
				breedList.clear();
				breedList.addAll(hs);
			}
					
			BreedBean bb;
			for(String breed : breedList) {
						
				bb = new BreedBean();
				bb.setBreed(breed);
					
				for(ListBean lb : dogMap.get(dg)) {
					if(lb.getBreed().equals(breed)) {
						if(lb.getGender() == DogGender.MALE) {
							if(lb.getSpecialty() == DogSpecialty.CLASS) {
								bb.incrementMlClss();
							}else {
								bb.incrementMlSpcl();
							}
						}else {
							if(lb.getSpecialty() == DogSpecialty.CLASS) {
								bb.incrementFmlClss();
							}else {
								bb.incrementFmlSpcl();
							}		
						}
					}
				}
						
				breedBeanList.add(bb);
			}
					
			dogGroupMap.put(dg, breedBeanList);
		}
		
		return dogGroupMap;
	}
}
