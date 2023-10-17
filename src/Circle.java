public class Circle {
    public Point centre;

    public void setCenterX(double x){
        this.centre.x = x;
    }

    public void setCentreY(double y) {
        this.centre.y = y;
    }

    public double getCentreX() {
        return centre.x;
    }

    public double getCentreY() {
        return centre.y;
    }

    @Override
    public String toString(){
        return String.format("x = %f\ny = %f", centre.x, centre.y);
    }
}
