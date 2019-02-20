// Declarando un Método Constructor en Java y JavaScript
// function Car(license, driver) {
//   this.id;
//   this.license = license;
//   this.driver = driver;
//   this.passenger;
// }

// Car.prototype.printDataCar = function () {
//   console.log(this.driver)
//   console.log(this.driver.name)
//   console.log(this.driver.document)
// }
// /************************************** */ECMAScript6 //////////////////////////*
class Car {
  constructor(license, driver){
    this.id;
    this.license = license;
    this.driver = driver;
    this.passanger;
  }
  printDataCar (){
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
  }
}