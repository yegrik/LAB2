public class Circle {
    public Point centre;
    public double r;

    public void setCenterX(double x){
        this.centre.x = x;
    }

    public void setCentreY(double y) {
        this.centre.y = y;
    }

    public void setRad(double r){
        this.r = r;
    }

    public double getCentreX() {
        return centre.x;
    }

    public double getCentreY() {
        return centre.y;
    }
    
    public double getRad() {
        return r;
    }

    @Override
    public String toString(){
        return String.format("x = %f\ny = %f\nr = %f", centre.x, centre.y, r);
    }
}
