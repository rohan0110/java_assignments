class Sportsperson {
    String name, sport;
    int age;

    public Sportsperson(String name, String sport, int age) {
        this.name = name;
        this.sport = sport;
        this.age = age;
    }



    void displayDetails() {
        System.out.println("Name : " + name + ", Sport : " + sport +  ", Age :" + age);
    }

}

class Athlete extends Sportsperson {
    int noOfEvent;
    public Athlete(String name, int age, int noOfEvent) {
        super(name, "Athlete", age);
        this.noOfEvent = noOfEvent;
    }

    public int getNoOfEvent() {
        return noOfEvent;
    }

    public void setNoOfEvent(int noOfEvent) {
        this.noOfEvent = noOfEvent;
    }

    void displayDetails() {
        System.out.println("Name : " + name + ", Sport : " + sport +  ", Age :" + age + ", NumberOfEvent : " + noOfEvent);
    }
}

class Hockey extends Sportsperson {
    int noOfGoal;
    public Hockey(String name, int age, int noOfGoal) {
        super(name, "Hockey", age);
        this.noOfGoal = noOfGoal;
    }

    public int getNoOfGoal() {
        return noOfGoal;
    }

    public void setNoOfGoal(int noOfGoal) {
        this.noOfGoal = noOfGoal;
    }

    void displayDetails() {
        System.out.println("Name : " + name + ", Sport : " + sport +  ", Age :" + age + ", NumberOfGoalsScored : " + noOfGoal);
    }
}

public class Main {
    public static void main(String[] args) {
        Sportsperson player1 = new Hockey("Aman", 23, 15);
        player1.displayDetails();
        Sportsperson player2 = new Athlete("Vijay", 32, 8);
        player2.displayDetails();
    }
}
