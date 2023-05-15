public class Main {
    public static void main(String[] args) {
        

        Kitchen kitchen = new Kitchen("Italy Gas", 800,
                "Samsung Fridge", 1200,
                "LG washer", 600);

        kitchen.addColer("water coler", 120);
        kitchen.addGrill("normal grill" , 40);
        kitchen.addMicrowave("small microwave", 140);

        kitchen.printItem();

    }
}