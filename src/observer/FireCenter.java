package observer;

public class FireCenter {

    private String change = "no";

    public void isChange(){
        setChange(change);
    }

    public void setChange(String change){
        this.change = change;
        sendMessage(change);
    }

    private void sendMessage(String change){
        System.out.println("change "+change);
    }

}
