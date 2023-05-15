public class Kitchen extends Item{
    private Item gas;
    private Item fridge;
    private Item washer;
    private Item microwave;
    private Item grill;
    private Item coler;

    public Kitchen(String gasName,double gasPrice, String fridgeName, double fridgePrice,
                   String washerName, double washerPrice) {

        this.gas = new Item("Gas", gasName, gasPrice);
        this.fridge = new Item("Fridge", fridgeName, fridgePrice);
        this.washer = new Item("Washer", washerName,washerPrice );
    }
    public void addMicrowave(String name, double price){
        microwave = new Item("Microwave", name, price);
    }

    public void addGrill( String name, double price){
        grill = new Item("Grill", name, price);
    }

    public void addColer( String name, double price){
        coler = new Item("Coler", name, price);
    }

    public double getTotal(){
        return gas.getPrice() + fridge.getPrice() + washer.getPrice() +
                (microwave != null ? microwave.getTotal() : 0) +
                (grill != null ? grill.getPrice(): 0) +
                (coler != null ? washer.getPrice() : 0);
    }

    @Override
    public void printItem(){
        System.out.println("-".repeat(30));
        gas.printItem();
        fridge.printItem();
        washer.printItem();
        printExtras();
        printItem("KITCHEN" ,getTotal());


    }

    public void printExtras(){

        System.out.println("-".repeat(30));

        if(microwave != null){
            microwave.printItem();
        }
        if(grill != null){
            grill.printItem();
        }
        if(coler != null){
            coler.printItem();
        }
    }
}
