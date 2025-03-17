package mx.uv.fiee.iinf.paradigmas.poo;
/*
    Equipo:
    zS22019636 Jorge Samuel Solano Dorantes
    zs22002241 Alan Osmar Peña Polo
*/
public class Student implements Comparable<Student> {
    private final String name;
    private final int age;

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString () {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                " }";
    }

    @Override
    public int compareTo(Student o) {
        if (this.age > o.age)
            return 1;

        if (this.age < o.age)
            return -1;

        return 0;
    }
}