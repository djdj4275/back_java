package section15.Api_class;

import java.util.Objects;

// ex2

/*
    값이 같으면 같은 객체로 생성되게끔 하시오.
    equals, hashcode 오버라이딩 응용.
 */

class Student {
    String name;
    int studentNumber;

    Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Student)) return false;

        Student student = (Student) o;
        return studentNumber == student.studentNumber && name == student.name;
    }

    @Override 
    public int hashCode() {
        return Objects.hash(name, studentNumber);
    }
}

public class Practice7 {
    public static void main(String[] args) {
        Student student = new Student("김일남", 1);
        Student student1 = new Student("김일남", 1);
        Student student2 = new Student("김일남", 1);

        System.out.println(student.equals(student1)); // true
        System.out.println(student.equals(student2)); // false
    }
}
