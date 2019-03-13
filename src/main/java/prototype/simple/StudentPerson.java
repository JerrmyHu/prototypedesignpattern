package prototype.simple;

public class StudentPerson implements Person {

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person clone() {
        StudentPerson studentPerson = new StudentPerson();
        studentPerson.setAge(this.age);
        studentPerson.setAge(this.age);
        return studentPerson;
    }
}
