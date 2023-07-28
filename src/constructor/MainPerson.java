package constructor;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Samuel", 17);
        person.setName("Arle");
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
}
