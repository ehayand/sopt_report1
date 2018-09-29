package org.sopt.model.builder;

import org.sopt.model.University;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class UniversityBuilder {
    protected Integer universityIdx;
    protected String universityName;
    protected String universityTel;
    protected String universityAddress;

    public UniversityBuilder setUniversityIdx(Integer universityIdx) {
        this.universityIdx = universityIdx;
        return this;
    }

    public UniversityBuilder setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public UniversityBuilder setUniversityTel(String universityTel) {
        this.universityTel = universityTel;
        return this;
    }

    public UniversityBuilder setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
        return this;
    }

    public University build() {
        return new University(this.universityIdx, this.universityName, this.universityTel, this.universityAddress);
    }
}
