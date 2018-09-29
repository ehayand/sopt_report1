package org.sopt.Service.impl;

import org.sopt.Service.UniversityService;
import org.sopt.model.University;
import org.sopt.model.builder.UniversityBuilder;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class UniversityServiceImpl implements UniversityService {
    @Override
    public University getByUniversityName(String universityName) {
        UniversityBuilder universityBuilder = new UniversityBuilder();
        return universityBuilder.build();
    }
}
