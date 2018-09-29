package org.sopt.Service;

import org.sopt.model.Student;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public interface StudentService {
    Student getByStudentIdx(final Integer studentIdx);
}
