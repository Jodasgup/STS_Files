package com.springboot.ms.admissionservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.ms.admissionservice.model.DiseaseList;
import com.springboot.ms.admissionservice.model.EmployeeslList;
import com.springboot.ms.admissionservice.model.Patient;

@RestController
@RequestMapping("/admissions")
public class AdmissionResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	List<Patient> patients = Arrays.asList(
			
			new Patient("P1", "Rahul", "India"),
			new Patient("P2", "John", "Denmark"),
			new Patient("P3", "Rose", "America")
			);
	@RequestMapping("/physicians")
	public EmployeeslList getPhysicians() {
		EmployeeslList employeesList = restTemplate.getForObject("http://localhost:8082/hr/employees", EmployeeslList.class);
	
	    return employeesList;
	}
	@RequestMapping("/diseases")
	public DiseaseList getDiseases() {
		DiseaseList diseasesList = restTemplate.getForObject("http://localhost:8083/pathology/diseases", DiseaseList.class);
	
	    return diseasesList;
	}


	@RequestMapping("/patients")
	public List<Patient> getPatients(){
				
				
				return patients;
				
		
	}
	@RequestMapping("/patients/{Id}")
	public Patient getPatientById(@PathVariable("Id") String Id) {
		
		Patient p = patients.stream()
				.filter(patient -> Id.equals(patient.getId()))
                .findAny()
                .orElse(null);
                return p;
                
	}
}
