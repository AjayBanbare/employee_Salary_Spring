package com.registration.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registration.registration.model.employees;
import com.registration.registration.service.EmployeeService;

@RestController
public class employeecontroller {
    @Autowired 
    private EmployeeService registrationservice;
    @CrossOrigin
    @PostMapping("/registrations")
    public ResponseEntity<String>createRegistration(@RequestBody employees registration){
        String status = registrationservice.createregistration(registration);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @CrossOrigin
    @GetMapping("/registrations/{id}")

    public ResponseEntity<employees> getRegistrationById(@PathVariable Integer id){
        employees status = registrationservice.getregistrationById(id);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @CrossOrigin
    @GetMapping("/registrations")
    public ResponseEntity<Iterable<employees>> getAllregistrations(){
        Iterable<employees> status = registrationservice.getAllregistrations();
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
    @CrossOrigin
    @PutMapping("/registrations/{id}")
    public ResponseEntity<employees> updateRegistration(@PathVariable Integer id,@RequestBody employees registrations){
        employees status = registrationservice.updateregistrationById(id,registrations);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @CrossOrigin
    @DeleteMapping("/registrations/{id}")
    public ResponseEntity<employees> deleteStudentById(@PathVariable Integer id){
        employees status = registrationservice.deleteregistrationById(id);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
}

