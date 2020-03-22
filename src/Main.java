import hn.edu.ujcv.progra.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args, double c) {
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

                    System.out.println(" 1.SUMA ======== 2.RESTA ======== 3.PRODUCTO PUNTO ============= 4. MAGNITUD =========");

                    int seleccion1 = sc.nextInt();
                    switch (seleccion1) {
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
                             volvermenuprincipal = sc.nextLine();
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
                                 volvermenuprincipal = sc.nextLine();
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
                            volvermenuprincipal = sc.nextLine();
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
                            volvermenuprincipal = sc.nextLine();
                           break;












                    }
            }





















































































































































































































































































             do {
              volvermenuprincipal = sc.nextLine();
          }while (!volvermenuprincipal.equalsIgnoreCase("s") && !volvermenuprincipal.equalsIgnoreCase("n"))
                ;

         } while (volvermenuprincipal.equalsIgnoreCase("s"));

    }
}

















