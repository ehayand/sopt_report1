package org.sopt.model;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Professor extends Department{
    private Integer professorIdx;
    private String professorName;
    private String professorTel;
    private String professorClass;

    public Professor(Integer universityIdx, String universityName, String universityTel, String universityAddress, Integer departmentIdx, String departmentName, String departmentTel, String departmentType, Integer professorIdx, String professorName, String professorTel, String professorClass) {
        super(universityIdx, universityName, universityTel, universityAddress, departmentIdx, departmentName, departmentTel, departmentType);
        this.professorIdx = professorIdx;
        this.professorName = professorName;
        this.professorTel = professorTel;
        this.professorClass = professorClass;
    }

    public Integer getProfessorIdx() {
        return professorIdx;
    }

    public void setProfessorIdx(Integer professorIdx) {
        this.professorIdx = professorIdx;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorTel() {
        return professorTel;
    }

    public void setProfessorTel(String professorTel) {
        this.professorTel = professorTel;
    }

    public String getProfessorClass() {
        return professorClass;
    }

    public void setProfessorClass(String professorClass) {
        this.professorClass = professorClass;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "Professor{" +
                "professorIdx=" + professorIdx +
                ", professorName='" + professorName + '\'' +
                ", professorTel='" + professorTel + '\'' +
                ", professorClass='" + professorClass + '\'' +
                '}';
    }
}
