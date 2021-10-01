package com.example.khoaservice.service;

import com.example.khoaservice.entity.Department;
import com.example.khoaservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department derpartment) {
        log.info("Inside saveDepartment of Service! ");
        return departmentRepository.save(derpartment);
    }

    public Department findDeparmentById(Long departmentId) {
        log.info("inside findDeparmentById ");
        return departmentRepository.findById(departmentId).get();
    }
}
