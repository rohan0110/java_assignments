public interface Vehicle {
    void printNumberOfTyre();
}

class Bicycle implements Vehicle {
    public void printNumberOfTyre() {
        System.out.println("Number of Tyres : " + 2);
    }
}

class Car implements Vehicle {
    public void printNumberOfTyre() {
        System.out.println("Number of Tyres : " + 4);
    }
}

class Bike implements Vehicle {
    public void printNumberOfTyre() {
        System.out.println("Number of Tyres : " + 2);
    }
}
