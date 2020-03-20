package hn.edu.ujcv.progra;

public class OMat2x2 {

    // miembros  double m11,m12;
    //           double m21,m22;
    private double m11,m12;
    private double m21,m22;


    //constructores


    public OMat2x2(double m11, double m12, double m21, double m22)
    {
        this.m11 = m11;
        this.m12 = m12;
        this.m21 = m21;
        this.m22 = m22;
        double m = m11 + m12 + m21 + m22;
    }

    public OMat2x2(OVecR2 a, OVecR2 b){}


    // accesoras y mutadoras
    public double getM11(){
        return m11;
    }
    public void setM11(double m11) {
        this.m11 = m11;
    }
    public double getM12(){
        return m12;
    }
    public void setM12(double m12) {
        this.m12 = m12;
    }
    public double getM21(){
        return m21;
    }
    public void setM21(double m21) {
        this.m21 = m21;
    }
    public double getM22(){
        return m22;

    }
    public void setM22(double m22) {
        this.m22 = m22;
    }
    public double transpuesta()
    {
        double g =this.m22 + this.m21 + this.m12  +this.m11;
        return g;
    }

    public OMat2x2 inversa()
    {
        this.determinante();
        return new OMat2x2((1/this.determinante()) * this.m22,(1/this.determinante()) * -this.m12,
                (1/this.determinante()) * -this.m21,(1/this.determinante()) * this.m11);
    }

    public double suma(OMat2x2 b){
        double r11, r12;
        double r21, r22;

        r11 = this.m11 + b.m11;
        r12 = this.m12 + b.m12;
        r21 = this.m21 + b.m21;
        r22 = this.m22 + b.m22;

        double g = r11 + r12 + r21 + r22;

        return g;
    }

    public double resta(OMat2x2 b){
        double n11, n12;

        double n21, n22;

        n11 = this.m11 - b.m11;
        n12 = this.m12 - b.m12;
        n21 = this.m21 - b.m21;
        n22 = this.m22 - b.m22;

        double f = n11 + n12 + n21 + n22;

        return f;

    }

    public double multip(OMat2x2 b){
        double n11, n12;

        double n21, n22;
        //
        n11 = (this.m11 *  b.m11 ) + (this.m12 * b.m21);
        n12 = (this.m11 *  b.m12 ) + (this.m12 * b.m22);
        n21 = (this.m21 *  b.m11 ) + (this.m22 * b.m21);
        n22 = (this.m21 *  b.m12 ) + (this.m22 * b.m22);

        double p = n11 + n12 + n21 + n22;
        //
        return  p;
    }

    public double determinante(){
        double n11, n12;

        double n21, n22;

        n11 = this.m11;
        n12 = this.m12;
        n21 = this.m21;
        n22 = this.m22;

        double d = (n11 * n22) - (n12 * n21);

        return d;
    }




    public static OMat2x2 identidad()

    {
        return new OMat2x2(1,0,0,1);
    }



    public static OMat2x2 rotacion(double alpha)
    {
        double  r11,r12,
                r21,r22;
        r11 = Math.cos(alpha);
        r12 = -Math.sin(alpha);
        r21 = Math.sin(alpha);
        r22 = Math.cos(alpha);
        return new OMat2x2(r11,r12,
                r21,r22);
    }




    // v * M => vector
    public OVecR2 mult(OVecR2 a)
    {
        return new OVecR2(a.getX()*this.m11 + a.getY()*this.m21,a.getX()*this.m12 + a.getY()*this.m22);
    }
    @Override
    public String toString()
    {
        return "[ "+getM11()+"      "+getM12()+ " ]\n[ " +getM21()+"      "+getM22()+" ]";
    }



}

