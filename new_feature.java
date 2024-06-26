public class new_feature {
    public static void main(String[] args) {
        System.out.println("This is a new feature");
        Action act1 = new SpecificAction1();
        act1.do_action();
    }
}
class Action{
    private int id;
    private String name;
    public void do_action(){};
}

class SpecificAction1 extends Action{

    @Override
    public void do_action() {
        System.out.println("Im the first action");
    }
    
}
class SpecificAction2 extends Action{

    @Override
    public void do_action() {
    System.out.println("Im the second action");
    }
    
}