package observer;

public class Observer1 {

    FireCenter fireCenter;

    /**
     * 将火警预报中心注入
     * @param fireCenter
     */
    public Observer1(FireCenter fireCenter){
        this.fireCenter = fireCenter;
    }


    public void getMessage(){
        fireCenter.isChange();
    }
}
