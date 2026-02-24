



    
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
   public int sumArray(){
     int s=0;
     for (int i=0;i<n;i++) s= s+data[i];
        
     return s;
  }
    public int subArray(){
     int s=0;
     for (int i=0;i<n;i++) s= s-data[i];
        
     return s;
  }
    public double promedio(){
        if (n==0) {
            System.out.println("El sistema es indeterminado, se da 0.0 como un valor de salida");
         return 0.0;}
        
        return  sumArray()/ n;
                
        
    }
    public int max(){
        int m=0;
     for(int i =0;i<n;i++){
         if(data[i]>m)m=data[i];
                    
             }
     return m;
    }
    public int min(){
        int m=1000000000;
     for(int i =0;i<n;i++){
         if(data[i]<m)m=data[i];
                    
             }
     return m;
    }
        
        
       public void ShowArray(){
           System.out.println("Los elementos son :");
           
 for(int i:data){
     
     
      System.out.print(" [ ") ;
            System.out.print(i);
             System.out.println(" ] "+" ") ;
        }
           
        }
  
    public static void main(String[] args) {
        Arreglos obj = new Arreglos(8);
obj.SetArray();
obj.ShowArray();
System.out.println("la suma de los objetos en el arreglo es:"+" "+obj.sumArray());
System.out.println("la resta de los objetos en el arreglo es:"+" "+obj.subArray());
System.out.println("el promedio de los objetos en el arreglo es:"+" "+obj.promedio());
System.out.println("el maximo valor en los objetos en el arreglo es:"+" "+obj.max());
System.out.println("el minimo valor en los objetos en el arreglo es:"+" "+obj.min());
    } 
        
   }
    

    
   


