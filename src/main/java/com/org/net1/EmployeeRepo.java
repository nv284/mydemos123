package com.org.net1;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> { 

}

