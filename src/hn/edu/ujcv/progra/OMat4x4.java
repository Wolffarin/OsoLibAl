package hn.edu.ujcv.progra;

public class OMat4x4 {
    // miembros
    private double m11, m12, m13, m14;
    private double m21, m22, m23, m24;
    private double m31, m32, m33, m34;
    private double m41, m42, m43 , m44;

    //constructores


    public OMat4x4(double m11, double m12, double m13, double m14, double m21, double m22, double m23,double m24, double m31, double m32, double m33 , double m34,
                   double m41, double m42, double m43, double m44) {
        this.m11 = m11;
        this.m12 = m12;
        this.m13 = m13;
        this.m14 = m14;
        this.m21 = m21;
        this.m22 = m22;
        this.m23 = m23;
        this.m24 = m24;
        this.m31 = m31;
        this.m32 = m32;
        this.m33 = m33;
        this.m34 = m34;
        this.m41 = m41;
        this.m42 = m42;
        this.m43 = m43;
        this.m44 = m44;

        double L = m11 + m12 + m13 + m14+ m21 + m22 + m23 + m24 + m31 + m32 + m33 + m34 + m41 + m42 + m43 + m44;
    }

    public OMat4x4(OVecR3 a, OVecR3 b, OVecR3 c) {
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

    // accesoras y mutadoras

    // metodos

    // constructores
}
