package kzz.homework.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        var denis = new Employee("Денис", "Булавин", 6) {
            private String lastWork;
            private String position;

            public void giveTask(String Task, Date deadline) {
            }

            public boolean taskDone() {
                return true;
            }

            public String getLastWork() {
                return lastWork;
            }

            public void setLastWork(String lastWork) {
                this.lastWork = lastWork;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }
        };

        denis.setLastWork("Sberbank");
        denis.setPosition("HR");

        HashSet<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(new TeamLeader("Владислав", "<Пак>", 7));
        employeeHashSet.add(new Developer("Артемий", "Бондарев", 3));
        employeeHashSet.add(new Trainee("Данил", "Гильманов", 4));
        employeeHashSet.add(denis);
        employeeHashSet.add(new TeamLeader("Анна", "Павлова", 8));
        employeeHashSet.add(new TeamLeader("Степан", "Савельев", 9));
        employeeHashSet.add(new Developer("Александр", "Василькин", 4));
        employeeHashSet.add(new Trainee("Мария", "Кувшинова", 2));
        employeeHashSet.add(new Trainee("Пётр", "Иванов", 1));
        employeeHashSet.add(new Developer("Ярослав", "Ясинский", 6));
        employeeHashSet.add(new Trainee("Кирилл", "Карманов", 3));
        employeeHashSet.add(new Trainee("Арсений", "Андреев", 0));

        List<Employee> employeeList = new ArrayList<>(employeeHashSet);

        List<Employee> sortedList =  employeeList
                .stream().sorted((employee1, employee2) -> employee1.getSurname().length() - employee2.getSurname().length())
                .collect(Collectors.toList());

        System.out.println();
        employeeList
                .stream().filter(employee -> employee.getExperience() > 3)
                .collect(Collectors.toList());

        employeeList
                .stream().map(employee -> employee.getExperience()).forEach(System.out::println);

    }
}
