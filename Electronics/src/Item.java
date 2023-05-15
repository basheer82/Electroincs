public class Item {
    private String type;
    private String name;
    private double price;

    public Item(){

    }
    public Item(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void printItem(){
        System.out.printf("%20s : %6.2f%n", getName().toUpperCase(), getPrice());
    }

    public static void printItem(String str, double price){
        System.out.println(("-".repeat(30)));
        System.out.printf("%20s : %6.2f", str, price);
    }
}
