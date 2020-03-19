package hn.edu.ujcv.progra;

public class OVecR2 {
    // miembros
    private double x ;
    private double y ;


    // constructoresssss
    public OVecR2(){}

    public OVecR2(OVecR2 a){}

    public OVecR2(double x, double y){

        this.x= x;
        this.y= y;
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


    // metodos
    public OVecR2 suma(OVecR2 b){
        //
        return new OVecR2(this.x + b.x, this.y +b.y );
    }

    public OVecR2 resta(OVecR2 b){

        return new OVecR2(this .x - b.x, this.y -b.y);
    }

    public double prodPunto(OVecR2 b){
        double solucion;
        solucion = (x * b.x) + (y * b.y);
        return solucion;
    }

    public double magnitud(){
        x = Math.sqrt( Math.pow(this.x,2)+ Math.pow(this.y,2));

        return x;
    }
    @Override
    public String toString(){
        return "i:" + getX() + "j:" + getY();

    }



}
