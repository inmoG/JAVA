package c.godOfJava;

public class ManageStudent {
    public static void main(String[] args) {
        Student student[] = null;
        ManageStudent Manage = new ManageStudent();
        student = Manage.addStudent();
        Manage.pirntStudents(student);
    }

    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("inmo");
        student[1] = new Student("yeeun");
        student[2] = new Student("haru", "Seoul", "01011111111", "haru@naver.com");
        return student;
    }

    public void pirntStudents(Student students[]) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
