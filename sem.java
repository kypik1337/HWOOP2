public class sem {
   public static void main(String[] args) {
    car car = new car("Audi", 1999, 6000.2, "Blue", 2.5);
    car car2 = new car("Bmw", 1999, 3000, "Green", 2.8);
    car.GetInfo();
    car.road("Braslav");
    car.poverCar();
    car.road("Braslav");
    System.out.println("-----------------------------------");
    System.out.println("     !!!Гоняют две лэйбы!!!     ");
    car.GetInfo();
    car2.GetInfo();
    
    if (car.power == car2.power){
      System.out.println("Тачки по моще одинаковые бро");
      if ( car.year > car2.year){
         System.out.println("Бро да получается " + car.model + " моложе тебя ");
      }else{
         System.out.println("Бро да получается " + car.model + " старше тебя ");
      }
    }
    if (car.power > car2.power){
      System.out.println("Бро да получается " + car.model + " дергает тебя ");
      if ( car.year > car2.year){
         System.out.println("Бро получается " + car.model + " моложе тебя ");
      }else{
         System.out.println("Бро получается " + car.model + " старше тебя ");
      }
    }else{
      System.out.println("Бро да получается " + car2.model + " дергает тебя ");
      if ( car.year > car2.year){
         System.out.println("Бро получается " + car.model + " моложе тебя ");
      }else{
         System.out.println("Бро получается " + car.model + " старше тебя ");
      }
    }
    
   System.out.println(car.getModel());
   System.out.println(car2.getPeice());
   // VendingMachine vendingMachine = new VendingMachine(20);
   // vendingMachine.add(new Product("apple", 15));
   // vendingMachine.add(new Product("orange", 20));
   // vendingMachine.add(new Product("pear", 18));
   // vendingMachine.add(new Product("grape", 30));a
   // vendingMachine.add(new Product("banana", 13));
   // System.out.println(vendingMachine.getProductByName("grape"));
   // System.out.println(vendingMachine.getProductCost(13));
   
   } 
   
}
