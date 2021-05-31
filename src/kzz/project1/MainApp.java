package kzz.project1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        HashSet<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(new TeamLeader("Владислав", "Осипов", 7));
        employeeHashSet.add(new Developer("Артемий", "Бондарев", 3));
        employeeHashSet.add(new Trainee("Данил", "Гильманов", 4));

        List<Employee> employeeList = new ArrayList<>(employeeHashSet);
    }
}
