package org.sopt.Service;

import org.sopt.model.Department;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public interface DepartmentService {
    Department getByDepartmentName(final String departmentName);
}
