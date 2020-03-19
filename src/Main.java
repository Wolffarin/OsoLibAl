import hn.edu.ujcv.progra.*;

public class Main {
    public static void main(String[] args) {
        // Creando Obtetos
       //TODAS LA MATRICES DE 2X2
        OMat2x2 M1 = new OMat2x2(-5,3,4,7);
        OMat2x2 M2 = new OMat2x2(9,0,2,-5);
        OMat2x2 M3 = new OMat2x2(5,3,-1,4);
        OMat2x2 M4 = new OMat2x2(7,5,-2,9);
        // TODAS LAS MATRICES QUE CORRESPONDEN A 3X3
        OMat3x3 Ma1 = new OMat3x3(0,-7,3,2,4,-1,12,7,-6);
        OMat3x3 Ma2 = new OMat3x3(5,4,-3,0,-6,10,-2,8,11);
        OMat3x3 Ma3 = new OMat3x3(-2,4,5,6,7,-3,3,0,2);
        // TODAS LAS MATRICES QUE CORRESPONDEN A 4X4
        OMat4x4 M1 = new OMat4x4(1,2,3,4,
                5,6,7,8,
                9,10,11,12,
                13, 14,15,16);
        OMat4x4 M2 = new OMat4x4(-1,5,-1,6,
                4,5,10,8,
                -4,8,9,3,
                0,-8,-5,3);

        // BASE DEL PROGRAMA PARA EJECUCION



























        // TODOS LOS VECTORES CORRESPONDIENTES EN R2
        OVecR2 V1 = new OVecR2(-5, 4);
        OVecR2 V2 = new OVecR2(-3, -8);
        OVecR2 V3 = new OVecR2(-11, -2);
        // TODOS LOS VECTORES CORRESPONDIENTES EN R3
        OVecR3 Ve1 = new OVecR3(2, 6, 3);
        OVecR3 Ve2 = new OVecR3(1, 3, 4);
        OVecR3 Ve3 = new OVecR3(-3, -2, 5);
        OVecR3 Ve4 = new OVecR3(6, -10, -1);
        // TODOS LOS VECTORES CORRESPONDIENTES A R4
        OVecR4 Vec1 = new OVecR4(5,7,6,3);
        OVecR4 Vec2 = new OVecR4(1,2,3,4);
        OVecR4 Vec3 = new OVecR4(9,1,0,6);


    }
}