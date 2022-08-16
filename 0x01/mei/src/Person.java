import java.time.LocalDate;
import java.util.Date;

public class Person {

    private static String name;
    private static String surname ;
    private  float salary ;
    private int birthDate ;
    private boolean anotherCompanyOwner, pensioner, publicServer;

    public Person(String name, String surname, int birthDate, float salary) {
        super();
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public Person() {

    }

    public static String fullName(){
        return getName() +" "+ getSurname() ;
    }

    public float calculateYearlySalary() {
        return salary * 12;
    }

    public int age() {
        return LocalDate.now().getYear() - birthDate;
    }

    public boolean  isMEI() {
        if (calculateYearlySalary() < 130000  &&  age()>= 18){
            return anotherCompanyOwner == false
                    && pensioner == false
                    && publicServer == false;
        }
        return false;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Person.surname = surname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }
}
