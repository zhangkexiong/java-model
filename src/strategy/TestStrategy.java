package strategy;

/**
 * 测试策略模式的方法
 */
public class TestStrategy {
    public static void main(String []args){
        /**
         * 测试普通的面相对象原则
         */
        OneDuck oneDuck = new OneDuck(new WhiteDuck());
        TwoDuck twoDuck = new TwoDuck(new BlackDuck());
        oneDuck.run();
        oneDuck.weight();
        oneDuck.colour();
        System.out.println("=================");
        twoDuck.run();
        twoDuck.weight();
        twoDuck.colour();

        /**
         * 新的需求
         * 所有的鸭子可以分为两种颜色:白色和灰色
         * 解决方案:
         *    1.在duck的子类中添加一个colour的方法
         *    弊端:太过于麻烦
         *    2.在Duck中定义一个colour抽象方法
         *    弊端:优于方案1,但是还要在子类中重写该方法
         *    3.使用策略模式,将抽象方法抽象成一个对象,将鸭子分成两个种族
         */
    }
}
