package hcsin.javaObjectOriented.abstraction;

public interface Carnivore {
    void getName();

    default void hunt(Prey prey) {

    }
}
