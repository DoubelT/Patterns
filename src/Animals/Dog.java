package Animals;

public class Dog implements Animals {


    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visitDog(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
