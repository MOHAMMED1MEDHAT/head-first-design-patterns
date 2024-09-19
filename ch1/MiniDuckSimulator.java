
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck modelDuck = new ModelDuck();

        mallard.performQuack();
        mallard.performFly();

        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowerd());
        modelDuck.performFly();
    }
}
