public class dog {
    String dogType;
    double weight;
    String hairColor;
    String tail;
    double energy;

    // Constructor
    public dog(String dogType, double weight, String hairColor, String tail, double energy) {
        this.dogType = dogType;
        this.weight = weight;
        this.hairColor = hairColor;
        this.tail = tail;
        this.energy = energy;
    }

    // Method to make the dog run
    public void run() {
        weight --;
        energy --;
    }

    // Method to feed the dog
    public void eat() {
        weight ++;
        energy ++;
    }

    // Method to make the dog sleep
    public void sleep() {
        energy ++;
    }

    // Getter method for weight
    public double getWeight() {
        return weight;
    }

    // Getter method for energy
    public double getEnergy() {
        return energy;
    }

    public void bark(){
        System.out.println("Woof! Woof!");
    }
}