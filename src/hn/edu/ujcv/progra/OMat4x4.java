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
        this.mat11 = mat11;
        this.mat12 = mat12;
        this.mat13 = mat13;
        this.mat14 = mat14;
        this.mat21 = mat21;
        this.mat22 = mat22;
        this.mat23 = mat23;
        this.mat24 = mat24;
        this.mat31 = mat31;
        this.mat32 = mat32;
        this.mat33 = mat33;
        this.mat34 = mat34;
        this.mat41 = mat41;
        this.mat42 = mat42;
        this.mat43 = mat43;
        this.mat44 = mat44;

        double L = mat11 + mat12 + mat13 + mat14 + mat21 + mat22 + mat23 + mat24 + mat31 + mat32 + mat33 + mat34 + mat41 + mat42 + mat43 + mat44;
    }

    public OMat4x4() {
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

    public double getMat14() {
        return mat14;
    }

    public void setMat14(double mat14) {
        this.mat14 = mat14;
    }


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

    public double getMat24() {
        return mat24;
    }

    public void setMat24(double mat24) {
        this.mat24 = mat24;
    }


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

    public double getMat34() {
        return mat34;
    }


    public void setMat34(double mat34) {
        this.mat34 = mat34;
    }


    public double getMat41() {
        return mat41;
    }


    public void setMat41(double mat41) {
        this.mat41 = mat41;
    }

    public double getMat42() {
        return mat42;
    }


    public void setMat42(double mat42) {
        this.mat42 = mat42;
    }


    public double getMat43() {
        return mat43;
    }


    public void setMat43(double mat43) {
        this.mat43 = mat43;
    }


    public double getMat44() {
        return mat44;
    }


    public void setMat44(double mat44) {
        this.mat44 = mat44;
    }
    // metodos


    public OMat4x4 transpuesta() {
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

    public OMat4x4 suma(OMat4x4 b) {
        double r11, r12, r13, r14;
        double r21, r22, r23, r24;
        double r31, r32, r33, r34;
        double r41, r42, r43, r44;
        r11 = this.mat11 + b.mat11;
        r12 = this.mat12 + b.mat12;
        r13 = this.mat13 + b.mat13;
        r14 = this.mat14 + b.mat14;
        r21 = this.mat21 + b.mat21;
        r22 = this.mat22 + b.mat22;
        r23 = this.mat23 + b.mat23;
        r24 = this.mat24 + b.mat24;
        r31 = this.mat31 + b.mat31;
        r32 = this.mat32 + b.mat32;
        r33 = this.mat33 + b.mat33;
        r34 = this.mat34 + b.mat34;
        r41 = this.mat41 + b.mat41;
        r42 = this.mat42 + b.mat42;
        r43 = this.mat43 + b.mat43;
        r44 = this.mat44 + b.mat44;
        return new OMat4x4(r11, r12, r13, r14, r21, r22, r23, r24, r31, r32, r33, r34, r41, r42, r43, r44);
    }


    public OMat4x4 resta(OMat4x4 b) {
        return new OMat4x4(this.mat11 - b.mat11, this.mat12 - b.mat12, this.mat13 - b.mat13, this.mat14 - b.mat14,
                this.mat21 - b.mat21, this.mat22 - b.mat22, this.mat23 - b.mat23, this.mat24 - b.mat24,
                this.mat31 - b.mat31, this.mat32 - b.mat32, this.mat33 - b.mat33, this.mat34 - b.mat34,
                this.mat41 - b.mat41, this.mat42 - b.mat42, this.mat43 - b.mat43, this.mat44 - b.mat44);
    }

    public static OMat4x4 identidad()
    {
        return new OMat4x4(1, 0, 0, 0,
                0, 1, 0, 0,
                0, 0, 1, 0,
                0, 0, 0, 1);
    }
    public OMat4x4 multi(OMat4x4 b) {
        return new OMat4x4(this.mat11 * b.mat11 + this.mat12 * b.mat21 + this.mat13 * b.mat31 + this.mat14 * b.mat41, this.mat11 * b.mat12 + this.mat12 * b.mat22 + this.mat13 * b.mat32 + this.mat14 * b.mat42, this.mat11 * b.mat13 + this.mat12 * b.mat23 + this.mat13 * b.mat33 + this.mat14 * b.mat43, this.mat11 * b.mat14 + this.mat12 * b.mat24 + this.mat13 * b.mat34 + this.mat14 * b.mat44,
                this.mat21 * b.mat11 + this.mat22 * b.mat21 + this.mat23 * b.mat31 + this.mat24 * b.mat41, this.mat21 * b.mat12 + this.mat22 * b.mat22 + this.mat23 * b.mat32 + this.mat24 * b.mat42, this.mat21 * b.mat13 + this.mat22 * b.mat23 + this.mat23 * b.mat33 + this.mat24 * b.mat43, this.mat21 * b.mat14 + this.mat22 * b.mat24 + this.mat23 * b.mat34 + this.mat24 * b.mat44,
                this.mat31 * b.mat11 + this.mat32 * b.mat21 + this.mat33 * b.mat31 + this.mat34 * b.mat41, this.mat31 * b.mat12 + this.mat32 * b.mat22 + this.mat33 * b.mat32 + this.mat34 * b.mat42, this.mat31 * b.mat13 + this.mat32 * b.mat23 + this.mat33 * b.mat33 + this.mat34 * b.mat43, this.mat31 * b.mat14 + this.mat32 * b.mat24 + this.mat33 * b.mat34 + this.mat34 * b.mat44,
                this.mat41 * b.mat11 + this.mat42 * b.mat21 + this.mat43 * b.mat31 + this.mat44 * b.mat41, this.mat41 * b.mat12 + this.mat42 * b.mat22 + this.mat43 * b.mat32 + this.mat44 * b.mat42, this.mat41 * b.mat13 + this.mat42 * b.mat23 + this.mat43 * b.mat33 + this.mat44 * b.mat43, this.mat41 * b.mat14 + this.mat42 * b.mat24 + this.mat43 * b.mat34 + this.mat44 * b.mat44);
    }

    public double determinante(int a22, int a23, int a31, int a32, int a33) {
        double respuesta;
        OMat3x3 cofA = new OMat3x3(this.mat22, this.mat23, this.mat24, this.mat32, a22, a23, a31, a32, a33);
        OMat3x3 cofB = new OMat3x3(this.mat21, this.mat23, this.mat24, this.mat31, a22, a23, a31, a32, a33);
        OMat3x3 cofC = new OMat3x3(this.mat21, this.mat22, this.mat24, this.mat31, a22, a23, a31, a32, a33);
        OMat3x3 cofD = new OMat3x3(this.mat21, this.mat22, this.mat23, this.mat31, a22, a23, a31, a32, a33);
        respuesta = (this.mat11 * cofA.determinante()) - (this.mat12 * cofB.determinante()) + (this.mat13 * cofC.determinante()) - (this.mat14 * cofD.determinante());
        return respuesta;
    }

    public static OMat4x4 rotX(double alpha) {
        double r11, r12;
        double r21, r22;
        r11 = Math.cos(alpha);
        r12 = Math.sin(alpha);
        r21 = -Math.sin(alpha);
        r22 = Math.cos(alpha);
        return new OMat4x4(r11, r12, 0, 0, r21, r22, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
    }

    public static OMat4x4 rotY(double alpha) {
        double g11, g13;
        double g31, g33;
        g11 = Math.cos(alpha);
        g13 = -Math.sin(alpha);
        g31 = Math.sin(alpha);
        g33 = Math.cos(alpha);

        return new OMat4x4(g11, 0, g13, 0, 0, 1, 0, 0, g31, 0, g33, 0, 0, 0, 0, 1);
    }

    public static OMat4x4 rotZ(double alpha) {
        double g22, g23;
        double g32, g33;
        g22 = Math.cos(alpha);
        g23 = Math.sin(alpha);
        g32 = -Math.sin(alpha);
        g33 = Math.cos(alpha);
        return new OMat4x4(1, 0, 0, 0, 0, g22, g23, 0, 0, g32, g33, 0, 0, 0, 0, 1);
    }

    public static OMat4x4 rotW(double alpha) {

        return new OMat4x4();
    }

    public Object inversa(int a22, int a23, int a31, int a32, int a33) {
        if (this.determinante(a22, a23, a31, a32, a33) != 0) {
            double r11, r12, r13, r14;
            double r21, r22, r23, r24;
            double r31, r32, r33, r34;
            double r41, r42, r43, r44;
            double det;
            det = this.determinante(a22, a23, a31, a32, a33);
            OMat3x3 adj11 = new OMat3x3(this.mat22, this.mat23, this.mat24, this.mat32, a22, a23, a31, a32, a33);
            OMat3x3 adj12 = new OMat3x3(this.mat21, this.mat23, this.mat24, this.mat31, a22, a23, a31, a32, a33);
            OMat3x3 adj13 = new OMat3x3(this.mat21, this.mat22, this.mat24, this.mat31, a22, a23, a31, a32, a33);
            OMat3x3 adj14 = new OMat3x3(this.mat21, this.mat22, this.mat23, this.mat31, a22, a23, a31, a32, a33);
            OMat3x3 adj21 = new OMat3x3(this.mat12, this.mat13, this.mat14, this.mat32, a22, a23, a31, a32, a33);
            OMat3x3 adj22 = new OMat3x3(this.mat11, this.mat13, this.mat14, this.mat31, a22, a23, a31, a32, a33);
            OMat3x3 adj23 = new OMat3x3(this.mat11, this.mat12, this.mat14, this.mat31, a22, a23, a31, a32, a33);
            OMat3x3 adj24 = new OMat3x3(this.mat11, this.mat12, this.mat13, this.mat31, a22, a23, a31, a32, a33);
            OMat3x3 adj31 = new OMat3x3(this.mat12, this.mat13, this.mat14, this.mat22, a22, a23, a31, a32, a33);
            OMat3x3 adj32 = new OMat3x3(this.mat11, this.mat13, this.mat14, this.mat21, a22, a23, a31, a32, a33);
            OMat3x3 adj33 = new OMat3x3(this.mat11, this.mat12, this.mat14, this.mat21, a22, a23, a31, a32, a33);
            OMat3x3 adj34 = new OMat3x3(this.mat11, this.mat12, this.mat13, this.mat21, a22, a23, a31, a32, a33);
            OMat3x3 adj41 = new OMat3x3(this.mat12, this.mat13, this.mat14, this.mat22, a22, a23, a31, a32, a33);
            OMat3x3 adj42 = new OMat3x3(this.mat11, this.mat13, this.mat14, this.mat21, a22, a23, a31, a32, a33);
            OMat3x3 adj43 = new OMat3x3(this.mat11, this.mat12, this.mat14, this.mat21, a22, a23, a31, a32, a33);
            OMat3x3 adj44 = new OMat3x3(this.mat11, this.mat12, this.mat13, this.mat21, a22, a23, a31, a32, a33);
            r11 = Math.pow(-1, 2) * adj11.determinante();
            r12 = Math.pow(-1, 3) * adj12.determinante();
            r13 = Math.pow(-1, 4) * adj13.determinante();
            r14 = Math.pow(-1, 5) * adj14.determinante();
            r21 = Math.pow(-1, 3) * adj21.determinante();
            r22 = Math.pow(-1, 4) * adj22.determinante();
            r23 = Math.pow(-1, 5) * adj23.determinante();
            r24 = Math.pow(-1, 6) * adj24.determinante();
            r31 = Math.pow(-1, 4) * adj31.determinante();
            r32 = Math.pow(-1, 5) * adj32.determinante();
            r33 = Math.pow(-1, 6) * adj33.determinante();
            r34 = Math.pow(-1, 7) * adj34.determinante();
            r41 = Math.pow(-1, 5) * adj41.determinante();
            r42 = Math.pow(-1, 6) * adj42.determinante();
            r43 = Math.pow(-1, 7) * adj43.determinante();
            r44 = Math.pow(-1, 8) * adj44.determinante();

            OMat4x4 a = new OMat4x4(r11, r12, r13, r14, r21, r22, r23, r24, r31, r32, r33, r34, r41, r42, r43, r44);
            OMat4x4 trans = new OMat4x4();
            trans = a.transpuesta();
            return new OMat4x4(trans.mat11 / det, trans.mat12 / det, trans.mat13 / det, trans.mat14 / det,
                    trans.mat21 / det, trans.mat22 / det, trans.mat23 / det, trans.mat24 / det,
                    trans.mat31 / det, trans.mat32 / det, trans.mat33 / det, trans.mat34 / det,
                    trans.mat41 / det, trans.mat42 / det, trans.mat43 / det, trans.mat44 / det);
        } else {
            return new OMat4x4(0, 0, 0, 0,
                    0, 0, 0, 0,
                    0, 0, 0, 0,
                    0, 0, 0, 0);
        }





    }

}

