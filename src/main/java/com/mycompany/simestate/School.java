package com.mycompany.simestate;

public class School extends Place {
    private int ranking;
    private boolean isPrivate;
    private double tuition;
    private String schoolGrade;
    private boolean isIB;
    private boolean isGifted;
    private boolean isFrench;

    public School(String address, String id, String name, int ranking, boolean isPrivate,
                  double tuition, String schoolGrade, boolean isIB, boolean isGifted, boolean isFrench) {
        super(address, id, name);
        
        this.ranking = ranking;
        this.isPrivate = isPrivate;
        this.tuition = tuition;
        this.schoolGrade = schoolGrade;
        this.isIB = isIB;
        this.isGifted = isGifted;
        this.isFrench = isFrench;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public String getSchoolGrade() {
        return schoolGrade;
    }

    public void setSchoolGrade(String schoolGrade) {
        this.schoolGrade = schoolGrade;
    }
    
    public boolean getIsIB() {
        return isIB;
    }

    public void setHasGym(boolean isIB) {
        this.isIB = isIB;
    }

    public boolean getIsGifted() {
        return isGifted;
    }

    public void setHasPool(boolean isGifted) {
        this.isGifted = isGifted;
    }

    public boolean getIsFrench() {
        return isFrench;
    }

    public void setIsFrench(boolean isFrench) {
        this.isFrench = isFrench;
    }
    
}

