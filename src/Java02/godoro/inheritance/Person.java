package Java02.godoro.inheritance;

public abstract class Person {
    protected int personId;
    protected String personFirstName;
    protected String personLastName;

    public Person(int personId,String personFirstName, String personLastName) {
        this.personId = personId;
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getFullName(String firstName, String lastName) {
        return getPersonFirstName() + " " + getPersonLastName();
    }
}
