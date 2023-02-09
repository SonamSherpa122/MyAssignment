public class AssignmentDay7 {
    public static void main(String[] args) {
        System.out.println("begin main");
        Weight weightObj1 = new Weight (28,"Sandeep",159);
        Weight weightObj2 = new Weight (33,"Raj",200);
        Weight weightObj3 = new Weight (35,"Harry",250);

        weightObj1.printWeight();
        weightObj2.printWeight();
        weightObj3.printWeight();

        weightObj1.Loss(10);
        weightObj2.Gain(50);
        weightObj3.Loss(25);

        weightObj1.printWeight();
        weightObj2.printWeight();
        weightObj3.printWeight();


        System.out.println("end main..");
    }
}
class Weight
{
    private int Age;
    private String Name;
    private double weight;
    
    Weight(int Age, String Name, double weight) {
        System.out.println("Constructor is setting the initial details...");
        this.Age = Age;
        this.Name = Name;
        this.weight = weight;
    }
    void printWeight() {
        System.out.println("AGE : "+Age);
        System.out.println("NAME : "+Name);
        System.out.println("WEIGHT : "+weight);
        System.out.println("----------------------------");
    }
    void Loss(double weightLoss) {
        System.out.println("YOUR LOST WEIGHT "+weightLoss);
        weight = weight - weightLoss;
    }
    void Gain(double weightGain) {
        System.out.println("YOUR GAINED WEIGHT "+weightGain);
        weight = weight + weightGain;
    }

}

