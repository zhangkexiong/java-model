package strategy;

public class OneDuck extends Duck{
    ColourDuck colourDuck;
    public OneDuck(ColourDuck colourDuck) {
        this.colourDuck=colourDuck;
    }

    @Override
    public void weight() {
        System.out.println("OneDuck 的重量是2kg!!!");
    }

    public void colour(){
        colourDuck.colour();
    }
}
