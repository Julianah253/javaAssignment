public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();     
        dog.bark();    

        Cat cat = new Cat();
        cat.eat();      
        cat.meow(); 
    }
}

class Animal {
    void eat() {
        System.out.println("The animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks loudly");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows softly");
    }
}
