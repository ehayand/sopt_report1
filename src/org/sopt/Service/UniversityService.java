package org.sopt.Service;

import org.sopt.model.University;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public interface UniversityService {
    University getByUniversityName(final String universityName);
}
