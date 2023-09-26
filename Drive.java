import java.util.ArrayList;
import java.util.Scanner;

public class Drive {
    public static void main(String[] args) {
        ArrayList<Float> arr1 = new ArrayList<Float>();
        ArrayList<Float> arr2 = new ArrayList<Float>();
        ArrayList<Float> arr3 = new ArrayList<Float>();
        ArrayList<Float> arr4 = new ArrayList<Float>();
        ArrayList<Float> arr5 = new ArrayList<Float>();
        
        System.out.println("Hola, este programa te ayudara a saber el promedio de tus clases");
        System.out.println("Ingresa en el siguiente menu que te gustaria hacer");


        while(true){
            HelpMethods hp = new HelpMethods();
            System.out.println("----MENU-----");
            System.out.println("1. Ingresar notas");
            System.out.println("2. Ver promedio de las clases");
            System.out.println("3. Ver promedio general");
            System.out.println("4. Salir.");

            Scanner sc = new Scanner(System.in);
            System.out.println("Elige la accion que quieras realizar: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                    System.out.println("¿Cuantás notas desea ingresar?");
                    int ntc = sc.nextInt();
                    System.out.println("Ingrese las notas de la primera clase: ");
                    for (int i = 0; i < ntc; i++) {
                        Float cc = sc.nextFloat();
                        arr1.add(cc);
                    }
                    System.out.println(arr1);
                    System.out.println("-------------------------------------------");
                    System.out.println("¿Cuantás notas desea ingresar?");
                    int ntc1 = sc.nextInt();
                    System.out.println("Ingrese las notas de la segunda clase: ");
                    for (int i = 0; i < ntc1; i++) {
                        Float cc = sc.nextFloat();
                        arr2.add(cc);
                    }
                    System.out.println(arr2);
                    System.out.println("-------------------------------------------");
                    System.out.println("¿Cuantás notas desea ingresar?");
                    int ntc2 = sc.nextInt();
                    System.out.println("Ingrese las notas de la tercera clase: ");
                    for (int i = 0; i < ntc2; i++) {
                        Float cc = sc.nextFloat();
                        arr3.add(cc);
                    }
                    System.out.println(arr3);
                    System.out.println("-------------------------------------------");
                    System.out.println("¿Cuantás notas desea ingresar?");
                    int ntc3 = sc.nextInt();
                    System.out.println("Ingrese las notas de la cuarta clase: ");
                    for (int i = 0; i < ntc3; i++) {
                        Float cc = sc.nextFloat();
                        arr4.add(cc);
                    }
                    System.out.println(arr4);
                    System.out.println("-------------------------------------------");
                    System.out.println("¿Cuantás notas desea ingresar?");
                    int ntc4 = sc.nextInt();
                    System.out.println("Ingrese las notas de la quinta clase en (porcentajes): ");
                    for (int i = 0; i < ntc4; i++) {
                        Float cc = sc.nextFloat();
                        arr5.add(cc);
                    }
                    System.out.println(arr5);
                    break;
                
                case 2:
                        System.out.println("Promedio primera clase: ");
                        System.out.println(hp.calcularMediaArray(arr1) + "%");
                        System.out.println("-------------------------------------------");
                        System.out.println("Promedio segunda clase: ");
                        System.out.println(hp.calcularMediaArray(arr2) + "%");
                        System.out.println("-------------------------------------------");
                        System.out.println("Promedio tercera clase: ");
                        System.out.println(hp.calcularMediaArray(arr3) + "%");
                        System.out.println("-------------------------------------------");
                        System.out.println("Promedio cuarta clase: ");
                        System.out.println(hp.calcularMediaArray(arr4) + "%");
                        System.out.println("-------------------------------------------");
                        System.out.println("Promedio quinta clase: ");
                        System.out.println(hp.calcularMediaArray(arr5) + "%");
                        System.out.println("-------------------------------------------");
                    break;
                
                case 3:
                    double pr1 = hp.calcularMediaArray(arr1);
                    double pr2 = hp.calcularMediaArray(arr2);
                    double pr3 = hp.calcularMediaArray(arr3);
                    double pr4 = hp.calcularMediaArray(arr4);
                    double pr5 = hp.calcularMediaArray(arr5);

                    double total = pr1 + pr2 + pr3 + pr4 + pr5;
                    double prom = total / 5; 

                    System.out.println("El promedio general es de: " + prom);
                    
                    System.out.println("-------------------------------------------");
                    if(pr1 >= 90){
                        System.out.println("Felicidades tienes un buen promedio en la primer clase ");
                    } else if (pr1 <= 10){
                        System.out.println("Cuidado tu promedio esta por debajo de la media en la primer clase");
                    }

                    System.out.println("-------------------------------------------");
                    if(pr2 >= 90){
                        System.out.println("Felicidades tienes un buen promedio en la segunda clase");
                    } else if (pr2 <= 10){
                        System.out.println("Cuidado tu promedio esta por debajo de la media en la segunda clase");
                    }

                    System.out.println("-------------------------------------------");
                    if(pr3 >= 90){
                        System.out.println("Felicidades tienes un buen promedio en la tercera clase");
                    } else if (pr3 <= 10){
                        System.out.println("Cuidado tu promedio esta por debajo de la media en la tercera clase");
                    }

                    System.out.println("-------------------------------------------");
                    if(pr4 >= 90){
                        System.out.println("Felicidades tienes un buen promedio en la cuarta clase");
                    } else if (pr4 <= 10){
                        System.out.println("Cuidado tu promedio esta por debajo de la media en la cuarta clase");
                    }

                    System.out.println("-------------------------------------------");
                    if(pr5 >= 90){
                        System.out.println("Felicidades tienes un buen promedio en la quinta clase");
                    } else if (pr5 <= 10){
                        System.out.println("Cuidado tu promedio esta por debajo de la media en la quinta clase");
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ingresa una opcion valida por favor");
                    break;
            }
        }   
    }
}
