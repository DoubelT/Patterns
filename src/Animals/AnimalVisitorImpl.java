package Animals;

public class AnimalVisitorImpl implements AnimalVisitor {
    @Override
    public void visitDog(Dog dog) {
        System.out.println("This is: " + dog.getName());
    }

    @Override
    public void visitCat(Cat cat) {
        System.out.println("This is: " + cat.getName());
    }
}
