package proyectoconconsola;
        import java.util.Scanner;



    public class Proyectoconconsola {

        public static int n1, n2, resultado, kil;
        public static double ju;
        public static Scanner leer = new Scanner(System.in);
//Proyecto de materia de: 
        //Sáenz Jiménes Reyva Verónica 
        //Estamos listos para tomar much café y llorar
        //MÉTODOS ARITMÉTICOS
        
        public static void sumasuma() {
            int n;
            double suma;
            System.out.println("De qué tamaño será el arreglo?");
            n = leer.nextInt();
            double[] sum = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Coloca el valor correspondiente"
                        + "para el valor " + (i + 1));
                sum[i] = leer.nextDouble();
            }
            suma = 0;
            for (int i = 0; i < sum.length; i++) {
                suma += sum[i];
            }
            System.out.println("La suma resultante es de: " + suma);
        }

        //fin de método
        public static void restaresta() {
            System.out.println("Ingrese la longitud de los arreglos:");
            int c = leer.nextInt();
            int[] res = new int[c];
            int[] ta = new int[c];

            System.out.println("Ingrese los primeros datos para"
                    + "el primer arreglo:");
            for (int i = 0; i < c; i++) {
                res[i] = leer.nextInt();
            }
            System.out.println("Ingrese los segundos datos para"
                    + "el segundo arreglo:");
            for (int i = 0; i < c; i++) {
                ta[i] = leer.nextInt();
            }
            int[] resultado = restafinal(res, ta);

            System.out.println("Resultado de la operación:");
            for (int num : resultado) {
                System.out.print(num + " ");
            }
        }

        public static int[] restafinal(int[] rese, int[] taa) {
            int[] resultado = new int[rese.length];

            for (int i = 0; i < rese.length; i++) {
                resultado[i] = rese[i] - taa[i];
            }
            return resultado;
        }
//Fin método

        public static int MULRetorno() {
            System.out.println("Captura un numero");
            n1 = leer.nextInt();
            System.out.println("Captura un segundo numero");
            n2 = leer.nextInt();
            resultado = n1 * n2;
            return resultado;
        }
//Fin método

        public static int DivisionArgumentos(int n1, int n2) {

            resultado = n1 / n2;
            return resultado;
        }//Fin método

        public static void libras(int kil) {
            double kilb = 2.20462, conv, ki;
            ki = kil * 1;
            conv = kilb * ki;
            System.out.println("La conversión resultante"
                    + " es de: " + conv + " Kg");
        }//Fin método

        public static void kilosb() {
            double lib, libk;
            System.out.println("Mencione las libras a convertir");
            lib = leer.nextDouble();
            libk = lib * 0.453592;
            System.out.println("Los resultados arrojados fueron de: ");
            System.out.println(libk + "Lbs");
        }//Fin método

        public static void onzas(double kil) {
            double kilz = 35.274, conv, ki;
            conv = kilz * kil;
            System.out.println("La conversión resultante"
                    + " es de: " + conv + " oz");
        }//Fin método

        public static double gramos() {
            double gra, kili;
            System.out.println("Menciona los kg a convertir");
            kili = leer.nextDouble();
            gra = kili / 1000;
            System.out.println("El resultado de la operación"
                    + "fue de: " + gra + "gr");
            return gra;
        }
        public static void kilimetros(){
            double km,c;
            System.out.println("Ingresa el numero de kilimetros: ");
            km=leer.nextDouble();
            c=km*1000;
        }
        
        public static void Centimetros(){
            double Cm,m;
            System.out.println("Ingresa el numero de centimetros: ");
            Cm=leer.nextDouble();
            m=Cm*6.2137;
        }
        
        public static void Millas(){
            double M,p;
            System.out.println("Ingresa el numero de Millas: ");
            M=leer.nextDouble();
            p=M*5280;
        }
        
        public static void Pies(){
            double Pi,pu;
            System.out.println("Ingresa el numero de pies: ");
            Pi=leer.nextDouble();
            pu=Pi*12;
        }
        public static void Pulgadas(){
            double Pu,pi;
            System.out.println("Ingresa el numero de pulgadas: ");
            Pu=leer.nextDouble();
            pi=Pu/12;
        }
        
        public static double cel;

        public static void fahr() {
            double far = 33.8, temp, fari = 32, x = 1.8, nw;
            System.out.println("Menciona los grados Celsius"
                    + "a convertir a Fahrenheit");
            cel = leer.nextDouble();
            if (cel > 0) {
                temp = cel * far;
                System.out.println("El resultado de la "
                        + "conversión es de: " + temp + "°F");
            }
            if (cel == 0) {
                System.out.println("El resultado de la "
                        + "conversión es de: " + fari + "°F");
            }
            if (cel < 0) {
                nw = cel * (-1);
                temp = nw * x;
                double newtemp = 32 - temp;
                System.out.println("El resultado de la "
                        + "conversión es de: " + newtemp + "°F");
            }
        }
        
        public static double fahcel() {
            double x = 0.5556, far0 = -17.7778, nw, newtemp, fah;
            System.out.println("Mencione los grados"
                    + "fahrenheit a convertir a celsius");
            fah = leer.nextDouble();
            if (fah == 0) {
                System.out.println("El resultado de la "
                        + "conversión es de: " + far0 + "C");
            }
            if (fah > 0) {
                nw = (fah * (-1)) * x;
                newtemp = far0 - nw;
                System.out.println("El resultado de la "
                        + "conversión es de: " + newtemp + "C");
            }
            if (fah < 0) {
                nw = (fah * (-1)) * x;
                newtemp = far0 - nw;
                System.out.println("El resultado de la "
                        + "conversión es de: " + newtemp + "C");
            }
            return 0;
        }
        
        public static double Celi;

   
        public static void CelciusaKelvin() {
            int n1;
            System.out.println("Ingres el numero de grados celcius que desea convertir a Kelvin: ");
            n1 = leer.nextInt();
            Celi = cel - 273.15;
            System.out.println("La conbercion de grados kelvin a celsius es de: " + Celi);
        }
        
   public static void main(String[] args) {
            int op2, op3, op4, op5, op6;
            int op;

            System.out.println("");
            System.out.println("Mencione qué menú quiere recurrir");
            System.out.println("1 - Menú aritmético");
            System.out.println("2 - Menú conversiones");
            System.out.println("3 - Salir");
            op = leer.nextInt();

            do {
                switch (op) {
                    case 1:
                        do {
                            System.out.println("\n\"Menu aritmetico\"\n"
                                    + "Ingresa la opcion deseada:\n"
                                    + "1. Suma\n"
                                    + "2. Resta\n"
                                    + "3. Multiplicacion\n"
                                    + "4. Division\n"
                                    + "5. Regresar");
                            op2 = leer.nextInt();

                            switch (op2) {
                                case 1:
                                    System.out.println("Usted seleccionó suma");
                                    sumasuma();
                                    break;

                                case 2:
                                    System.out.println("Usted seleccionó resta");
                                    restaresta();
                                    break;

                                case 3:
                                    System.out.println("Usted seleccionó multiplicación");
                                    MULRetorno();
                                    break;

                                case 4:
                                    System.out.println("Usted seleccionó división");
                                    System.out.println("Captura un numero");
                                    n1 = leer.nextInt();
                                    System.out.println("Captura un segundo numero");
                                    n2 = leer.nextInt();

                                    System.out.println("La division es: " + DivisionArgumentos(n1, n2));
                                    break;

                                case 5:
                                    System.out.println("Operaciones finalizadas, fin del programa");
                                    break;

                                default:
                                    System.out.println("Opción inválida, ingrese un argumento válido");
                                    break;
                            }
                        } while (op2 != 5);

                        break;

                    case 2:
                        System.out.println("Usted seleccionó el menú de Conversiones");
                        System.out.println("Seleccione a qué submenú quiere acceder:  ");
                        System.out.println("\n\"Menu de conversiones\"\n"
                                + "Ingresa la opcion deseada:\n"
                                + "1. Masa\n"
                                + "2. Longitud\n"
                                + "3. Temperaturas\n"
                                + "4. Regresar");

                        do {
                            op3 = leer.nextInt();
                            switch (op3) {
                                case 1:
                                    System.out.println("Usted seleccionó Masa");
                                    System.out.println(" Qué operación desea realizar?");
                                    System.out.println("\n\"Menu de masa\"\n"
                                            + "Ingresa la opcion deseada:\n"
                                            + "1. Libras a Kilos\n"
                                            + "2. Kilos a Libras\n"
                                            + "3. Kilos a onzas\n"
                                            + "4. Kilos a gramos\n"
                                            + "5. Regresar");
                                    do {
                                        op4 = leer.nextInt();
                                        switch (op4) {
                                            case 1:
                                                System.out.println("Usted seleccionó conversión "
                                                        + "de libras a kilos");
                                                System.out.println("Mencione los kg a convertir");
                                                kil = leer.nextInt();
                                                libras(kil);
                                                break;

                                            case 2:
                                                System.out.println("Usted seleccionó conversión "
                                                        + "de kilos a libras");
                                                kilosb();
                                                break;

                                            case 3:
                                                System.out.println("Usted seleccionó conversión "
                                                        + "de kilos a onzas");
                                                System.out.println("Mencione los kg a convertir");
                                                kil = leer.nextInt();
                                                onzas(kil);
                                                System.out.println("");
                                                break;

                                            case 4:
                                                System.out.println("Usted seleccionó conversión "
                                                        + "de kilos a gramos");
                                                gramos();
                                                break;

                                            case 5:
                                                System.out.println("Operaciones finalizadas");
                                                break;
                                            default:
                                                System.out.println("Opción inválida, ingrese un argumento válido");
                                                break;

                                        }
                                        break;
                                    } while (op4 != 5);
                                    break;

                                case 2:
                                    System.out.println("Usted seleccionó Longitud");

                                    System.out.println(" Qué operación desea realizar?");
                                    System.out.println("\n\"Menu de masa\"\n"
                                            + "Ingresa la opcion deseada:\n"
                                            + "1. Kilómetros a metros\n"
                                            + "2. Centímetros a metros\n"
                                            + "3. Millas a metros\n"
                                            + "4. pies a metros\n"
                                            + "5. pulgadas a metros\n"
                                            + "6. Regresar");
                                    do {
                                        op5 = leer.nextInt();
                                        switch (op5) {
                                            case 1:
                                                System.out.println("Usted seleccionó conversión "
                                                        + "de Kilómetros a centimetros");
                                                        kilimetros();
                                                break;

                                            case 2:
                                                System.out.println("Usted seleccionó conversión "
                                                        + "de Centímetros a millas");
                                                         Centimetros();
                                                break;

                                            case 3:
                                                System.out.println("Usted seleccionó conversión "
                                                        + "de Millas a pies");
                                                         Millas();
                                                        
                                                break;

                                            case 4:
                                                System.out.println("Usted seleccionó conversión "
                                                        + "de pies a pulgadas");
                                                         Pies();
                                                break;
                                            case 5:
                                                System.out.println("Usted seleccionó conversión "
                                                        + "de pulgadas a pies");
                                                         Pulgadas();
                                                break;

                                            case 6:
                                                System.out.println("Operaciones finalizadas");
                                                break;

                                            default:
                                                System.out.println("Opción inválida, ingrese un argumento válido");
                                                break;

                                        }
                                        break;
                                    } while (op5 != 6);
                                    break;

                                case 3:
                                    System.out.println("Usted seleccionó Temperatura");

                                    System.out.println(" Qué operación desea realizar?");
                                    System.out.println("\n\"Menu de masa\"\n"
                                            + "Ingresa la opcion deseada:\n"
                                            + "1. Celsius a Fahrenheit\n"
                                            + "2. Fahrenheit a celsius\n"
                                            + "3. Kelvin a Celsius\n"
                                            + "4. Regresar");
                                    do {
                                        op6 = leer.nextInt();
                                        switch (op6) {
                                            case 1:
                                                System.out.println("Usted seleccionó conversión "
                                                        + "de Celsius a Fahrenheit");
                                                        fahr();
                                                break;

                                            case 2:
                                                System.out.println("Usted seleccionó conversión "
                                                        + "de Fahrenheit a Celsius");
                                                        fahcel();
                                                break;

                                            case 3:
                                                System.out.println("Usted seleccionó conversión "
                                                        + "de Kelvin a Celsius");
                                                           CelciusaKelvin();
                                                break;

                                            case 4:
                                                System.out.println("Operaciones finalizadas");
                                                break;

                                            default:
                                                System.out.println("Opción inválida, ingrese un argumento válido");
                                                break;

                                        }
                                        break;
                                    } while (op6 != 4);
                                    break;

                                case 4:
                                    System.out.println("Operaciones finalizadas, fin del programa");
                                    break;

                                default:
                                    System.out.println("Opción inválida, ingrese un argumento válido");
                                    break;
                            }
                            break;
                        } while (op3 != 4);
                        break;

                    case 3:
                        System.out.println("Fin del programa");
                        break;

                    default:
                        System.out.println("Opción inválida, ingrese un argumento válido");
                        break;
                }

                if (op != 3) {
                    System.out.println("");
                    System.out.println("Mencione qué menú quiere recurrir");
                    System.out.println("1 - Menú aritmético");
                    System.out.println("2 - Menú conversiones");
                    System.out.println("3 - Salir");
                    op = leer.nextInt();
                }
            } while (op != 3);
        }
    }
