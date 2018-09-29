package org.sopt.model;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class University {
    private Integer universityIdx;
    private String universityName;
    private String universityTel;
    private String universityAddress;

    public University(Integer universityIdx, String universityName, String universityTel, String universityAddress) {
        this.universityIdx = universityIdx;
        this.universityName = universityName;
        this.universityTel = universityTel;
        this.universityAddress = universityAddress;
    }

    public Integer getUniversityIdx() {
        return universityIdx;
    }

    public void setUniversityIdx(Integer universityIdx) {
        this.universityIdx = universityIdx;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityTel() {
        return universityTel;
    }

    public void setUniversityTel(String universityTel) {
        this.universityTel = universityTel;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityIdx=" + universityIdx +
                ", universityName='" + universityName + '\'' +
                ", universityTel='" + universityTel + '\'' +
                ", universityAddress='" + universityAddress + '\'' +
                '}';
    }
}
