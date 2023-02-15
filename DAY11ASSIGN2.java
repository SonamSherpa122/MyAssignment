public class DAY11ASSIGN2
{
    public static void main(String[] args)
    {
        Apple apple=new Apple("Black",1000,"11 Pro");
        Samsung samsung=new Samsung("White",700,"21S");

        System.out.println("APPLE PHONE DETAILS: "+apple);
        System.out.println("SAMSUNG PHONE DETAILS: "+samsung);

        Phone phone=new Phone();
        Price buyingPhone=phone.buyingPhone(apple,samsung);


    }

}
class Machine
{

}
class Phone extends Machine
{
    Price buyingPhone(Apple apple, Samsung samsung)
    {
        Price price=new Price("Dollar",2000);
        System.out.println("I have "+price.Amount+" "+price.currency);
        System.out.println("I wanna Buy "+apple.Color+""+apple.model+" model "+apple.price+" " +price.currency+" Apple Phone");
        System.out.println("I wanna Buy "+samsung.color+""+samsung.model+" model "+samsung.price+" "+price.currency+" Samsung Phone");
        return price;

    }



}

class Apple
{
    String Color;
    int price;
    String model;

    public Apple(String color, int price, String model) {
        Color = color;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "apple{" +
                "Color='" + Color + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }

    public String getColor() {
        return Color;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
class Samsung
{
    String color;
    int price;
    String model;

    public Samsung(String color, int price, String model) {
        this.color = color;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
class Price
{
    String currency;
    int Amount;

    public Price(String currency, int amount) {
        this.currency = currency;
        Amount = amount;
    }

    @Override
    public String toString() {
        return "Price{" +
                "currency='" + currency + '\'' +
                ", Amount=" + Amount +
                '}';
    }

    public String getCurrency() {
        return currency;
    }

    public int getAmount() {
        return Amount;
    }
}
