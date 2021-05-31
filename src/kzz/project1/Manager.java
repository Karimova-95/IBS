package kzz.project1;

public interface Manager {
    void makeSchedule();
    default void contactCustomer() {
        System.out.println("Позвонить начальнику");
    }
}
