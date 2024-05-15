package class1;

public class ClassStart5 {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.name="학생1";
//        student1.age=15;
//        student1.grade=80;

//        Student student2 = new Student();
//        student2.name="학생2";
//        student2.age=16;
//        student2.grade=90;

        Student student1 = student("학생1", 17, 98);
        Student student2 = student("학생2", 16, 90);

        Student[] students = {student1, student2};
//        for(int i=0;i<students.length;i++){
//            System.out.println(students[i].name+ " " +students[i].age+ " " + students[i].grade);
//        }

//        for(int i=0;i<students.length;i++){
//            Student s = students[i];
//            System.out.println(s.name+ " " +s.age+ " " + s.grade);
//        }
        for(Student s : students){
            System.out.println(s.name+ " " +s.age+ " " + s.grade);
        }
    }
    public static Student student(String name, int age, int grade){
        Student student = new Student();
        student.name=name;
        student.age=age;
        student.grade=grade;
        return student;
    }
}
