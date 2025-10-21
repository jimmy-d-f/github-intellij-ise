class Adult {
    private String name;
    private int age;

    Adult(String name, int age) {
        if (isAgeOk(age)) {
            this.age = age;
        } else {
            System.out.println("Invalid age (" + age + "). Defaulting to 18.");
            this.age = 18; // default to a safe value
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Keeping the old one: " + this.name);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (isAgeOk(age)) {
            this.age = age;
        } else {
            System.out.println("Invalid age (" + age + "). Age not changed.");
        }
    }

    private boolean isAgeOk(int age) {
        return age >= 18 && age <= 120;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

public class BasicEncapsulation {
    public static void main(String[] args) {
        Adult john = new Adult("John", 20);
        john.introduce();

        // Try setting invalid data
        john.setAge(-99);   // invalid
        john.setName("");   // invalid

        john.introduce();   // should still be valid object

        // Valid update
        john.setAge(35);
        john.setName("John Smith");
        john.introduce();
    }
}
