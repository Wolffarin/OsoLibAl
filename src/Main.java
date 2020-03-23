import hn.edu.ujcv.progra.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Lectorteclado lector = new Lectorteclado();

        Scanner sc = new Scanner(System.in);


        String volvermenuprincipal;

        Object OVecR4;
        Lectorteclado lt = Lectorteclado.getInstance();
        do {


            System.out.println("                      Bienvenido a la calculadora de algebra lineal");


            System.out.println("Estamos a su Dispocicion");


            System.out.println("¿Que operacion desea Realizar?");


            System.out.println("1. Vectores ============ 2. Matrices ============== 3. Salir");


            System.out.println(" seleccione la opcion deseada");


            int seleccion = sc.nextInt();


            switch (seleccion) {
                case 1:
                    System.out.println("Seleccione el Tamaño del Vector que desea Calcular");

                    System.out.println(" 1.2x2 ======== 2.3x3 ======== 3.4x4 ");

                    int seleccion1 = sc.nextInt();
                    switch (seleccion1) {

                        case 1:
                            System.out.println("Seleccione la operacion que desee realizar");

                            System.out.println(" 1.SUMA ======== 2.RESTA ======== 3.MAGNITUD ============= 4. PRODUCTO PUNTO =========");

                            int seleccion2 = sc.nextInt();

                            switch (seleccion2) {

                                case 1:
                                    System.out.println("DATOS DE LA PRIMERA FILA");
                                    System.out.println("INGRESE EL PRIMER VALOR X0");
                                    double x = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    System.out.println("INGRESE EL PRIMER VALOR Y0");
                                    double y = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    System.out.println("DATOS DE LA SEGUNDA FILA");
                                    System.out.println("INGRESE EL PRIMER VALOR X1");
                                    double x1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    System.out.println("INGRESE EL PRIMER VALOR Y1");
                                    double y1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    OVecR2 I1 = new OVecR2(x, y);
                                    OVecR2 I2 = new OVecR2(x1, y1);
                                    System.out.println("EL RESULTADO OBTENIDO ES" + I1.suma(I2));
                                    System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                    System.out.println("S/N");
                                     volvermenuprincipal = sc.next();
                                    break;
                                case 2:
                                    System.out.println("DATOS DE LA PRIMERA FILA");
                                    System.out.println("INGRESE EL PRIMER VALOR X0");
                                    double a = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    System.out.println("INGRESE EL PRIMER VALOR Y0");
                                    double b = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    System.out.println("DATOS DE LA SEGUNDA FILA");
                                    System.out.println("INGRESE EL PRIMER VALOR X1");
                                    double a1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    System.out.println("INGRESE EL PRIMER VALOR Y1");
                                    double b1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    OVecR2 R1 = new OVecR2(a, b);
                                    OVecR2 R2 = new OVecR2(a1, b1);
                                    System.out.println("EL RESULTADO OBTENIDO ES" + R1.resta(R2));
                                    System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                    System.out.println("S/N");
                                    volvermenuprincipal = sc.next();
                                    break;
                                case 3:
                                    System.out.println("DATOS DE LA PRIMERA FILA");
                                    System.out.println("INGRESE EL PRIMER VALOR X0");
                                    double m = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    System.out.println("INGRESE EL PRIMER VALOR Y0");
                                    double n = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    OVecR2 g = new OVecR2(m, n);

                                    System.out.println("EL RESULTADO OBTENIDO ES" + g.magnitud());
                                    System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                    System.out.println("S/N");
                                    volvermenuprincipal = sc.next();
                                    break;
                                case 4:
                                    System.out.println("DATOS DE LA PRIMERA FILA");
                                    System.out.println("INGRESE EL PRIMER VALOR X0");
                                    double p = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    System.out.println("INGRESE EL PRIMER VALOR Y0");
                                    double q = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    System.out.println("DATOS DE LA SEGUNDA FILA");
                                    System.out.println("INGRESE EL PRIMER VALOR X1");
                                    double p1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    System.out.println("INGRESE EL PRIMER VALOR Y1");
                                    double q1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                    OVecR2 E1 = new OVecR2(p, q);
                                    OVecR2 E2 = new OVecR2(p1, q1);
                                    System.out.println("EL RESULTADO OBTENIDO ES" + E1.prodPunto(E2));
                                    System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                    System.out.println("S/N");
                                    volvermenuprincipal = sc.next();
                                    break;
                                case 5:
                                    break;
                            }

                        case 2:


                            System.out.println("Seleccione la operacion que desee realizar");
                    }
                    System.out.println(" 1.SUMA ======== 2.RESTA ======== 3.MAGNITUD ============= 4. PRODUCTO PUNTO ========= 5. PRODUCTO CRUZ");

                    int seleccion4 = sc.nextInt();

                    switch (seleccion4) {

                        case 1:
                            System.out.println("DATOS DE LA PRIMERA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR X0");
                            double x = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR Y0");
                            double y = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR z0");
                            double z = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                            System.out.println("DATOS DE LA SEGUNDA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR X1");
                            double x1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR Y1");
                            double y1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR Z1");
                            double z1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            OVecR3 I1 = new OVecR3(x, y, z);
                            OVecR3 I2 = new OVecR3(x1, y1, z1);

                            System.out.println("EL RESULTADO OBTENIDO ES" + I1.suma(I2));
                            System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                            System.out.println("S/N");
                            volvermenuprincipal = sc.next();
                            break;
                        case 2:
                            System.out.println("DATOS DE LA PRIMERA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR X0");
                            double a = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR Y0");
                            double b = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR D0");
                            double d = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("DATOS DE LA SEGUNDA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR X1");
                            double a1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR Y1");
                            double b1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR D1");

                            double d1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            OVecR3 R1 = new OVecR3(a, b, d);
                            OVecR3 R2 = new OVecR3(a1, b1, d1);
                            System.out.println("EL RESULTADO OBTENIDO ES" + R1.resta(R2));
                            System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                            System.out.println("S/N");
                            volvermenuprincipal = sc.next();
                            break;
                        case 3:
                            System.out.println("DATOS DE LA PRIMERA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR X0");
                            double m = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL segundo VALOR Y0");
                            double n = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL TERCER VALOR Y0");
                            double o = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            OVecR3 g = new OVecR3(m, n, o);

                            System.out.println("EL RESULTADO OBTENIDO ES" + g.magnitud());
                            System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                            System.out.println("S/N");
                            volvermenuprincipal = sc.next();
                            break;
                        case 4:
                            System.out.println("DATOS DE LA PRIMERA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR p0");
                            double p = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR q0");
                            double q = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR s0");
                            double s = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                            System.out.println("DATOS DE LA SEGUNDA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR p1");
                            double p1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR q1");
                            double q1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR s1");
                            double s1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                            OVecR3 E1 = new OVecR3(p, q, s);
                            OVecR3 E2 = new OVecR3(p1, q1, s1);
                            System.out.println("EL RESULTADO OBTENIDO ES" + E1.prodPunto(E2));
                            System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                            System.out.println("S/N");
                            volvermenuprincipal = sc.next();
                            break;
                        case 5:
                            System.out.println("DATOS DE LA PRIMERA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR g0");
                            double u = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR h0");
                            double h = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR j0");
                            double j = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                            System.out.println("DATOS DE LA SEGUNDA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR p1");
                            double u1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR q1");
                            double h1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR s1");
                            double j1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            OVecR3 G1 = new OVecR3(u, h, j);
                            OVecR3 G2 = new OVecR3(u1, h1, j1);
                            System.out.println("EL RESULTADO OBTENIDO ES" + G1.prodCruz(G2));
                            System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                            System.out.println("S/N");
                            volvermenuprincipal = sc.next();
                            break;
                        case 6:
                            break;
                    }


                case 3:
                    System.out.println("Seleccione la operacion que desee realizar");

                    System.out.println(" 1.SUMA ======== 2.RESTA ======== 3.MAGNITUD ============= 4. PRODUCTO PUNTO ========= 5. PRODUCTO CRUZ");

                    int seleccion5 = sc.nextInt();

                    switch (seleccion5) {

                        case 1:
                            System.out.println("DATOS DE LA PRIMERA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR X0");
                            double x = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR Y0");
                            double y = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR z0");
                            double z = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR z0");
                            double w = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("DATOS DE LA SEGUNDA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR X1");
                            double x1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR Y1");
                            double y1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR Z1");
                            double z1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR W1");
                            double w1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                            OVecR4 I1 = new OVecR4(x, y, z, w);
                            OVecR4 I2 = new OVecR4(x1, y1, z1, w1);

                            System.out.println("EL RESULTADO OBTENIDO ES" + I1.suma(I2));
                            System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                            System.out.println("S/N");
                            volvermenuprincipal = sc.next();
                            break;
                        case 2:
                            System.out.println("DATOS DE LA PRIMERA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR X0");
                            double a = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR Y0");
                            double b = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR D0");
                            double d = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR E0");
                            double e = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("DATOS DE LA SEGUNDA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR X1");
                            double a1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR Y1");
                            double b1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR D1");
                            double d1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR E1");
                            double e1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            OVecR4 R1 = new OVecR4(a, b, d, e);
                            OVecR4 R2 = new OVecR4(a1, b1, d1, e1);
                            System.out.println("EL RESULTADO OBTENIDO ES" + R1.resta(R2));
                            System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                            System.out.println("S/N");
                            volvermenuprincipal = sc.next();
                            break;
                        case 3:
                            System.out.println("DATOS DE LA PRIMERA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR X0");
                            double m = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL segundo VALOR Y0");
                            double n = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL TERCER VALOR Y0");
                            double o = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL TERCER VALOR Y0");
                            double j = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            OVecR4 g = new OVecR4(m, n, o, j);

                            System.out.println("EL RESULTADO OBTENIDO ES" + g.magnitud());
                            System.out.println("DESEA CONTINUAR CON OTRA OPERACION?");
                            System.out.println("S/N");
                            volvermenuprincipal = sc.next();
                            break;
                        case 4:
                            System.out.println("DATOS DE LA PRIMERA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR p0");
                            double p = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR q0");
                            double q = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR s0");
                            double s = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR s0");
                            double h = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("DATOS DE LA SEGUNDA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR p1");
                            double p1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR q1");
                            double q1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR s1");
                            double s1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR s1");
                            double h1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                            OVecR4 E1 = new OVecR4(p, q, s, h);
                            OVecR4 E2 = new OVecR4(p1, q1, s1, h1);
                            System.out.println("EL RESULTADO OBTENIDO ES" + E1.prodPunto(E2));
                            System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                            System.out.println("S/N");
                            volvermenuprincipal = sc.next();
                            break;
                        case 5:
                            System.out.println("DATOS DE LA PRIMERA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR T1");
                            double t1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR T2");
                            double t2 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR T2");
                            double t3 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR T3");
                            double t4 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("DATOS DE LA SEGUNDA FILA");
                            System.out.println("INGRESE EL PRIMER VALOR p1");
                            double u1 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR q1");
                            double u2 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR s1");
                            double u3 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            System.out.println("INGRESE EL PRIMER VALOR s1");
                            double u4 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                            OVecR4 G1 = new OVecR4(t1, t2, t3, t4);
                            OVecR4 G2 = new OVecR4(u1, u2, u3, u4);
                            System.out.println("EL RESULTADO OBTENIDO ES" + G1.prodCruz(G2));
                            System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                            System.out.println("S/N");
                            volvermenuprincipal = sc.next();
                            break;
                        case 6:
                            break;
                    }


                case 2:
                    System.out.println("Seleccione el Tamaño de la matriz que desea Calcular");

                    System.out.println(" 1.matriz 2x2 ======== 2.matriz 3x3 ======== 3. matriz 4x4 ");

                    int seleccionmat2 = sc.nextInt();
                    switch (seleccionmat2) {
                     case 1:
                        System.out.println("Seleccione la operacion que desee realizar");

                        System.out.println(" 1.SUMA ======== 2.RESTA ======== 3.MULTIPLICACION ============= 4. DETERMINANTE =========5. IDENTIDAD ========6.ROTACION");

                        int seleccion2 = sc.nextInt();

                        switch (seleccion2) {
                            case 1:
                                System.out.println("Ingres las primeras matrices");
                                System.out.println("m11");
                                double m11 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("m12");
                                double m12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                                System.out.println("m21");
                                double m21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("m22");
                                double m22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                OMat2x2 I1 = new OMat2x2(m11, m12, m21, m22);
                                System.out.println("Ingrese las segundas matrices");
                                System.out.println("p11");
                                double p11 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("p12");
                                double p12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                                System.out.println("p21");
                                double p21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("p22");
                                double p22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                OMat2x2 I2 = new OMat2x2(p11, p12, p21, p22);
                                System.out.println("EL RESULTADO OBTENIDO ES      " + I1.suma(I2));
                                System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                System.out.println("S/N");
                                volvermenuprincipal = sc.next();
                                break;

                            case 2:

                                System.out.println("Ingres las primeras matrices");
                                System.out.println("x11");
                                double x11 = lt.obtenerdoubleValidado("invalido");
                                System.out.println("x12");

                                double x12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("x21");

                                double x21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("x22");

                                double x22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                OMat2x2 D1 = new OMat2x2(x11, x12, x21, x22);
                                System.out.println("Ingrese las segundas matrices");
                                System.out.println("p11");
                                double u11 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("p12");
                                double u12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                                System.out.println("p21");
                                double u21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("p22");
                                double u22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                OMat2x2 D2 = new OMat2x2(u11, u12, u21, u22);
                                System.out.println("EL RESULTADO OBTENIDO ES      " + D1.resta(D2));
                                System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                System.out.println("S/N");
                                volvermenuprincipal = sc.next();
                                break;
                            case 3:
                                System.out.println("Ingres las primeras matrices");
                                System.out.println("s11");
                                double s11 = lt.obtenerdoubleValidado("invalido");
                                System.out.println("s12");

                                double s12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("s21");

                                double s21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("s22");

                                double s22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                OMat2x2 F1 = new OMat2x2(s11, s12, s21, s22);
                                System.out.println("Ingrese las segundas matrices");
                                System.out.println("p11");
                                double q11 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("p12");
                                double q12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                                System.out.println("p21");
                                double q21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("p22");
                                double q22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                OMat2x2 F2 = new OMat2x2(q11, q12, q21, q22);
                                System.out.println("EL RESULTADO OBTENIDO ES      " + F1.multip(F2));
                                System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                System.out.println("S/N");
                                volvermenuprincipal = sc.next();
                                break;
                            case 4:
                                System.out.println("Ingres las primeras matrices");
                                System.out.println("o11");
                                double o11 = lt.obtenerdoubleValidado("invalido");
                                System.out.println("o12");

                                double o12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("o21");

                                double o21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("o22");

                                double o22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                OMat2x2 O1 = new OMat2x2(o11, o12, o21, o22);
                                System.out.println("Ingrese las segundas matrices");
                                System.out.println("p11");
                                double e11 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("p12");
                                double e12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                                System.out.println("p21");
                                double e21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("p22");
                                double e22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                OMat2x2 E2 = new OMat2x2(e11, e12, e21, e22);
                                System.out.println("EL RESULTADO OBTENIDO ES      " + O1.determinante(E2));
                                System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                System.out.println("S/N");
                                volvermenuprincipal = sc.next();
                                break;

                            case 5:
                                System.out.println("Ingres las primeras matrices");
                                System.out.println("z11");
                                double z11 = lt.obtenerdoubleValidado("invalido");
                                System.out.println("z12");

                                double z12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("z21");

                                double z21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("z22");

                                double z22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                OMat2x2 Z1 = new OMat2x2(z11, z12, z21, z22);
                                System.out.println("Ingrese las segundas matrices");
                                System.out.println("i11");
                                double i11 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("i12");
                                double i12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                                System.out.println("i21");
                                double i21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("i22");
                                double i22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                OMat2x2 K2 = new OMat2x2(i11, i12, i21, i22);
                                System.out.println("EL RESULTADO OBTENIDO ES      " + Z1.identidad(K2));
                                System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                System.out.println("S/N");
                                volvermenuprincipal = sc.next();
                                break;
                            case 6:
                                System.out.println("Ingres las primeras matrices");
                                System.out.println("ro11");
                                double ro11 = lt.obtenerdoubleValidado("invalido");
                                System.out.println("ro12");

                                double ro12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("ro21");

                                double ro21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                System.out.println("ro22");

                                double ro22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                OMat2x2 RO1 = new OMat2x2(ro11, ro12, ro21, ro22);
                                double alpha = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println(RO1.rotacion(alpha));

                                System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                System.out.println("S/N");
                                volvermenuprincipal = sc.next();
                                break;
                        }
                     case 2:

                         System.out.println("Seleccione la operacion que desee realizar");                                                                                      
                                                                                                                                                                            
                         System.out.println(" 1.SUMA ======== 2.RESTA ======== 3.MULTIPLICACION ============= 4. DETERMINANTE =========5. IDENTIDAD ========6.ROTACION");   
                                                                                                                                                                            
                         int seleccion3 = sc.nextInt();
                                                                                                                                                                            
                         switch (seleccion3) {
                             case 1:
                                 System.out.println("Ingres las primeras matrices");
                                 System.out.println("m11");
                                 double m11 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("m12");
                                 double m12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                                 System.out.println("m21");
                                 double m21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("m22");
                                 double m22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 OMat2x2 I1 = new OMat2x2(m11, m12, m21, m22);
                                 System.out.println("Ingrese las segundas matrices");
                                 System.out.println("p11");
                                 double p11 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p12");
                                 double p12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                                 System.out.println("p21");
                                 double p21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p22");
                                 double p22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 OMat2x2 I2 = new OMat2x2(p11, p12, p21, p22);
                                 System.out.println("EL RESULTADO OBTENIDO ES      " + I1.suma(I2));
                                 System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                 System.out.println("S/N");
                                 volvermenuprincipal = sc.next();
                                 break;

                             case 2:

                                 System.out.println("Ingres las primeras matrices");
                                 System.out.println("x11");
                                 double x11 = lt.obtenerdoubleValidado("invalido");
                                 System.out.println("x12");

                                 double x12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("x21");
                                 double x13 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("x21");
                                 double x21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("x22");
                                 double x22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("x22");
                                 double x23 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("x23");
                                 double x31 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("x22");
                                 double x32 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("x22");
                                 double x33 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                                 OMat3x3 D1 = new OMat3x3();
                                 System.out.println("Ingrese las segundas matrices");
                                 System.out.println("p11");
                                 double u11 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p12");
                                 double u12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p21");
                                 double u13 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p21");
                                 double u21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p22");
                                 double u22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p22");
                                 double u23 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p31");
                                 double u31 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p22");
                                 double u32 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p33");
                                 double u33 = lt.obtenerdoubleValidado("Ingrese un valor correcto");


                                 OMat3x3 D2 = new OMat3x3();
                                 System.out.println("EL RESULTADO OBTENIDO ES      " + D1.resta(D2));
                                 System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                 System.out.println("S/N");
                                 volvermenuprincipal = sc.next();
                                 break;
                             case 3:
                                 System.out.println("Ingres las primeras matrices");
                                 System.out.println("s11");
                                 double s11 = lt.obtenerdoubleValidado("invalido");
                                 System.out.println("s12");
                                 double s12 = lt.obtenerdoubleValidado("valor incorrecto");
                                 System.out.println("s13");
                                 double s13 = lt.obtenerdoubleValidado("valor incorrecto");

                                 System.out.println("s21");
                                 double s21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("s22");
                                 double s22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("s23");
                                 double s23 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("s31");
                                 double s31 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("s32");
                                 double s32 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("s33");
                                 double s33 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                                 OMat3x3 F1 = new OMat3x3();
                                 System.out.println("Ingrese las segundas matrices");
                                 System.out.println("p11");
                                 double q11 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p12");
                                 double q12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p12");
                                 double q13 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p21");
                                 double q21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p22");
                                 double q22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p23");
                                 double q23 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p31");
                                 double q31 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p32");
                                 double q32 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p33");
                                 double q33 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                                 OMat3x3 F2 = new OMat3x3();
                                 System.out.println("EL RESULTADO OBTENIDO ES      " + F1.multiplicacion(F2));
                                 System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                 System.out.println("S/N");
                                 volvermenuprincipal = sc.next();
                                 break;
                             case 4:
                                 System.out.println("Ingres las primeras matrices");
                                 System.out.println("o11");
                                 double o11 = lt.obtenerdoubleValidado("invalido");
                                 System.out.println("o12");
                                 double o12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("o13");
                                 double o13 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("o21");
                                 double o21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("o22");
                                 double o22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("o23");
                                 double o23 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("o31");
                                 double o31 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("o32");
                                 double o32 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("o33");
                                 double o33 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 OMat3x3 O1 = new OMat3x3();
                                 System.out.println("Ingrese las segundas matrices");
                                 System.out.println("p11");
                                 double e11 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p12");
                                 double e12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p13");
                                 double e13 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p21");
                                 double e21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p22");
                                 double e22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p23");
                                 double e23 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p31");
                                 double e31 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p32");
                                 double e32 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("p33");
                                 double e33 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 OMat3x3 E2 = new OMat3x3();
                                 System.out.println("EL RESULTADO OBTENIDO ES      " + O1.determinante(E2));
                                 System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                 System.out.println("S/N");
                                 volvermenuprincipal = sc.next();
                                 break;

                             case 5:
                                 OMat3x3 iden = new OMat3x3();
                                 System.out.println("EL RESULTADO OBTENIDO ES " + iden.identidad());
                                 break;
                             case 6:
                                 System.out.println("Ingres las primeras matrices");
                                 System.out.println("ro11");
                                 double ro11 = lt.obtenerdoubleValidado("invalido");
                                 System.out.println("ro12");

                                 double ro12 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("ro13");

                                 double ro13 = lt.obtenerdoubleValidado("Ingrese un valor correcto");

                                 System.out.println("ro21");


                                 double ro21 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("ro22");

                                 double ro22 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("ro23");

                                 double ro23 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("ro31");


                                 double ro31 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("ro32");

                                 double ro32 = lt.obtenerdoubleValidado("Ingrese un valor correcto");
                                 System.out.println("ro33");

                                 double ro33 = lt.obtenerdoubleValidado("Ingrese un valor correcto");


                                 OMat3x3 l = new OMat3x3();
                                 double alphaZ = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                 System.out.println(l.rotacionZ(alphaZ));
                                 break;
                         }
                        case 3:
                            System.out.println("Seleccione la operacion que desee realizar");

                            System.out.println(" 1.SUMA ======== 2.RESTA ======== 3.MULTIPLICACION ============= 4. DETERMINANTE =========5. IDENTIDAD ========6.ROTACIONx =============7.ROTACION Y ==============8.ROTACION Z");

                            int seleccionnueva = sc.nextInt();

                            switch (seleccionnueva) {
                                case 1:
                                    System.out.println("Ingrese el valor de A11");

                                    double a11 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A12");

                                    double a12 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A13");

                                    double a13 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A14");

                                    double a14 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A21");

                                    double a21 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A22");

                                    double a22 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A23");

                                    double a23 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A24");

                                    double a24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A31");

                                    double a31 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A32");

                                    double a32 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A33");

                                    double a33 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A34");

                                    double a34 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el calor de A41");

                                    double a41 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A42");

                                    double a42 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A43");

                                    double a43 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de A44");

                                    double a44 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    OMat4x4 a = new OMat4x4(a11, a12, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44);

                                    System.out.println("Ingrese el valor de B11");

                                    double b11 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B12");

                                    double b12 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B13");

                                    double b13 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B14");

                                    double b14 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B21");

                                    double b21 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B22");

                                    double b22 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B23");

                                    double b23 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B24");

                                    double b24 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B31");

                                    double b31 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B32");

                                    double b32 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B33");

                                    double b33 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B34");

                                    double b34 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B41");

                                    double b41 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B42");

                                    double b42 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B43");

                                    double b43 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    System.out.println("Ingrese el valor de B44");

                                    double b44 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                    OMat4x4 b = new OMat4x4(b11, b12, b13, b14, b21, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44);

                                    System.out.println("el resultado es " + a.suma(b));
                                    System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                    System.out.println("S/N");
                                    volvermenuprincipal = sc.next();
                                    break;
                                case 2:
                                    System.out.println("Ingrese el valor de A11");
                                    double c11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A12");
                                    double c12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A13");
                                    double c13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A14");
                                    double c14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A21");
                                    double c21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A22");
                                    double c22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A23");
                                    double c23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A24");
                                    double c24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A31");
                                    double c31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A32");
                                    double c32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A33");
                                    double c33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A34");
                                    double c34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el calor de A41");
                                    double c41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A42");
                                    double c42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A43");
                                    double c43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de A44");
                                    double c44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    OMat4x4 c = new OMat4x4(c11, c12, c13, c14, c21, c22, c23, c24, c31, c32, c33, c34, c41, c42, c43, c44);
                                    System.out.println("Ingrese el valor de B11");
                                    double d11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B12");
                                    double d12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B13");
                                    double d13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B14");
                                    double d14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B21");
                                    double d21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B22");
                                    double d22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B23");
                                    double d23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B24");
                                    double d24 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B31");
                                    double d31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B32");
                                    double d32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B33");
                                    double d33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B34");
                                    double d34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B41");
                                    double d41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B42");
                                    double d42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B43");
                                    double d43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    System.out.println("Ingrese el valor de B44");
                                    double d44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                    OMat4x4 d = new OMat4x4(d11, d12, d13, d14, d21, d22, d23, d24, d31, d32, d33, d34, d41, d42, d43, d44);
                                    System.out.println("EL RESULTADO ES " + c.resta(d));
                                    System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                    System.out.println("S/N");
                                    volvermenuprincipal = sc.next();
                                    break;

                                case 3:

                                    double w11 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double w12 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double w13 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double w14 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double w21 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double w22 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double w23 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double w24 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double w31 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double w32 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double w33 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double w34 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double w41 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double w42 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double w43 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double w44 = lt.obtenerdoubleValidado("Ingrese un valor");





                                    System.out.println("Ingrese el valor de M11: ");
                                    double f11 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double f12 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double f13 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double f14 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double f21 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double f22 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double f23 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double f24 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double f31 = lt.obtenerdoubleValidado("Ingrese un valor");
                                    System.out.println("Ingrese el valor de M32: ");
                                    double f32 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double f33 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double f34 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double f41 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double f42 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double f43 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double f44 = lt.obtenerdoubleValidado("Ingrese un valor");

                                    OMat4x4 Matr1 = new OMat4x4(w11, w12, w13, w14, w21, w22, w23, w24, w31, w32, w33, w34, w41, w42, w43, w44);
                                    OMat4x4 Matr2 = new OMat4x4(f11, f12, f13, f14, f21, f22, f23, f24, f31, f32, f33, f34, f41, f42, f43, f44);


                                    System.out.println("La respuesta es" +
                                            " " + Matr1.multi(Matr2));
                                    System.out.println(" ");
                                    break;
                                      case 4:
                                                             System.out.println("Ingrese el valor de A11");
                                                             double i11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                             System.out.println("Ingrese el valor de A12");
                                                             double i12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                             System.out.println("Ingrese el valor de A13");
                                                             double i13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                             System.out.println("Ingrese el valor de A14");
                                                             double i14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                             System.out.println("Ingrese el valor de A21");
                                                             double i21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                             System.out.println("Ingrese el valor de A22");
                                                             double i22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                             System.out.println("Ingrese el valor de A23");
                                                             double i23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                             System.out.println("Ingrese el valor de A24");
                                                             double i24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                             System.out.println("Ingrese el valor de A31");
                                                             double i31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                       System.out.println("Ingrese  A32");
                                       double i32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                       System.out.println("IngreseA33");
                                       double i33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                       System.out.println("IngreseA34");
                                       double i34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                       System.out.println("Ingrese A41");
                                       double i41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                       System.out.println("Ingrese  A42");
                                       double i42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                       System.out.println("Ingrese A43");
                                       double i43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                       System.out.println("Ingrese  A44");
                                       double i44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                       OMat4x4 E2 = new OMat4x4(i11,i12,i13,
                                               i14,i21,i22,i23,i24,i31,
                                               i32,i33,i34,i41,i42,i43,i44);
                                       System.out.println(E2.determinante());
                                            System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                            System.out.println("S/N");
                                            volvermenuprincipal = sc.next();

                                       break;
                                         case 5:
                                                                    System.out.println("Ingrese A11");
                                                                    double h11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese  A12");
                                                                    double h12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese  A13");
                                                                    double h13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese  A14");
                                                                    double h14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese A21");
                                                                    double h21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese  A22");
                                                                    double h22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese A23");
                                                                    double h23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese A24");
                                                                    double h24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                                    System.out.println("Ingrese  A31");
                                                                    double h31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese A32");
                                                                    double h32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese  A33");
                                                                    double h33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese  A34");
                                                                    double h34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese el calor de A41");
                                                                    double h41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("IngreseA42");
                                                                    double h42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese  A43");
                                                                    double h43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    System.out.println("Ingrese  A44");
                                                                    double h44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                    OMat4x4 h = new OMat4x4(h11,h12,h13,h14,h21,h22,h23,h24,h31,h32,h33,h34,h41,h42,h43,h44);
                                                                    System.out.println(h.inversa());
                                                                        System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                                                        System.out.println("S/N");
                                                                        volvermenuprincipal = sc.next();

                                                                    break;
                                         case 6:
                                                                     System.out.println("Ingrese A11");
                                                                     double j11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese A12");

                                                                     double j12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A13");

                                                                     double j13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A14");

                                                                     double j14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese A21");

                                                                     double j21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A22");

                                                                     double j22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese A23");

                                                                     double j23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A24");

                                                                     double j24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                                     System.out.println("Ingrese el valor de A31");

                                                                     double j31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese el valor de A32");

                                                                     double j32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese el valor de A33");
                                                                     double j33 = lector.obtenerEnteroValidado(
                                                                             "Ingrese un numero valido");
                                                                     System.out.println("Ingrese A34");

                                                                     double j34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("IngreseA41");

                                                                     double j41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A42");

                                                                     double j42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A43");

                                                                     double j43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese A44");

                                                                     double j44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     OMat4x4 j = new OMat4x4(j11,j12,j13,j14,
                                                                             j21,j22,j23,j24,j31,j32,j33,
                                                                             j34,j41,j42,j43,j44);
                                                                     double alphaX = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println(j.rotX(alphaX));

                                                                       System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                                                       System.out.println("S/N");
                                                                       volvermenuprincipal = sc.next();

                                                                     break;
                                                          case 7:
                                                                     System.out.println(" valor de A11");
                                                                     double k11 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                                                     System.out.println("valor de A12");
                                                                     double k12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A13")
                                                                     ;
                                                                     double k13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese A14");

                                                                     double k14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A21");

                                                                     double k21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese eA22");
                                                                     
                                                                     double k22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A23");

                                                                     double k23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A24");

                                                                     double k24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A31");

                                                                     double k31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese A32");

                                                                     double k32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A33");

                                                                     double k33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A34");

                                                                     double k34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A41");
                                                                     double k41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A42");
                                                                     double k42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A43");
                                                                     double k43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A44");
                                                                     double k44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     OMat4x4 k = new OMat4x4(k11,k12,k13,
                                                                             k14,k21,k22,k23,k24,k31,
                                                                             k32,k33,k34,k41,
                                                                             k42,k43,k44);
                                                                     double alphaY = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println(k.rotY(alphaY));
                                                                      System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                                                      System.out.println("S/N");
                                                                      volvermenuprincipal = sc.next();

                                                                     break;
                                         case 8:
                                                                     System.out.println("Ingrese A11");
                                                                     double l11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A12");
                                                                     double l12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese A13");
                                                                     double l13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese A14");
                                                                     double l14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese A21");
                                                                     double l21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A22");
                                                                     double l22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A23");
                                                                     double l23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese A24");
                                                                     double l24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A31");
                                                                     double l31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese A32");
                                                                     double l32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A33");
                                                                     double l33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A34");
                                                                     double l34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A41");
                                                                     double l41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese e A42");
                                                                     double l42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A43");
                                                                     double l43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println("Ingrese  A44");
                                                                     double l44 = lector.obtenerEnteroValidado("Ingrese un numero valido");

                                                                     
                                                                     OMat4x4 l = new OMat4x4(l11,l12
                                                                             ,l13,l14
                                                                             ,l21,l22,
                                                                             l23,l24,
                                                                             l31,l32,
                                                                             l33,l34,
                                                                             l41,l42,
                                                                             l43,l44);
                                                                     double alphaZ = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                                     System.out.println(l.rotZ(alphaZ));
                                                                        System.out.println("\u00BFDESEA CONTINUAR CON OTRA OPERACION?");
                                                                        System.out.println("S/N");
                                                                        volvermenuprincipal = sc.next();

                                                                     break;
                            }


                    }




            }

            do {
                volvermenuprincipal = sc.nextLine();
            } while (!volvermenuprincipal.equalsIgnoreCase("s") && !volvermenuprincipal.equalsIgnoreCase("n"))
                    ;

        } while (volvermenuprincipal.equalsIgnoreCase("s"));

    }

}
















