public class Student extends Person {
    private String status;

    public Student(String name) {
        super(name);
    }

    public String toString(){
        return "Student " + super.getaNme();
    }
}

