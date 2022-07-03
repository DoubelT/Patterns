package AnimalsVisitor;

public interface Animals {
    void accept(AnimalVisitor animalVisitor);
    String getName();

}
