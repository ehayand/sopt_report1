package org.sopt.model.builder;

import org.sopt.model.Student;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class StudentBuilder extends DepartmentBuilder {
    private Integer studentIdx;
    private String studentName;
    private Integer studentGrade;
    private String studentEmail;
    private String studentAddress;
    private Integer studentAge;
    private String studentState;

    public StudentBuilder setStudentIdx(Integer studentIdx) {
        this.studentIdx = studentIdx;
        return this;
    }

    public StudentBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public StudentBuilder setStudentGrade(Integer studentGrade) {
        this.studentGrade = studentGrade;
        return this;
    }

    public StudentBuilder setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
        return this;
    }

    public StudentBuilder setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
        return this;
    }

    public StudentBuilder setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
        return this;
    }

    public StudentBuilder setStudentState(String studentState) {
        this.studentState = studentState;
        return this;
    }

    @Override
    public Student build() {
        return new Student(super.universityIdx, super.universityName, super.universityTel, super.universityAddress,
                super.departmentIdx, super.departmentName, super.departmentTel, super.departmentType,
                this.studentIdx, this.studentName, this.studentGrade, this.studentEmail,
                this.studentAddress, this.studentAge, this.studentState);
    }
}
