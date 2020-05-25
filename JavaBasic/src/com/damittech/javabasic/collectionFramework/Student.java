package com.damittech.javabasic.collectionFramework;

/**
 * @author DAMITH SAMARAKOON on 5/25/2020
 */
public class Student {
    int sId;
    String sName;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName=" + sName +
                '}';
    }
}
