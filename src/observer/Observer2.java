package observer;

public class Observer2 {

    FireCenter fireCenter;

    public Observer2(FireCenter fireCenter){
        this.fireCenter = fireCenter;
    }

    public void getMessage(){
        fireCenter.isChange();
    }
}
