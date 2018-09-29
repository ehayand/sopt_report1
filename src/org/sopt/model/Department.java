package org.sopt.model;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Department extends University{
    private Integer departmentIdx;
    private String departmentName;
    private String departmentTel;
    private String departmentType;

    public Department(Integer universityIdx, String universityName, String universityTel, String universityAddress, Integer departmentIdx, String departmentName, String departmentTel, String departmentType) {
        super(universityIdx, universityName, universityTel, universityAddress);
        this.departmentIdx = departmentIdx;
        this.departmentName = departmentName;
        this.departmentTel = departmentTel;
        this.departmentType = departmentType;
    }

    public Integer getDepartmentIdx() {
        return departmentIdx;
    }

    public void setDepartmentIdx(Integer departmentIdx) {
        this.departmentIdx = departmentIdx;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentTel() {
        return departmentTel;
    }

    public void setDepartmentTel(String departmentTel) {
        this.departmentTel = departmentTel;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "Department{" +
                "departmentIdx=" + departmentIdx +
                ", departmentName='" + departmentName + '\'' +
                ", departmentTel='" + departmentTel + '\'' +
                ", departmentType='" + departmentType + '\'' +
                '}';
    }
}
