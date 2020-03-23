package hn.edu.ujcv.progra;

public class OMat3x3 {
    // miembros
    private double m11, m12, m13;
    private double m21, m22, m23;
    private double m31, m32, m33;

    //constructoress


    public OMat3x3() {
        this.m11 = m11; this.m12 = m12; this.m13 = m13; this.m21 = m21; this.m22 = m22;
        this.m23 = m23; this.m31 = m31; this.m32 = m32; this.m33 = m33;
        double L = m11 + m12 + m13+ m21 + m22 + m23+  m31 + m32 + m33;
    }




    // accesoras y mutadoras
    public double getM11() {
        return m11;
    }

    public void setM11(double m11) {
        this.m11 = m11;
    }

    public double getM12() {
        return m12;
    }

    public void setM12(double m12) {
        this.m12 = m12;
    }

    public double getM13() {
        return m13;
    }

    public void setM13(double m13) {
        this.m13 = m13;
    }

    public double getM21() {
        return m21;
    }

    public void setM21(double m21) {
        this.m21 = m21;
    }

    public double getM22() {
        return m22;

    }

    public void setM22(double m22) {
        this.m22 = m22;
    }

    public double getM23() {
        return m23;
    }

    public void setM23(double m23) {
        this.m23 = m23;
    }

    public double getM31() {
        return m31;
    }

    public void setM31(double m31) {
        this.m31 = m31;
    }

    public double getM32() {
        return m32;

    }

    public void setM32(double m32) {
        this.m32 = m32;
    }

    public double getM33() {
        return m33;
    }

    public void setM33(double m33) {
        this.m33 = m33;
    }

    public double transpuesta() {
        double g = this.m23 + this.m22 + this.m21 + this.m13 + this.m12 + this.m11 + this.m33 + this.m32 + this.m31;
        return g;
    }

    public double suma(OMat3x3 b) {
        double n11, n12, n13;
        double n21, n22, n23;
        double n31, n32, n33;

        n11 = this.m11 + b.m11;
        n12 = this.m12 + b.m12;
        n13 = this.m13 + b.m13;
        n21 = this.m21 + b.m21;
        n22 = this.m22 + b.m22;
        n23 = this.m23 + b.m23;
        n31 = this.m31 + b.m31;
        n32 = this.m32 + b.m32;
        n33 = this.m33 + b.m33;

        double h = n11 + n12 + n13 + n21 + n22 + n23 + n31 + n32 + n33;

        return h;
    }

    public double resta(OMat3x3 b) {
        double n11, n12, n13;
        double n21, n22, n23;
        double n31, n32, n33;

        n11 = this.m11 - b.m11;
        n12 = this.m12 - b.m12;
        n13 = this.m13 - b.m13;
        n21 = this.m21 - b.m21;
        n22 = this.m22 - b.m22;
        n23 = this.m23 - b.m23;
        n31 = this.m31 - b.m31;
        n32 = this.m32 - b.m32;
        n33 = this.m33 - b.m33;

        double g = n11 - n12 - n13 - n21 - n22 - n23 - n31 - n32 - n33;

        return g;
    }

    public double multiplicacion(OMat3x3 b) {
        double n11, n12, n13;
        double n21, n22, n23;
        double n31, n32, n33;

        n11 = (this.m11 * b.m11) + (this.m12 * b.m21);
        n12 = (this.m11 * b.m12) + (this.m12 * b.m22);
        n13 = (this.m11 * b.m13) + (this.m13 * b.m23);
        n21 = (this.m21 * b.m11) + (this.m22 * b.m21);
        n22 = (this.m21 * b.m12) + (this.m22 * b.m22);
        n23 = (this.m21 * b.m23) + (this.m23 * b.m23);
        n31 = (this.m31 * b.m31) + (this.m13 * b.m31);
        n32 = (this.m31 * b.m32) + (this.m32 * b.m32);
        n33 = (this.m31 * b.m33) + (this.m33 * b.m32);


        double p = n11 + n12 + n13 + n21 + n22 + n23 + n31 + n32 + n33;
        //
        return p;
    }
    public double determinante(OMat3x3 e2)
    {
        double solucion;
        solucion = (this.m11*this.m22*this.m33) + (this.m12*this.m23*this.m31)
                + (this.m13*this.m21*this.m32)
                - (this.m31*this.m22*this.m13) - (this.m32*this.m23*this.m11)
                - (this.m33*this.m21*this.m12);

        return solucion;
    }

    // Metodos de la clase.
    public static OMat3x3 rotacionX(double alpha)
    {
        double  r22,r23,
                r32,r33;
        r22 = Math.cos(alpha);
        r23 = -Math.sin(alpha);
        r32 = Math.sin(alpha);
        r33 = Math.cos(alpha);
        return new OMat3x3(
        );
    }

    public static OMat3x3 rotacionY(double alpha, int a22, int a23, int a31, int a32, int a33)
    {
        double n11,n13;
        double n31,n33;
        n11 = Math.cos(alpha); n13 = Math.sin(alpha);n31 = -Math.sin(alpha); n33 = Math.cos(alpha);

        return new OMat3x3
                ();
    }

    public static OMat3x3 rotacionZ(double alpha)
    {
        double n11,n12;
        double n21,n22;
        n11 = Math.cos(alpha);
        n12 = Math.sin(alpha);
        n21 = -Math.sin(alpha);
        n22 = Math.cos(alpha);
        return new OMat3x3();
    }

    public static OMat3x3 identidad(){
        return new OMat3x3();
    }

    @Override
    public String toString()
    {
        return "[ "+getM11()+"" +
                ""+getM12()+"" +
                ""+getM13()+" ]\n[" +
                ""+getM21()+"" +
                ""+getM22()+"" +
                ""+getM23()+ " ]\n[ " +
                ""+getM31()+"" +
                ""+getM32()+"" +
                ""+getM33()+" ]";
    }


    public double determinante() {
        return 0;
    }
}

