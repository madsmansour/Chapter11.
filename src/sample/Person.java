public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String eMail;

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return getClass() + " " + name;
    }
}