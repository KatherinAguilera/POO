// // la calse debe ser igual a nombre desl archivo
// class Main {
//   public static void main(String[] args) {
//       System.out.println("Hola Mundo");
//       // Pasando metodo constructor Account 
//       Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
//       // Car car = new Car();
//       // car.license = "AMQ123";
//       // car.driver = "Juan Herrera";
//       car.passegenger = 4;
//       //llamar metodo
//       car.printDataCar();

//       // Car car2 = new Car();
//       // car2.license = "QWE567";
//       // car2.driver = "Andrea Herrera";
//       Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
//       car2.passegenger = 3;
//       car2.printDataCar();
//   }
// }
class Main {
  public static void main(String[] args) {
      System.out.println("Hola Mundo");
      UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
      uberX.setPassenger(2);
      uberX.printDataCar();

      /*Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
      car2.passegenger = 3;
      car2.printDataCar();*/
  }
}