package Animals;

public interface AnimalVisitor {

    void visitDog(Dog dog);
    void visitCat(Cat cat);

}
