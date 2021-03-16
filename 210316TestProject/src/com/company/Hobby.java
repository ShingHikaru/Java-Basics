package com.company;

public class Hobby {

    private String firstName;
    private String familyName;
    private String hobby;
    private String comment;

    public Hobby(String firstName, String familyName, String hobby) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.hobby = hobby;
    }

    public Hobby(String firstName, String familyName, String hobby, String comment) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.hobby = hobby;
        this.comment = comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void jikoshokai() {
        System.out.println(firstName + familyName + "です。" + hobby + "が趣味です。" + comment);
    }
}
}
