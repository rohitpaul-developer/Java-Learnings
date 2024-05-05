package Oops.Four_Pillars.Inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    public BoxPrice() {
        super();
        this.cost = -1;
    }

    public BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double a, double b, double c, double weight, double cost) {
        super(a, b, c, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost){
        super(side,weight);
        this.cost = cost;
    }
}
