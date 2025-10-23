public class AbstractDog {
    public static void main(String[] args){
        DOG myD = new DOG("Buddy");
        myD.getState();
        myD.sleep();
    }
}

abstract class ANIMAL{
    String name;

    ANIMAL (String name){
        this.name = name;
        System.out.println("Animal's name is "+name);
    }

    public abstract void getState();

    public void sleep(){
        System.out.println(name+" is sleeping. zzz");
    }
}

class DOG extends ANIMAL{
    DOG (String name){
        super(name);
        System.out.println("Dog's name is "+name);
    }

    public void getState(){
        System.out.println(name+" is a dog");
    }
}
