// class Car {
//   Integer id;
//   String license;
//   // heredar de Account.java
//   Account driver;
//   Integer passegenger;

//   // Declarando un Método Constructor en Java 
//   public Car(String license, Account driver){
//     this.license = license;
//     this.driver = driver;
// }

//   // metodo para llamar los datos
//   void printDataCar() {
//       // System.out.println("License: " + license + " Driver: " + driver);
//       System.out.println("License: " + license + " Name Driver: " + driver.name);
//     }
//   }
class Car {
  Integer id;
  String license;
  Account driver;
  private Integer passegenger;

  public Car(String license, Account driver){
      this.license = license;
      this.driver = driver;
  }

  void printDataCar() {
      if(passegenger != null){
          System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + passegenger);
      }
      
  }


  public Integer getPassenger(){
      return passegenger;
  }

  public void setPassenger(Integer passenger) {
      if(passenger == 4){
          this.passegenger = passenger;
      }else{
          System.out.println("Necesitas asignar 4 pasajeros");
      }
  }
  
}