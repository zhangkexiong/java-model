package strategy;

public abstract class Duck {
    /**
     * 因为是所有鸭子的共性,定义成具体的方法
     */
    public void run(){
        System.out.println("所有的鸭子都会走路.....");
    }

    /**
     * 鸭子的重量是不确定的,定义成抽象方法
     */
    public abstract void weight();

}
