package Animal;
public class Test {
    public static void main(String[] args) {
        Person person=new Person();
        Tiger tiger = new Tiger();
        tiger.eatFood();
        tiger.run();
        person.eatFood();
        person.run();
        Test test=new Test();
        test.makeRun(tiger);
        test.makeRun(person);
        Animal animal = new Tiger();
        animal=tiger;
        animal.eatFood();
        ((Tiger)animal).run();
    }
    public void makeRun(CanRun cr){
        cr.run();
    }
}
