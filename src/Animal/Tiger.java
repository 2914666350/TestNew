package Animal;
public  class Tiger extends Animal implements CanRun {
    @Override
    public void eatFood() {
        System.out.println("eat raw meat");
    }
    @Override
    public void run() {
        System.out.println("run by arms and legs");
    }
}
