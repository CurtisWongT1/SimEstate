package com.mycompany.simestate;

public class School extends Place {
    private int ranking; 
    private boolean isPrivate;
    private double tuition;
    private String schoolGrade;
    private boolean hasIB;
    private boolean hasGifted;
    private boolean hasFrench;

    public School(String address, String id, String name, int ranking, boolean isPrivate,
                  double tuition, String schoolGrade, boolean hasIB, boolean hasGifted, boolean hasFrench) {
        super(address, id, name);
        
        this.ranking = ranking;
        this.isPrivate = isPrivate;
        this.tuition = tuition;
        this.schoolGrade = schoolGrade;
        this.hasIB = hasIB;
        this.hasGifted = hasGifted;
        this.hasFrench = hasFrench;
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
    
    public boolean hasIB() {
        return hasIB;
    }

    public void setHasIB(boolean hasIB) {
        this.hasIB = hasIB;
    }

    public boolean hasGifted() {
        return hasGifted;
    }

    public void setHasGifted(boolean hasGifted) {
        this.hasGifted = hasGifted;
    }

    public boolean hasFrench() {
        return hasFrench;
    }

    public void setHasFrench(boolean hasFrench) {
        this.hasFrench = hasFrench;
    }

    
}
