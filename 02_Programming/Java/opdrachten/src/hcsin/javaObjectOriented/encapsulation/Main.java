package hcsin.javaObjectOriented.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Jens";
        person.age = 18;
        System.out.println(person.name + " is " + person.age + " jaar oud.");

        EncapsulatedPerson encapsulatedPerson = new EncapsulatedPerson();
        encapsulatedPerson.setName("Alfijah");
        encapsulatedPerson.setAge(18);
        System.out.println(encapsulatedPerson.getName() + " is " + encapsulatedPerson.getAge() + " jaar geworden.");
    }
}
