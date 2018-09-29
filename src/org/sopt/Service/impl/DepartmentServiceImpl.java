package org.sopt.Service.impl;

import org.sopt.Service.DepartmentService;
import org.sopt.model.Department;
import org.sopt.model.builder.DepartmentBuilder;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public Department getByDepartmentName(String departmentName) {
        DepartmentBuilder departmentBuilder = new DepartmentBuilder();
        return departmentBuilder.build();
    }
}
