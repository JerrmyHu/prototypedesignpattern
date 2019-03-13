package prototype.deep;

public class DeepTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        StudentPerson studentPerson = new StudentPerson();
        StudentPerson personCLone= (StudentPerson) studentPerson.clone();
        System.out.println(studentPerson.hobber == personCLone.hobber);

        StudentPerson person1 = new StudentPerson();
        StudentPerson person = person1.shallowClone(person1);
        System.out.println(person.hobber == person1.hobber);
    }
}
