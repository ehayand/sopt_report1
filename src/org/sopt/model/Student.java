package org.sopt.model;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Student extends Department{
    private Integer studentIdx;
    private String studentName;
    private Integer studentGrade;
    private String studentEmail;
    private String studentAddress;
    private Integer studentAge;
    private String studentState;

    public Student(Integer universityIdx, String universityName, String universityTel, String universityAddress, Integer departmentIdx, String departmentName, String departmentTel, String departmentType, Integer studentIdx, String studentName, Integer studentGrade, String studentEmail, String studentAddress, Integer studentAge, String studentState) {
        super(universityIdx, universityName, universityTel, universityAddress, departmentIdx, departmentName, departmentTel, departmentType);
        this.studentIdx = studentIdx;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.studentState = studentState;
    }

    public Integer getStudentIdx() {
        return studentIdx;
    }

    public void setStudentIdx(Integer studentIdx) {
        this.studentIdx = studentIdx;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(Integer studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentState() {
        return studentState;
    }

    public void setStudentState(String studentState) {
        this.studentState = studentState;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "Student{" +
                "studentIdx=" + studentIdx +
                ", studentName='" + studentName + '\'' +
                ", studentGrade=" + studentGrade +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentAge=" + studentAge +
                ", studentState='" + studentState + '\'' +
                '}';
    }
}
