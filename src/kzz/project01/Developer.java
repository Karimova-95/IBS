package kzz.project01;

import java.util.Date;

public class Developer extends Employee {

    private String programmingLanguage;
    private boolean isDistantWork;
    private String hobby;

    public Developer(String firstName, String surname, int experience) {
        super(firstName, surname, experience);
    }

    public Developer(String firstName, String surname, int experience, Date hireDay,
                     String programmingLanguage, boolean isDistantWork, String hobby) {
        super(firstName, surname, experience, hireDay);
        this.programmingLanguage = programmingLanguage;
        this.isDistantWork = isDistantWork;
        this.hobby = hobby;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public boolean isDistantWork() {
        return isDistantWork;
    }

    public void setDistantWork(boolean distantWork) {
        isDistantWork = distantWork;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void setSalary(int bonus) {
        super.setSalary(bonus);
    }
}
