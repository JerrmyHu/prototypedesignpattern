package prototype.simple;

public class StudentPersonTest {

    public static void main(String[] args) {
        StudentPerson studentPerson = new StudentPerson();
        studentPerson.setAge(20);
        studentPerson.setName("zzz");
        System.out.println("studentPerson = " + studentPerson);

        StudentPerson person = (StudentPerson) studentPerson.clone();
        System.out.println("person="+ person);
        System.out.println(person == studentPerson);


    }
}
