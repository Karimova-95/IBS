package ibs.homework.java;

import java.util.Date;

public abstract class Employee {

    private String firstName;
    private String surname;
    private int experience;
    private Date hireDay;

    public Employee(String firstName, String surname, int experience) {
        this.firstName = firstName;
        this.surname = surname;
        this.experience = experience;
    }

    public Employee(String firstName, String surname, int experience, Date hireDay) {
        this.firstName = firstName;
        this.surname = surname;
        this.experience = experience;
        this.hireDay = hireDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public void setSalary(int bonus) {

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " ФИ = " + firstName +
                " " + surname + ", опыт работы = " + experience;
    }
}
