package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println(student1);
        Student student2 = createStudent("학생2", 16, 96);
        System.out.println(student2);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        System.out.println(student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent(Student s){
        System.out.println(s.name +" "+ s.age +" "+ s.grade);
    }
}
