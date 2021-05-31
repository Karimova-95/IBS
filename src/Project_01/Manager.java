package Project_01;

public interface Manager {
    void makeSchedule();
    default void contactCustomer() {
        System.out.println("Позвонить начальнику");
    }
}
