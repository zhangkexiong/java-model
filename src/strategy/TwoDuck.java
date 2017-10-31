package strategy;

public class TwoDuck extends Duck{
    ColourDuck colourDuck;
    public TwoDuck(ColourDuck colourDuck){
        this.colourDuck=colourDuck;
    }
    @Override
    public void weight() {
        System.out.println("TwoDuck 的重量是5kg!!!");
    }

    public void colour(){
        colourDuck.colour();
    }
}
