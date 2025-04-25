public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();  
        puppy.bark(); 
        puppy.weep(); 
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}
