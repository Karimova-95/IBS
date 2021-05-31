package Project_01;

import Project_01.Employee;

public class Trainee extends Employee {

    private String position;
    private String favouriteBook;
    private String city;

    public Trainee(String firstName, String surname, int experience) {
        super(firstName, surname, experience);
    }

    public Trainee(String firstName, String surname, int experience, String position, String favouriteBook, String city) {
        super(firstName, surname, experience);
        this.position = position;
        this.favouriteBook = favouriteBook;
        this.city = city;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFavouriteBook() {
        return favouriteBook;
    }

    public void setFavouriteBook(String favouriteBook) {
        this.favouriteBook = favouriteBook;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void setSalary(int bonus) {
        super.setSalary(bonus);
    }
}
