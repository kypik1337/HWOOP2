public class istribitel extends avia {
    istribitel(String model, int year, double price, String color, Double power) {
        super(model, year, price, color, power);
    }
    String name;
    int old;

    void verticl(String name, int old){
        this.name = name;
        this.old = old;
    }
    public void getInfo(){
        System.out.println(name + old);
    }    
    
}