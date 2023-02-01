package com.registration.registration.service;

import com.registration.registration.model.employees;

public interface EmployeeService {
    public String createregistration(employees registration);
    public employees getregistrationById(Integer id);
    public Iterable<employees> getAllregistrations();
    public employees updateregistrationById(Integer id, employees registration);
    public employees deleteregistrationById(Integer id);
}