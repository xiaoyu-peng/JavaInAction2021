package com.xhh.DesignPatterns.Structural_Model_7.D003_CompositePatterns.Demo003;

import java.util.List;

public interface DepartmentRepo {
    List<Long> getSubDepartmentIds(long id);
}
