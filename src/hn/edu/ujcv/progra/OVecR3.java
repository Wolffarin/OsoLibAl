package hn.edu.ujcv.progra;

public class OVecR3 {

    // miembros
    private double x;
    private double y;
    private double w;

    // constructores
    public OVecR3 (){}
    public OVecR3 (OVecR3 a) {}

    public OVecR3 (double x, double y, double w){

        this.x = x;
        this.y = y;
        this.w = w;
    }



    // accesoras y mutadoras

    public double getX(){
        return x;
    }
    public void setX(double x)
    {
        this.x = x;
    }

    public double getY(){
        return y;
    }
    public void sety(double y)
    {
        this.y = y;
    }
    public double getW(){
        return w;
    }
    public void setW(double w)
    {
        this.w = w;
    }


    public OVecR3 suma(OVecR3 b){

        return new OVecR3(this.x + b.x, this.y + b.y, this.w + b.w);
    }

    public OVecR3 resta(OVecR3 b){

        return new OVecR3(this.x - b.x, this.y - b.y, this.w - b.w);
    }

    public String prodCruz(OVecR3 b){

        //
        //  x  y  z
        //  x1 y1 z1       i = y * z1 - z * y1;
        //                 j = - ();
        //                 k = ;
        //
        double det1 = (this.y*b.w - b.y*this.w);
        double det2 =(this.x*b.w - b.x*this.w);
        double det3= (this.x*b.y - b.x*this.y);

        String pc = det1 + "i" + det2 + "j" + det3;

        return pc;
    }

    public double prodPunto(OVecR3 b){
        double solucion;
        solucion = (x * b.x) + (y * b.y) + (w * b.w);
        return solucion;

    }

    public double magnitud(){
        x = Math.sqrt( Math.pow(this.x,2)+ Math.pow(this.y,2) + Math.pow(this.w,2));
        return x;
    }

    // metodos

    // constructores
}
