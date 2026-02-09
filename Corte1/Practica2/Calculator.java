
package calculator;


public class Calculator {
public int x1, x2;
  //Constructor 
public Calculator(int a,int b){
 x1=a;
 x2=b;
}

public int add(){
    return x1 + x2;
}
public int subs(){
    return x1 - x2;
}
public int multiplicar(){
    return x1*x2;
}
public int dividir(){
    if(x2==0){
    System.out.println("Indeterminado");
    }
}
else{
return x1/x2;
}
}
    public static void main(String[] args) {
    Calculator m = new Calculator (34, 43);
    System.out.println("la suma del objeto es:" + m.add());        
    System.out.println("la resta del objeto es:" + m.subs());
    System.out.println("la multiplicacion del objeto es:" + m.multiplicar());
    Calculator n= new Calculator (13,6);
    System.out.println("la suma del objeto es:" + n.add());        
    System.out.println("la resta del objeto es:" + n.subs());
    System.out.println("la multiplicacion del objeto es:" + n.multiplicar());
    }
    
}
