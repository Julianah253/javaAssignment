class Animal {
    void consume() {
        System.out.println("Animal consumes food");
    }
}

class Puppy extends Animal {
    void makeSound() {
        System.out.println("Puppy makes noise");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.consume();  
        myPuppy.makeSound();
    }
}
