package entity;

public class Person {
    protected int id;
    protected  String firstName;
    protected  String lastName;
    protected String email;

    public Person(int id, String firstName, String lastName, String email ) {
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
        this.email = email;
    }
    public  String getDisplayName() {
        return  firstName + "" + lastName;

    }

    public  int getId() {
        return  id;
    }


}
