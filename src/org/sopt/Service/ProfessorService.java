package org.sopt.Service;

import org.sopt.model.Professor;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public interface ProfessorService {
    Professor getByProfessorIdx(final Integer professorIdx);
}
