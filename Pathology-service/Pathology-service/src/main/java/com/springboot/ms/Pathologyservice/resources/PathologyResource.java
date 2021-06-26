package com.springboot.ms.Pathologyservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ms.Pathologyservice.models.Disease;
import com.springboot.ms.Pathologyservice.models.DiseaseList;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {
	
	List<Disease> diseases = Arrays.asList( 
			new Disease("D1", "Ashma", "Warm water bath"),
			new Disease("D2", "Thyroid", "Ampicllin capsule")
			);
	@RequestMapping("/diseases")
	public DiseaseList getDisease() {
		
		DiseaseList diseasesList = new DiseaseList();
		diseasesList.setDiseases(diseases);
			
		
		
		return diseasesList;
	}
	@RequestMapping("/diseases/{Id}")
     public Disease getDiseaseById(@PathVariable("Id")String Id) {
    	 Disease d = diseases.stream()
    			 .filter(disease -> Id.equals(disease.getId()))
    			 .findAny()
    			 .orElse(null);
    	 return d;
    	 
     }
}
