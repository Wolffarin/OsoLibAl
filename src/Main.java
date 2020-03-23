import hn.edu.ujcv.progra.*;
import java.util.Scanner;
import java.util.regex.MatchResult;

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
                            System.out.println("EL RESULTADO OBTENIDO ES      "   + I1.suma(I2));
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
                               OMat2x2 D1 = new OMat2x2(x11,x12,x21,x22);
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
                               System.out.println("EL RESULTADO OBTENIDO ES      "   + D1.resta(D2));
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
















