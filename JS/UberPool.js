class UberPool extends Car {
    constructor(license, driver, brand, model) {
        // super es super clase heredada
        super(license, driver)
        this.brand = brand;
        this.model = model;
    }
}