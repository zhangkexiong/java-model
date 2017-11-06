package observer;

public class ObserverMain {
    public static void main(String args[]){
        FireCenter fireCenter = new FireCenter();
        Observer1 observer1 = new Observer1(fireCenter);
        Observer2 observer2 = new Observer2(fireCenter);
        fireCenter.setChange("yes");
        observer1.getMessage();
        observer2.getMessage();
    }
}
