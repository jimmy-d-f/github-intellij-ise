public class personRecord {
    public static void main(String[] args) {


        Person p1 = new Person("Joe Gleeson", 21, "Fishing");

        System.out.println(p1.name());
        System.out.println(p1.age());
        System.out.println(p1.hobby());
        System.out.println(p1);

    }
}

record Person(String name, Integer age, String hobby){

}
