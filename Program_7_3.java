interface Displayable {
    void display();
}

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Vehicle {
    void run() {
        System.out.println("Vehicle is running...");
    }
}

class Data_Ranger extends Animal implements Displayable {
    public void display() {
        System.out.println("Data Ranger displaying information...");
    }

    public static void main(String[] args) {
        Data_Ranger dr = new Data_Ranger();
        dr.eat();
        dr.display();
    }
}