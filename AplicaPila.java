package Clases;
import java.util.Scanner;
public class AplicaPila {
    
    static Scanner teclado=new Scanner(System.in);
    public static CPila Pila;
    public static void main (String args[]){
    MenuPila();
}
static void creaPila(){
    int tam;
    System.out.print("Ingrese Tamaño de la Pila: ");
    tam=teclado.nextInt();
    Pila=new CPila(tam);
    System.out.println("pila creada....\n");
}
    static void MenuPila(){
        int opcion; 
        
        do{
            System.out.println("========================");
            System.out.println("\nMenú de Opciones");
            System.out.println("===========================");
            System.out.println("[1] Crear Pila");
            System.out.println("[2] Ingresar Datos-(apilar)");
            System.out.println("[3] Eliminar Datos(desapilar)");
            System.out.println("[4] Mostrar Pila");
            System.out.println("[5] Eliminar Pila");
            System.out.println("[6] Mostrar Cima de la Pila");
            System.out.println("[7] Mostrar tamaño de la Pila");
            System.out.println("=============================");
            System.out.println("[0] Salir");
            
            System.out.print("\nIngrese una Opción: ");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1 : 
                    creaPila();
                    break;
                case 2 : 
                    Pila.InsertarPila();
                    break;
                case 3 : 
                    Pila.EliminarPila();
                    break;
                case 4 : 
                    Pila.MostrarPila();
                    break;
                case 5 : 
                    Pila.VaciarPila();
                    System.out.println("\n");
                    break;
                 case 6 : 
                    Pila.MostrarCimaPila();
                    System.out.println("\n");
                    break;
                 case 7 : 
                    Pila.MostrarTamaño();
                    break;
                case 0 : 
                    System.out.println("Saliendo del sistema....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese Opción Correcta....");
                    System.out.println("\n");
            }
        } while (opcion!=0);
    }
}
            
        
    

