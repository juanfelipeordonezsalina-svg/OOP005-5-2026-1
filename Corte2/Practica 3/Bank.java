package checkingaccount;

public class Bank {
private CheckingAccount accountOne;
private CheckingAccount accountTwo;
private CheckingAccount accountThree;
private CheckingAccount accountFour;
        public Bank(){
            accountOne = new CheckingAccount("Juan",100,"1");
            accountTwo = new CheckingAccount("Felipe",200,"2");
            accountThree = new CheckingAccount("Mauricio",5000,"3");
            accountFour = new CheckingAccount("Nicolas",67,"4");
        }
   
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println("saldo:"+b.accountOne.getBalance());
        System.out.println("nombre:"+b.accountOne.getName());
        System.out.println("id:"+b.accountOne.getId());
          
     
        System.out.println("saldo:"+b.accountTwo.getBalance());
        System.out.println("nombre:"+b.accountTwo.getName());
        System.out.println("id:"+b.accountTwo.getId());
        
        
        System.out.println("saldo:"+b.accountThree.getBalance());
        System.out.println("nombre:"+b.accountThree.getName());
        System.out.println("id:"+b.accountThree.getId());
        
        
        System.out.println("saldo:"+b.accountFour.getBalance());
        System.out.println("nombre:"+b.accountFour.getName());
        System.out.println("id:"+b.accountFour.getId());
        
      
    }
    
}
