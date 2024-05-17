class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}
class Car extends Vehicle {
    void display() {
        System.out.println("This is a car.");
    }
}
class Truck extends Vehicle {
    void display() {
        System.out.println("This is a truck.");
    }
}
class HybridCar extends Car {
    void display() {
        System.out.println("This is a hybrid car.");
    }
}
class Data_Ranger {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Truck truck = new Truck();
        HybridCar hybridCar = new HybridCar();
        vehicle.display();
        car.display();
        truck.display();
        hybridCar.display();
    }
}