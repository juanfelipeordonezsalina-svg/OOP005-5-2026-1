


import java.util.Scanner;
public class Arreglos {






    public int [] data ;
    public int n ;
    public Scanner scaner;
// Constructor : crea vector de t a m a o n
    public Arreglos ( int n) {
       this . n = n ;
       this . data = new int[n];
       this.scaner= new Scanner(System.in);
    }
    
   public void SetArray(){
       
        System.out.println("escriba el elementos del arreglo");
       
        
        for(int i=0; i<n; i++){
            System.out.println("posicion"+ " "+ i + " " + ":");
             data[i]=scaner.nextInt();
        }
          
        }
        
        
       public void ShowArray(){
           System.out.println("Los elementos son :");
           
 for(int i:data){
     
     
      System.out.print(" [ ") ;
            System.out.print(i);
             System.out.print(" ] "+",") ;
        }
           
        }
  
    
    public static void main(String[] args) {
        Arreglos obj = new Arreglos(5);
obj.SetArray();
obj.ShowArray();
    } 
        
   }
    


