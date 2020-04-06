package VariableCompleja;

/**
 *
 * @author Kevin Ortega
 */
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class VariableCompleja {

    private static DecimalFormat df = new DecimalFormat("0.00000000000000000000");
    private static Scanner entrada = new Scanner(System.in);
    private static double teta1, teta2, PRe, PIm, n, Mod1, Mod2, x1 = 0, yi1 = 0, x2 = 0, yi2 = 0, PRe1, PIm1, PRe2, PIm2;

    public static void main(String[] args) throws InterruptedException {
        boolean des = true;
        while (des == true) {

            System.out.println("******************BIENVENIDO************************");

            //calculando modulos 
            //seleccion de la opciones del menú
            //Scanner opcion = new Scanner(System.in);
            System.out.println("*****************Menu****************** \n1.- Suma \n2.- Resta \n3.- Multiplicacion\n4.- Division\n5.- Exponente\n6.- Raiz \n7.- Exponencial \n8.- Logaritmo natural \n9.- Seno \n10.- Coseno \n11.- Tangente \n12.- Salir ");
            int num = entrada.nextInt();

            if (num == 1 || num == 2 || num == 3 || num == 4) {
                System.out.println("A continuacion ingresará los valores de Z1(x1 + yi1)");
                System.out.println("Ingresa x1: ");
                x1 = entrada.nextDouble();

                System.out.println("Ingresa yi1: ");
                yi1 = entrada.nextDouble();

                System.out.println("A continuacion ingresará los valores de Z2(x2 + yi2)");
                System.out.println("Ingresa x2:");
                x2 = entrada.nextDouble();

                System.out.print("Ingresa yi2:\n ");
                yi2 = entrada.nextDouble();

            } else if (num == 5 || num == 6 || num == 7 || num == 8 || num == 9 || num == 10 || num == 11) {
                System.out.println("A continuacion ingresará los valores de Z1(x1 + yi1)");
                System.out.println("Ingresa x1: ");
                x1 = entrada.nextDouble();

                System.out.println("Ingresa yi1: ");
                yi1 = entrada.nextDouble();
            }
            //  System.out.println();
            System.out.println("**************************************************");
            switch (num) {
                case 1:
                    System.out.println("+++SUMA+++");
                    Suma(x1, yi1, x2, yi2);
                    break;

                case 2:
                    System.out.println("+++RESTA+++");
                    Resta(x1, yi1, x2, yi2);

                    break;

                case 3:
                    System.out.println("+++MULTIPLICACION+++");
                    Multiplicacion(x1, yi1, x2, yi2);

                    break;

                case 4:
                    System.out.println("+++DIVISION+++");
                    Division(x1, yi1, x2, yi2, 11);

                    break;

                case 5:
                    System.out.println("+++EXPONENTE+++");
                    Exponente(x1, yi1);
                    break;

                case 6:
                    System.out.println("+++RAIZ+++");
                    Raiz(x1, yi1);

                    break;
                case 7:
                    System.out.println("+++EXPONENCIAL+++");
                    ExpE(x1, yi1);

                    break;
                case 8:
                    System.out.println("+++LOGARITMO NATURAL+++");
                    Ln(x1, yi1);

                    break;
                case 9:
                    System.out.println("+++SENO+++");
                    Sin(x1, yi1, 1);

                    break;
                case 10:
                    System.out.println("+++COSENO+++");
                    Cos(x1, yi1, 1);

                    break;

                case 11:
                    System.out.println("+++TANGENTE+++");
                    Tan(x1, yi1);

                    break;

                case 12:
                    System.out.println("+++SALISTE+++");
                    return;
            }
            System.out.println("**************************************************");
            System.out.println("Quieres hacer otra operacion?");
            System.out.println("<escribe true or false>");
            des = entrada.nextBoolean();
            for (int i = 0; i < 5; i++) {
                String cargando = "#";
                if (i == 0) {
                    System.out.print("CARGANDO" + cargando);
                }
                Thread.sleep(500);
                System.out.print(cargando);
            }
            System.out.println("\n-----------------------------------------------------------");
        }
        System.out.println("\n¡¡¡SALISTE!!!");
    }
    public static double Angulo(double x, double y) {
        double tetaX = 0;
        if (x >= 0 && y >= 0) {
            tetaX = Math.atan(y / x);
        }
        if (x < 0 && y >= 0) {
            tetaX = Math.atan(y / x) + Math.PI;
        }
        if (x < 0 && y < 0) {
            tetaX = Math.atan(y / x) + Math.PI;
        }
        if (x >= 0 && y < 0) {
            tetaX = Math.atan(y / x) + (2 * Math.PI);
        }

        return tetaX;
    }
    public static double Mod(double x, double y) {
        double ModX = 0;
        ModX = Math.sqrt((x * x) + (y * y));
        return ModX;
    }
    public static void Suma(double x1, double yi1, double x2, double yi2) {

        PRe = x1 + x2;
        PIm = yi1 + yi2;
        if (PIm > 0) {
            System.out.println("Resultado " + Math.floor(PRe) + "+ " + Math.floor(PIm) + "i");
        }
        if (PIm < 0) {
            System.out.println("Resultado " + Math.floor(PRe) + "- " + Math.floor(PIm) + "i");
        }
        if (PIm == 0) {
            System.out.println("Resultado " + Math.floor(PRe) + "+0");
        }
        //Calculando posision de 
        if (PRe >= 0 && PIm >= 0) {
            System.out.println("Primer cuadrante");
        }
        if (PRe < 0 && PIm >= 0) {
            System.out.println("Segundo cuadrante");
        }
        if (PRe < 0 && PIm < 0) {
            System.out.println("Tercer cuadrante");
        }
        if (PRe >= 0 && PIm < 0) {
            System.out.println("Cuarto cuadrante");
        }
    }
    public static void Resta(double x1, double yi1, double x2, double yi2) {
        PRe = x1 - x2;
        PIm = yi1 - yi2;

        if (PIm > 0) {
            System.out.println("Resultado " + Math.floor(PRe) + "+ " + Math.floor(PIm) + "i");
        }
        if (PIm < 0) {
            System.out.println("Resultado " + Math.floor(PRe) + " " + Math.floor(PIm) + "i");
        }
        if (PIm == 0) {
            System.out.println("Resultado " + Math.floor(PRe) + "+ 0 i");
        }
        //Calculand cuadrantes
        if (PRe >= 0 && PIm >= 0) {
            System.out.println("Primer cuadrante");
        }
        if (PRe < 0 && PIm >= 0) {
            System.out.println("Segundo cuadrante");
        }
        if (PRe < 0 && PIm < 0) {
            System.out.println("Tercer cuadrante");
        }
        if (PRe >= 0 && PIm < 0) {
            System.out.println("Cuarto cuadrante");
        }

    }
    public static void Multiplicacion(double x1, double yi1, double x2, double yi2) {
        PRe = x1 * x2 - yi1 * yi2;
        PIm = x1 * yi2 + x2 * yi1;
        if (PIm > 0) {
            System.out.println("Resultado " + Math.floor(PRe) + "+" + Math.floor(PIm) + "i");
        }
        if (PIm < 0) {
            System.out.println("Resultado " + Math.floor(PRe) + "-" + Math.floor(PIm) + "i");
        }
        if (PIm == 0) {
            System.out.println("Resultado " + Math.floor(PRe) + "+0i");
        }

        //calculanbdo los valores del angulo Z1 Y Z2
        teta1 = Angulo(x1, yi1);
        teta2 = Angulo(x2, yi2);
        PRe = ((Mod(x1, yi1) * Mod(x2, yi2)) * Math.cos(teta1 + teta2));
        PIm = ((Mod(x1, yi1) * Mod(x2, yi2)) * Math.sin(teta1 + teta2));
        System.out.println(df.format(Mod1 * Mod2) + "CIS" + df.format(teta1 + teta2));
        //Calculando cuadrantes
        if (PRe >= 0 && PIm >= 0) {
            System.out.println("Primer cuadrante");
        }
        if (PRe < 0 && PIm >= 0) {
            System.out.println("Segundo cuadrante");
        }
        if (PRe < 0 && PIm < 0) {
            System.out.println("Tercer cuadrante");
        }
        if (PRe >= 0 && PIm < 0) {
            System.out.println("Cuarto cuadrante");
        }
    }
    public static void Division(double x1, double yi1, double x2, double yi2, int z) {
        if ((x1 == 0 && x2 == 0 && yi1 == 0 && yi2 == 0) || (x1 > 1 && x2 == 0 && yi1 == 0 && yi2 == 0) || (x1 > 0 && x2 == 0 && yi1 > 0 && yi2 == 0) || (x1 == 0 && x2 == 0 && yi1 > 0 && yi2 == 0)) {
            System.out.print("No se puede realizar la operacion");
        } else {
            PRe = ((x1 * x2) + (yi1 * yi2)) / ((x2 * x2) + (yi2 * yi2));// 7
            PIm = ((x2 * yi1) - (x1 * yi2)) / ((x2 * x2) + (yi2 * yi2));//-1/21u
            if (z != 0) {
                System.out.print("Z1/Z2= ");
            }  if (PRe == 0 && PIm == 0) {
                System.out.println(0);//+ df.format(PRe) + "+" + df.format(PIm*-1) + "i");
            }
            else if (PRe == 0 && PIm >0) {
                System.out.println(df.format(PIm) + "i");
            }
            else if (PRe > 0 && PIm >0) {
                System.out.println(df.format(PRe) + "+" + df.format(PIm) + "i");
            }
            else if (PIm ==-0) {
                
                System.out.println(df.format(PRe) );
            }
            
            else  if (PRe >= 0 && PIm < 0) {
                System.out.println(df.format(PRe) + "" + df.format(PIm) + "i");
            }
            else if (PRe < 0 && PIm >= 0) {
                System.out.println(df.format(PRe) + "+" + df.format(PIm) + "i");
            }
            if (PRe < 0 && PIm < 0) {
                System.out.println(df.format(PRe) + "" + df.format(PIm) + "i");
            }

            //calculando cuadrante
            if (PRe >= 0 && PIm >= 0) {
                System.out.println("Primer cuadrante");
            }
            if (PRe < 0 && PIm >= 0) {
                System.out.println("Segundo cuadrante");
            }
            if (PRe < 0 && PIm < 0) {
                System.out.println("Tercer cuadrante");
            }
            if (PRe >= 0 && PIm < 0) {
                System.out.println("Cuarto cuadrante");
            }

            teta1 = Angulo(x1, yi1);
            teta2 = Angulo(x2, yi2);
            //System.out.println("Resultado de la calculadora es = " + df.format((Mod(x1, yi1) / Mod(x2, yi2) * (Math.cos(teta1 - teta2) + Math.sin(teta1 - teta2)))));
            System.out.println(df.format((Mod(x1, yi1) / Mod(x2, yi2))) + "CIS" + df.format(teta1 - teta2));

        }
    }
    public static void Exponente(double x, double yi) {
        System.out.println("En que exponente quieres z1:");
        n = entrada.nextDouble();
        teta1 = Angulo(x1, yi1);
        System.out.println(df.format(Math.pow(Mod(x1, yi1), n)) + " CiS " + df.format(n * teta1));

    }
    public static void Raiz(double x, double yi) {
        n = 0;
        double k = 0;
        System.out.println("Intruce el exponente de raiz: cuadratica(2), cubica(3), et.");
        n = entrada.nextInt();
        while (k >= n) {
            System.out.println("Hasta que valor de k quieres calcular las raices, tomando en cuenta que k debe ser menor que n");
            k = entrada.nextInt();
            if (k >= n) {
                System.out.println("El valor de k debe ser menor");
            }
        }
        for (int K = 0; K <= (n - 1); K++) {
            teta1 = Angulo(x1, yi1);
            System.out.println("Calculando los valores de Z1    K=" + K);
            // double r = Math.pow(Mod(x1,yi1), (1.0 / n));
            System.out.println("Calculando el valor exponencial: " + df.format(Math.pow(Mod(x1, yi1), (1 / n))));
            // double argumento = ((teta1 + (2 * K * 3.1416)) / (n));
            System.out.println("Forma cis de z1:   " + df.format(Math.pow(Mod(x1, yi1), (1.0 / n))) + " CIS " + df.format(((teta1 + (2 * K * 3.1416)) / (n))) + "\n");

        }
    }
    public static void Sin(double x, double yi, int z) {
        PRe2 = ((Math.pow(Math.E, -yi) + Math.pow(Math.E, yi)) / 2) * Math.sin(x);
        PIm2 = ((Math.pow(Math.E, -yi) - Math.pow(Math.E, yi)) / 2) * Math.cos(x) * -1;
       // System.out.println(PIm2);

        //if(PIm2==0) {System.out.println("Resultado:"+PRe2+"+"+(df.format(-1*PIm2))+"i");}
        if (z == 0) {
        } else {
            if (PIm2 > 0) {
                System.out.println("Resultado:" + PRe2 + "+" + (df.format(PIm2)) + "i");
            }
            else if (PIm2 == 0 && (PRe2 >= 0 || PRe2 < 0)) {
                System.out.println("Resultado:" + PRe2);
            }
            else if (PIm2 < 0) {
                System.out.println("Resultado:" + PRe2 + " " + (df.format(PIm2)) + "i");
            }
            
            
        }
        //0.9888977028

    }
    public static void Cos(double x, double yi, int z) {
        PRe1 = ((Math.pow(Math.E, -yi) + Math.pow(Math.E, yi)) / 2) * Math.cos(x);
        PIm1 = ((Math.pow(Math.E, -yi) - Math.pow(Math.E, yi)) / 2) * Math.sin(x);
        if (z == 0) {
        } else {

            if ((PRe1 >= 0 || PRe1 < 0) && PIm1 >= 0) {
                if(PIm1==0){
                    System.out.println("Resultado:" + PRe1 );//0.8337300251
                }else{
                System.out.println("Resultado:" + PRe1 + " + " + PIm1+"i");//0.8337300251
                }
            }
            if ((PRe1 >= 0 || PRe1 < 0) && PIm1 < 0) {
                System.out.println("Resultado:" + PRe1 + " " + PIm1 + "i");      //0.9888977028
            }
        }

    }
    public static void Ln(double x1, double yi1) {
        if ((x1 == 0 && yi1 == 0)) {
            System.out.println("LOS VALORES DE X1 Y XI1 DEBEN DE SER MAYORES QUE 0");
        } else {
            if (x1 < 0 && yi1 == 0) {
                System.out.println(df.format(Math.log(Mod(x1, yi1))) + " + " + (Math.atan(yi1 / x1) + Math.PI) + "i");
            } else {
                if (Math.atan(yi1 / x1) >= 0 && (x1 < 0 && yi1 < 0)) {
                    System.out.println(df.format(Math.log(Mod(x1, yi1))) + " " + (Math.atan(yi1 / x1) - Math.PI) + "i");
                }
                if (Math.atan(yi1 / x1) >= 0 && (x1 > 0 && yi1 > 0)) {
                    System.out.println(df.format(Math.log(Mod(x1, yi1))) + " + " + Math.atan(yi1 / x1) + "i");
                }
                if ((Math.atan(yi1 / x1) < 0 && (x1 >= 0 && yi1 < 0))) {
                    System.out.println(df.format(Math.log(Mod(x1, yi1))) + " " + Math.atan(yi1 / x1) + "i");
                }
                if (x1 <= 0 && yi1 > 0) {
                    System.out.println(df.format(Math.log(Mod(x1, yi1))) + "+" + (-1) * (Math.atan(yi1 / x1) - Math.PI) + "i");
                }
            }
        }
    }
    public static void Tan(double x1, double yi1) {
        Sin(x1, yi1, 0);
        Cos(x1, yi1, 0);
        System.out.print("La tangente de Z= ");
        Division(PRe2, PIm2, PRe1, PIm1, 0);
    }
    public static void ExpE(double x, double y) {
        PIm = Math.pow(Math.E, x) * Math.sin(y);
        PRe = Math.pow(Math.E, x) * Math.cos(y);
        if (PIm >= 0) {
            System.out.println(PRe + " + " + PIm + "i");
        }
        if (PIm < 0) {
            System.out.println(PRe + " " + PIm + "i");
        }
    }
}
