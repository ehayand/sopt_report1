package org.sopt.model.builder;

import org.sopt.model.Department;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class DepartmentBuilder extends UniversityBuilder {
    protected Integer departmentIdx;
    protected String departmentName;
    protected String departmentTel;
    protected String departmentType;

    public DepartmentBuilder setDepartmentIdx(Integer departmentIdx) {
        this.departmentIdx = departmentIdx;
        return this;
    }

    public DepartmentBuilder setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    public DepartmentBuilder setDepartmentTel(String departmentTel) {
        this.departmentTel = departmentTel;
        return this;
    }

    public DepartmentBuilder setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
        return this;
    }

    @Override
    public Department build() {
        return new Department(super.universityIdx, super.universityName, super.universityTel, super.universityAddress,
                this.departmentIdx, this.departmentName, this.departmentTel, this.departmentType);
    }


}
