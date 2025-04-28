public class Laptop{
    String name = "";
    String proc = "";
    int ram = 0;
    int price = 0;
    public static void main(String[] args){
        Laptop lap1 = new Laptop();
        lap1.name = "Dell";
        lap1.proc = "gb";
        lap1.ram = 8;
        lap1.price = 50000;
        System.out.println(lap1.price);
    }
}