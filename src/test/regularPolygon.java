package test;

import java.util.List;

public class regularPolygon {
    private int n = 3;
    private float side = 1;
    private float x = 0;
    private float y = 0;
    public regularPolygon(int n, float side, float x, float y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public regularPolygon(int n) {
        this(n, 1, 2, 3);
    }

    public void setN(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }

    public void setSide(float side) {
        this.side = side;
    }
    public float getSide() {
        return side;
    }

    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }

    public float getPerimeter() {
        return this.n * this.side;
    }

    public float getArea() {
        double a = Math.tan(Math.PI / this.n);
        float area = (float) (n * Math.sqrt(side) / (4 * Math.round((double) a)));
        return area;
    }

}
