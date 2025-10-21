public class dinosaurs_ch9 {
    public static void main(String[] args) {
        dinosaur ds = new carnivore();
        carnivore cv = (carnivore) ds;
        cv.eatAsDinosaur();
        cv.type();
    }
}

sealed class dinosaur permits herbivore, carnivore, allvore {
    public void eat() {
        System.out.println("I am an eating dinosaur");
    }
}

final class herbivore extends dinosaur {
    @Override
    public void eat() {
        System.out.println("I eat plants");
    }

    public void type() {
        System.out.println("I am herbivore");
    }
}

final class carnivore extends dinosaur {
    @Override
    public void eat() {
        System.out.println("I eat meat");
    }

    public void eatAsDinosaur() {
        super.eat();
    }

    public void type() {
        System.out.println("I am carnivore");
    }
}

final class allvore extends dinosaur {
    @Override
    public void eat() {
        System.out.println("I eat everything");
    }

    public void type() {
        System.out.println("I am allvore");
    }
}
