package AnimalsVisitor;

public class Zoo {

    public static void main(String[] args) {

        Animals[] animals = new Animals[]{
                new Dog("Dog1"), new Dog("Dog2"), new Cat("Cat1"), new Cat("Cat2")
        };


        Animals dog1 =  new Dog("Dog1");
        Animals dog2 =  new Dog("Dog2");
        Animals cat1 =  new Cat("Cat1");
        Animals cat2 =  new Cat("Cat2");

        AnimalVisitor visitor = new AnimalVisitorImpl();

        dog1.accept(visitor);
        dog2.accept(visitor);

        cat1.accept(visitor);
        cat2.accept(visitor);


    }
}
