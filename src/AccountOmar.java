import java.util.Scanner;

interface Print{  
void printTest();  




}  


abstract class Abs {
	abstract void display();
}

 
class Account {  
		int acc_no;  
		int bb;
		String name;  
		float amount; 
		
     //Method to initialize object  
		void insert(int a,String n,float amt){  
		acc_no=a;  
		name=n;  
		amount=amt;  
		}  
		
		void insert(int a,int b,String n,float amt){  
			acc_no=a;
			bb=b;
			name=n;  
			amount=amt;  
			}  
		
		//deposit method  
		void deposit(float amt){  
		amount=amount+amt;  
		System.out.println(amt+" deposited");  
		}  
		//withdraw method  
		void withdraw(float amt){  
		if(amount<amt){  
		System.out.println("Insufficient Balance");  
		}else{  
		amount=amount-amt;  
		System.out.println(amt+" withdrawn");  
		}  
		}  

	    //method to check the balance of the account  
		void checkBalance(){System.out.println("Balance is: "+amount);}  
		//method to display the values of an object  
		void display(){System.out.println(acc_no+" "+bb+" " +name+" "+amount );}  
} 

//Creating a test class to deposit and withdraw amount  

public class AccountOmar extends Abs implements Print   {  

	@Override
	void display() {
		System.out.println("abstract Message");
		
	}
	public void printTest(){System.out.println("interface Message");} 
	
	public static void main(String[] args){  
		
		
		
		
		
		
		
		
		Account a1=new Account();  
		a1.insert(832345,"Muhammed",3000);  
		a1.display();  
		a1.insert(832345,5656,"Muhammed",3000);  
		a1.display(); 
		
		Abs ab =new AccountOmar();
		ab.display();
		
		Print p = new AccountOmar();  
		p.printTest();  
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("acc_no=");
		int a =scan.nextInt();
		System.out.println("name=");
		int name =scan.nextInt();
		System.out.println("amount=");
		Long amount =scan.nextLong();
		
		long x = a+name+amount;
		System.out.println(x);
		
		
		
		
//		a1.checkBalance();  
//		a1.deposit(40000);  
//		a1.checkBalance();  
//		a1.withdraw(15000);  
//		a1.checkBalance();  
		}

	

}





