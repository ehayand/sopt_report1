package org.sopt.Service.impl;

import org.sopt.Service.ProfessorService;
import org.sopt.model.Professor;
import org.sopt.model.builder.ProfessorBuilder;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class ProfessorServiceImpl implements ProfessorService {
    @Override
    public Professor getByProfessorIdx(Integer professorIdx) {
        ProfessorBuilder professorBuilder = new ProfessorBuilder();
        return professorBuilder.build();
    }
}
