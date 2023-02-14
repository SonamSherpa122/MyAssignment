public class DAY11ASSIGNMENT
{

        public static void main(String[] args)
        {
            Tequila tequilaObj1=new Tequila("Casamigos",2.0f,40);
            Lime limeObj1=new Lime(1);
            Agave agaveObj1=new Agave(0.5f,"Blue Agave");

            System.out.println(" Tequila Details : "+tequilaObj1);
            System.out.println("Lime Details : "+limeObj1);
            System.out.println("Agave Details : "+agaveObj1);


            Bartender bartender=new Bartender();
            Cup mycup=bartender.makeMargarita(tequilaObj1,limeObj1,agaveObj1);
            System.out.println("Glass Details : "+mycup.content);




        }
}
class Person
{

    }

class Bartender extends Person
{
    Cup makeMargarita(Tequila tequila,Lime lime,Agave agave) {
        System.out.println("Bartender is making Margarita");

        Cup myCup = new Cup("High Ball", "6oz", 4);
        System.out.println("Bartender Took the..." + myCup.cupType+" glass");
        System.out.println("Bartender took out ...." + tequila.brand+" Bottle");
        System.out.println("Bartender poured....." + tequila.quantity+" oz Tequila");
        System.out.println("Bartender then squeezed " + lime.quantity + " Lime");
        System.out.println("Bartender then poured " + agave.agaveQuantity + " Agave");
        System.out.println("Bartender is Shaking and Mixing everything with Ice");

        myCup.content="Bartender Served Margarita";
        return myCup;
    }
}


class Tequila
{
    String brand;
    float quantity;
    int alcoholPercentage;

    public Tequila(String brand, float quantity, int alcoholPercentage) {
        this.brand = brand;
        this.quantity = quantity;
        this.alcoholPercentage = alcoholPercentage;

    }

    @Override
    public String toString() {
        return "Tequila{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", alcoholPercentage=" + alcoholPercentage +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public float getQuantity() {
        return quantity;
    }

    public int getAlcoholPercentage() {
        return alcoholPercentage;
    }
}
class Lime
{
    int quantity;

    public Lime(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Lime{" +
                " quantity=" + quantity +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }
}
class Agave
{
    float agaveQuantity;
    String brand;

    public Agave(float agaveQuantity, String brand) {
        this.agaveQuantity = agaveQuantity;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Agave{" +
                "agaveQuantity=" + agaveQuantity +
                ", brand='" + brand + '\'' +
                '}';
    }

    public float getAgaveQuantity() {
        return agaveQuantity;
    }

    public String getBrand() {
        return brand;
    }
}
class Cup
{
    String cupType;
    String size;
    int capacity;
    String content;

    public Cup(String cupType, String size, int capacity) {
        this.cupType = cupType;
        this.size = size;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "cupType='" + cupType + '\'' +
                ", size='" + size + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public String getCupType() {
        return cupType;
    }

    public String getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}