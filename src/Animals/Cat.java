package Animals;

public class Cat implements Animals {


    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visitCat(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
