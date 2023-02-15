import java.sql.SQLOutput;

public class DAY11ASSIGN3
{
    public static void main(String[] args)
    {
        Java javaObj1=new Java("Java",30,"IntelIJ");
        Salary salaryObj1=new Salary("Developer",900000);

        System.out.println("WORK DETAILS "+javaObj1+" "+salaryObj1+"");

        Job job=new Job();
         Consultancy findingJob=job.findingJob(javaObj1,salaryObj1);



    }
}
class Money
{

}
class Job extends Money
{
    Consultancy findingJob(Java java,Salary salary)
    {
        Consultancy consultancy=new Consultancy("FTECH",22);
        System.out.println(""+consultancy.name+ " has a "+consultancy.student+" Students");
        System.out.println("We all are Java Developers");
        System.out.println("We all are Learning "+java.language+" Language for "+java.timePeriod+" Days using "+java.app+" app");
        System.out.println("We all will be making "+salary.salaryAmount+"$ if we become "+salary.Position);
return consultancy;
    }
}
class Java
{
    String language;
    int timePeriod;
    String app;

    public Java(String language, int timePeriod, String app) {
        this.language = language;
        this.timePeriod = timePeriod;
        this.app = app;
    }

    @Override
    public String toString() {
        return "Java{" +
                "language='" + language + '\'' +
                ", timePeriod=" + timePeriod +
                ", app='" + app + '\'' +
                '}';
    }

    public String getLanguage() {
        return language;
    }

    public int getTimePeriod() {
        return timePeriod;
    }

    public String getApp() {
        return app;
    }
}
class Salary
{
    String Position;
    int salaryAmount;

    public Salary(String position, int salaryAmount) {
        Position = position;
        this.salaryAmount = salaryAmount;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "Position='" + Position + '\'' +
                ", salaryAmount=" + salaryAmount +
                '}';
    }

    public String getPosition() {
        return Position;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }
}
class Consultancy
{
    String name;
    int student;

    public Consultancy(String name, int student) {
        this.name = name;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Consultancy{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getStudent() {
        return student;
    }
}
