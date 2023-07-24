package cc.robotdreams.java;

public abstract class Person {
    /*
    Firstly I have created Getters and Setters for all fields,
    but decided do delete all unused ones.
     */

    private String firstName;
    private String lastName;
    protected int age;
    private Person partner;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = null;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        if (lastName == null) {
            return Woman.getMaidenName();
        } else {
            return lastName;
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void registerPartnership(Person partner) {
        this.partner = partner;
        if (this instanceof Woman) {
            this.lastName = partner.getLastName();
        }
    }

    public void deregisterPartnership(boolean revertLastName) {
        if (this.partner != null) {
            this.partner = null;
            if (revertLastName && this instanceof Woman) {
                this.lastName = ((Woman) this).getMaidenName();
            }
        }
    }

    protected abstract boolean isRetired();
}