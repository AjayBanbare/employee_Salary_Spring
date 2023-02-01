package com.registration.registration.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.registration.model.employees;
import com.registration.registration.repository.employeesrepository;
@Service
public class employeeserviceimpl implements EmployeeService{
    @Autowired
    private employeesrepository registrationrepository;

    public String createregistration(employees registration){
        registrationrepository.save(registration);
        return "success";
    }
    public employees getregistrationById(Integer id){
        Optional<employees> findById=registrationrepository.findById(id);
        if(findById.isPresent()){
            return findById.get();
        }
    
        return null;
    }
    public Iterable<employees> getAllregistrations(){
        return registrationrepository.findAll();
        
    }
    public employees updateregistrationById(Integer id, employees registration){
        Optional<employees> registrationToUpdateOptional=registrationrepository.findById(id);
        if (!registrationToUpdateOptional.isPresent()) {
            return null;
          }
         
          
          employees registrationToUpdate = registrationToUpdateOptional.get();
          employees updatedsregistrations = registrationrepository.save(registrationToUpdate);
          return updatedsregistrations;
        }
        public employees deleteregistrationById(Integer id) {
            Optional<employees> registrationsToDeleteOptional = registrationrepository.findById(id);
            if (!registrationsToDeleteOptional.isPresent()) {
              return null;
            }
            employees registrationToDelete = registrationsToDeleteOptional.get();
            registrationrepository.delete(registrationToDelete);
            return registrationToDelete;
          }
    }