package Animals;

public interface Animals {
    void accept(AnimalVisitor animalVisitor);
    String getName();

}
