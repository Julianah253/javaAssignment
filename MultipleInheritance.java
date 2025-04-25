public class MultipleInheritance {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Performer performer = new Performer();

        performer.triggerSing(parrot);
        performer.triggerFly(parrot);
    }
}

interface CanSing {
    void sing();
}

interface CanFly {
    void fly();
}

class Parrot implements CanSing, CanFly {
    public void sing() {
        System.out.println("Parrot sings sweetly");
    }

    public void fly() {
        System.out.println("Parrot flies high");
    }
}

class Performer {
    void triggerSing(CanSing singer) {
        singer.sing();
    }

    void triggerFly(CanFly flier) {
        flier.fly();
    }
}
