package DataTypes;

public class InheritanceOfVariables {
}

class ElectricCar extends Car {

    int electricEnginePower;
}

class Vehicle {
    double maxSpeed;

}

class Car extends Vehicle {

    int wheelCount;
    double weight;
}
