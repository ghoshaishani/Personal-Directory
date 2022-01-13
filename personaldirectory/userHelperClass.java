package com.example.personaldirectory;

public class userHelperClass {
    String name1, phone1, email1;

    public userHelperClass(String name1, String phone1, String email1) {
        this.name1 = name1;
        this.phone1 = phone1;
        this.email1 = email1;
    }

    public userHelperClass() {
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }
}
