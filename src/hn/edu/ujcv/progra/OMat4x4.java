package hn.edu.ujcv.progra;

public class OMat4x4 {
    // miembros
    private double mat11, mat12, mat13, mat14;
    private double mat21, mat22, mat23, mat24;
    private double mat31, mat32, mat33, mat34;
    private double mat41, mat42, mat43, mat44;

    //constructores


    public OMat4x4(double mat11, double mat12, double mat13, double mat14, double mat21, double mat22, double mat23, double mat24, double mat31, double mat32, double mat33, double mat34,
                   double mat41, double mat42, double mat43, double mat44) {
        this.mat11 = mat11;this.mat12 = mat12;
        this.mat13 = mat13;this.mat14 = mat14;
        this.mat21 = mat21;this.mat22 = mat22;
        this.mat23 = mat23;this.mat24 = mat24;
        this.mat31 = mat31;this.mat32 = mat32;
        this.mat33 = mat33;this.mat34 = mat34;
        this.mat41 = mat41;this.mat42 = mat42;
        this.mat43 = mat43;this.mat44 = mat44;

        double L = mat11 + mat12 + mat13 + mat14 + mat21 + mat22 + mat23 + mat24 + mat31 + mat32 + mat33 + mat34 + mat41 + mat42 + mat43 + mat44;
    }

    public OMat4x4(OVecR3 a, OVecR3 b, OVecR3 c) {
    }


    // accesoras y mutadoras
    public double getMat11() {
        return mat11;
    }

    public void setMat11(double mat11) {
        this.mat11 = mat11;
    }

    public double getMat12() {
        return mat12;
    }

    public void setMat12(double mat12) {
        this.mat12 = mat12;
    }

    public double getMat13() {
        return mat13;
    }

    public void setMat13(double mat13) {
        this.mat13 = mat13;
    }
    public  double getMat14() { return mat14; }
    public void setMat14(double mat14) { this.mat14 = mat14; }


    public double getMat21() {
        return mat21;
    }

    public void setMat21(double mat21) {
        this.mat21 = mat21;
    }

    public double getMat22() {
        return mat22;

    }

    public void setMat22(double mat22) {
        this.mat22 = mat22;
    }

    public double getMat23() {
        return mat23;
    }

    public void setMat23(double mat23) {
        this.mat23 = mat23;
    }
    public double getMat24() { return mat24; }
    public void setMat24(double mat24) { this.mat24 = mat24; }


    public double getMat31() {
        return mat31;
    }

    public void setMat31(double mat31) {
        this.mat31 = mat31;
    }

    public double getMat32() {
        return mat32;

    }

    public void setMat32(double mat32) {
        this.mat32 = mat32;
    }

    public double getMat33() {
        return mat33;
    }

    public void setMat33(double mat33) {
        this.mat33 = mat33;
    }

    public double getMat34() { return mat34; }


    public void setMat34(double mat34) { this.mat34 = mat34; }


    public double getMat41() { return mat41; }



    public void setMat41(double mat41) { this.mat41 = mat41; }

    public double getMat42() { return mat42; }



    public void setMat42(double mat42) { this.mat42 = mat42; }


    public double getMat43() { return mat43; }


    public void setMat43(double mat43) { this.mat43 = mat43; }



    public double getMat44() { return mat44; }




    public void setMat44(double mat44) { this.mat44 = mat44; }
    // metodos


    public  OMat4x4 transpuesta() {
        return new OMat4x4(this.mat11,
                this.mat21,
                this.mat31,
                this.mat41,
                this.mat12,
                this.mat22,
                this.mat32,
                this.mat42,
                this.mat13,
                this.mat23,
                this.mat33,
                this.mat43,
                this.mat14,
                this.mat24,
                this.mat34,
                this.mat44);
    }

    public OMat4x4 suma(OMat4x4 b)
    {
        double r11, r12, r13, r14;  double r21, r22, r23, r24; double r31, r32, r33, r34; double r41, r42, r43, r44;
        r11 = this.mat11 + b.mat11; r12 = this.mat12 + b.mat12; r13 = this.mat13 + b.mat13; r14 = this.mat14 + b.mat14;
        r21 = this.mat21 + b.mat21; r22 = this.mat22 + b.mat22; r23 = this.mat23 + b.mat23; r24 = this.mat24 + b.mat24;
        r31 = this.mat31 + b.mat31; r32 = this.mat32 + b.mat32; r33 = this.mat33 + b.mat33; r34 = this.mat34 + b.mat34;
        r41 = this.mat41 + b.mat41; r42 = this.mat42 + b.mat42; r43 = this.mat43 + b.mat43; r44 = this.mat44 + b.mat44;
        return new OMat4x4(r11,r12,r13,r14, r21,r22,r23,r24, r31,r32,r33,r34, r41,r42,r43,r44);
    }


    public double resta(OMat3x3 b) {
        double n11, n12, n13;
        double n21, n22, n23;
        double n31, n32, n33;

        n11 = this.mat11 - b.m11;
        n12 = this.mat12 - b.m12;
        n13 = this.mat13 - b.m13;
        n21 = this.mat21 - b.m21;
        n22 = this.mat22 - b.m22;
        n23 = this.mat23 - b.m23;
        n31 = this.mat31 - b.m31;
        n32 = this.mat32 - b.m32;
        n33 = this.mat33 - b.m33;

        double g = n11 - n12 - n13 - n21 - n22 - n23 - n31 - n32 - n33;

        return g;
    }

    public double multiplicacion(OMat3x3 b) {
        double n11, n12, n13;
        double n21, n22, n23;
        double n31, n32, n33;

        n11 = (this.mat11 * b.m11) + (this.mat12 * b.m21);
        n12 = (this.mat11 * b.m12) + (this.mat12 * b.m22);
        n13 = (this.mat11 * b.m13) + (this.mat13 * b.m23);
        n21 = (this.mat21 * b.m11) + (this.mat22 * b.m21);
        n22 = (this.mat21 * b.m12) + (this.mat22 * b.m22);
        n23 = (this.mat21 * b.m23) + (this.mat23 * b.m23);
        n31 = (this.mat31 * b.m31) + (this.mat13 * b.m31);
        n32 = (this.mat31 * b.m32) + (this.mat32 * b.m32);
        n33 = (this.mat31 * b.m33) + (this.mat33 * b.m32);


        double p = n11 + n12 + n13 + n21 + n22 + n23 + n31 + n32 + n33;
        //
        return p;
    }

    // accesoras y mutadoras

    // metodos

    // constructores
}
