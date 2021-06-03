package kzz.homework.ibs;

public interface Manager {
    void makeSchedule();
    default void contactCustomer() {
        System.out.println("Позвонить начальнику");
    }
}
