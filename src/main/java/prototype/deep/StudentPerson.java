package prototype.deep;

import java.io.*;

public class StudentPerson extends Person implements Cloneable, Serializable {

    public Hobber  hobber;

    public StudentPerson() {
        this.hobber = new Hobber();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    /**
     * 深克隆
     * @return
     */
    public Object deepClone() {
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            StudentPerson copy = (StudentPerson)ois.readObject();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public StudentPerson shallowClone(StudentPerson studentPerson){
        StudentPerson studentPerson1 = new StudentPerson();
        studentPerson1.age = studentPerson.age;
        studentPerson1.hobber = studentPerson.hobber;
        return studentPerson1;
    }
}
