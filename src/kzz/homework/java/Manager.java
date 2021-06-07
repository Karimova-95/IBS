package kzz.homework.java;

public interface Manager {
    void makeSchedule();
    default void contactCustomer() {
        System.out.println("Позвонить начальнику");
    }
}
