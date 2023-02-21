public class INTERFACESASSIGNMENT
{
    public static void main(String[] args)
    {
        Owner owner=new Owner();
        owner.work();
        owner.businessMeeting();
        owner.salary();
        System.out.println("-------------");
        Employee employee=new Employee();
        employee.getSalary();
        employee.hardWork();
        employee.getSalary();
        employee.salary();
        employee.businessMeeting();
    }
}
interface Work
{
    void work();
}
interface MakingSalary
{
    void salary();
}
interface Meeting
{
    void businessMeeting();
}
interface GetPaid
{
    void getSalary();
}
interface WorkHard
{
    void hardWork();
}
class Owner implements Work, MakingSalary, Meeting
{

    @Override
    public void work()
    {
        System.out.println("Owner Makes Employee Work....");

    }

    @Override
    public void salary()
    {
        System.out.println("Owner Gives a Salary to a Employee...");

    }

    @Override
    public void businessMeeting() {
        System.out.println("Owner will attend a Business Meeting....");

    }
}
class Employee extends Owner implements GetPaid, WorkHard
{


    @Override
    public void getSalary()
    {
        System.out.println("Employee Gets Salary.....");


    }

    @Override
    public void hardWork() {
        System.out.println("Employee Works Hard....");

    }

    @Override
    public void work() {
        System.out.println("Employee is Working for Owner....");
    }

    @Override
    public void salary() {

        System.out.println("Employee is working for a Salary....");
    }

    @Override
    public void businessMeeting() {
        super.businessMeeting();
    }
}

