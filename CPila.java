package Clases;
import java.util.Scanner;
public class CPila {
    
    //PASO 1
    static Scanner teclado=new Scanner(System.in);
    int tope;
    int[]pila;//array
    int max;//max de elementos
    
    //PASO2
    public CPila(){//inacializar valores
    this.tope=0;
    this.max=100;//1...100
    this.pila=new int[this.max+1];
    }
    //PROCESO 3
    public CPila(int MAX){//sobrecarga de constructores
    this.tope=0;//parametro diferente
    this.max=100;
    this.pila=new int[this.max+1];//el array empieza en 0
    }
    
    //PROCESO 4
    public int getTope(){
        return tope;
    }
    
    //PROCESO 5
    public void VaciarPila(){
        this.tope=0;
    }
    
    //PROCESO 6
    public boolean IsPilaLlena(){
        if(this.max==this.tope){
            return true;
        }else{
            return false;
        }
    }
    
    //PROCESO 7
     public boolean IsPilaVacia(){
        if(this.tope==0){
            return true;
        }else{
            return false;
        }
    }
     
     //PROCESO 8
     public void InsertarPila(){
         if(this.IsPilaLlena()){
             System.out.println("La Pila esta Llena");
         }else{
             int item;
             System.out.print("Ingrese el Elemento a Ingresar: ");
             item= teclado.nextInt();
             this.pila[this.tope]=item;
             this.tope++;
             System.out.println("El Item "+item+" Se inserto la pila\n");
         }
     }
     
     //PROCESO 9 
     public void EliminarPila(){
         if(this.IsPilaVacia()){
             System.out.println("La Pila está vacia");
                 
              }else{
                int item=this.pila[this.tope-1];
                this.tope--;
                System.out.print("El Item "+item+"Se elimino de la Pila");
             
         }
     }
     
     //PROCESO 10
     public void MostrarPila(){
         if(this.IsPilaVacia()){
             System.out.println("La Pila esta vacia no hay datos que mostrar");
         }else{
             System.out.println("\tElementos de la pila");
             System.out.println("\t======================");
             for(int i=0;i<this.tope;i++){
                 System.out.println(this.pila[i]+" <-- ");
             }
             
         }
         
     }
      //PROCESO 11
     public void MostrarCimaPila(){
          int ultimo;
             
                 ultimo=this.pila[this.tope-1];
                 System.out.println("La cima de la pila es el item : "+ ultimo);
             
                
     }
   public void MostrarTamaño(){
            int tam;
                tam=this.max;
                System.out.println("El número máximo de elementos que se pueden ingresar en la pila es : "+ tam);
             
                
    }   
}
