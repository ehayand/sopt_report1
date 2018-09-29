package org.sopt.Service.impl;

import org.sopt.Service.StudentService;
import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class StudentServiceImpl implements StudentService {
    @Override
    public Student getByStudentIdx(Integer studentIdx) {
        StudentBuilder studentBuilder = new StudentBuilder();
        return studentBuilder.build();
    }
}
