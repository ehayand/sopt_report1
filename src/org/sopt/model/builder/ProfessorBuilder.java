package org.sopt.model.builder;

import org.sopt.model.Professor;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class ProfessorBuilder extends DepartmentBuilder {
    private Integer professorIdx;
    private String professorName;
    private String professorTel;
    private String professorClass;

    public ProfessorBuilder setProfessorIdx(Integer professorIdx) {
        this.professorIdx = professorIdx;
        return this;
    }

    public ProfessorBuilder setProfessorName(String professorName) {
        this.professorName = professorName;
        return this;
    }

    public ProfessorBuilder setProfessorTel(String professorTel) {
        this.professorTel = professorTel;
        return this;
    }

    public ProfessorBuilder setProfessorClass(String professorClass) {
        this.professorClass = professorClass;
        return this;
    }

    @Override
    public Professor build() {
        return new Professor(super.universityIdx, super.universityName, super.universityTel, super.universityAddress,
                super.departmentIdx, super.departmentName, super.departmentTel, super.departmentType,
                this.professorIdx, this.professorName, this.professorTel, this.professorClass);
    }
}
