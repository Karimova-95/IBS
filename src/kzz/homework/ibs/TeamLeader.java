package kzz.homework.ibs;

import java.util.Date;

public class TeamLeader extends Employee implements Manager {

    private String currentProject;
    private Date deadline;

    public TeamLeader(String firstName, String surname, int experience) {
        super(firstName, surname, experience);
    }

    public TeamLeader(String firstName, String surname, int experience, Date hireDay, String currentProject, Date deadline) {
        super(firstName, surname, experience, hireDay);
        this.currentProject = currentProject;
        this.deadline = deadline;
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public void makeSchedule() {

    }

    @Override
    public void setSalary(int bonus) {
        super.setSalary(bonus);
    }

    public void changeProject(String currentProject, Date deadline) {
    }
}
