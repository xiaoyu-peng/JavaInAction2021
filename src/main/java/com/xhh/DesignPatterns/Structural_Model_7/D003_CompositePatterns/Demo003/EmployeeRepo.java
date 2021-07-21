package com.xhh.DesignPatterns.Structural_Model_7.D003_CompositePatterns.Demo003;

import java.util.List;

public interface EmployeeRepo {
    List<Long> getDepartmentEmployeeIds(long id);

    double getEmployeeSalary(Long employeeId);
}
