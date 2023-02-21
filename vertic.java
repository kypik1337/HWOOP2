public class vertic extends avia {
    vertic(String model, int year, double price, String color, Double power) {
        super(model, year, price, color, power);
    }
    String name;
    int old;

    void verticl(String name, int old){
        this.name = name;
        this.old = old;
    }
    public String GetInfo(){
        return "верталет" + name + old + "года";
        
    }    
    
}
