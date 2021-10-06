package it.unical.inf.asd.annotation.service;

import it.unical.inf.asd.annotation.bean.Employee;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
class EmployeeManagerImpl implements EmployeeManager {
 
    @Override
    public Employee create() {
        Employee emp =  new Employee();
        emp.setId(1);
        emp.setName("Lokesh");
        return emp;
    }

    //deleted in java 11: see pom.xml
    @PostConstruct
    public void onInit(){
        System.out.println("EmployeeManagerImpl Bean is Created !!");
    }
}