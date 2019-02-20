# importar clase car
from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    # declarando metodos
    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))
    # car = Car()
    # car.license = "AMS234"
    # car.driver = "Andres Herrera"
    # # no necesita metodo como java solo pasando el objeto como parametro
    # print(vars(car))

    # car2 = Car()
    # car2.license = "QWE567"
    # car2.driver = "Matha"
    # print(vars(car2))
