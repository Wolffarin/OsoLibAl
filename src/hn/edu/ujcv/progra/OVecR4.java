package hn.edu.ujcv.progra;

public class OVecR4 {
    // miembros
    private double x;
    private double y;
    private double w;
    private double z;

    public OVecR4(double x, double y, double w, double z) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.z = z;
    }


    // accesoras y mutadoras

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void sety(double y) {
        this.y = y;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // metodos}
    public OVecR4 suma(OVecR4 b) {

        return new OVecR4(this.x + b.x, this.y + b.y, this.w + b.w, this.z + b.z);
    }

    public OVecR4 resta(OVecR4 b) {

        return new OVecR4(this.x - b.x, this.y - b.y, this.w - b.w, this.z + b.z);
    }

    public String prodCruz(OVecR4 b) {
        double det1 = (this.y * b.w - b.y * this.w);
        double det2 = (this.x * b.w - b.x * this.w);
        double det3 = (this.x * b.y - b.x * this.y);
        double det4 = (this.x * b.y - b.x * this.z);
        String pc = det1 + "i" + det2 + "j" + det3 + "k" + det4;

        return pc;


    }

    public double prodPunto(OVecR4 b) {
        double solucion;
        solucion = (x * b.x) + (y * b.y) + (w * b.w) + (z * b.z);
        return solucion;

    }

    public double magnitud() {
        x = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.w, 2) + Math.pow(this.z, 2));
        return x;
    }
}