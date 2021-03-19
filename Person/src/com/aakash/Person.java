package com.aakash;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if ((age > 0) && (age < 101)) {
             this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if ((this.age > 12) && (this.age < 20)) {
            return true;
        } else return false;
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return this.firstName + this.lastName;
        } else if (this.firstName.isEmpty()) {
            return this.lastName;
        } else if (this.lastName.isEmpty()) {
            return this.firstName;
        } else {
            return this.firstName + " " + this.lastName;
        }
    }
}
