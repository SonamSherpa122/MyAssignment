public class InheritanceTest
{
    public static void main(String[] args)
    {
        Teacher teacherObj1=new Teacher("Vishal", 10 );
        teacherObj1.printTeacher();

        Student studentObj1=new Student("Vishal",10,22);
        studentObj1.printStudent();

    }
}
class Teacher
{
    String name;
    int Day;
    public Teacher(String name, int day) {
        this.name = name;
        this.Day = day;
    }
    void printTeacher()
    {
        System.out.println(name+" is a Good Java Teacher & this is his "+Day+" Day" );
    }
}
    class Student extends Teacher
    {
        int numberOfStudents;

        public Student(String name, int day, int numberOfStudents) {
            super(name, day);
            this.numberOfStudents = numberOfStudents;
        }

        void printStudent() {
            System.out.println(name + " is a Good Java Teacher & this is his " + Day + " Day with " + numberOfStudents + " Students");
        }

    }
