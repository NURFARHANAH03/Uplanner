public class Main {
    public static void main(String[] args) {
        
        Maybank account = new Maybank(3000);
        MAE mae = new MAE(3000,900);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
	    String name = scanner.nextLine();
	    System.out.print("Enter your Id: ");
	    int id = scanner.nextInt();
	    
	    System.out.print("Enter your deposit: ");
	    Double deposits = scanner.nextDouble();
        account.deposit(deposits); 
        System.out.print("Enter your withdraw: ");
	    Double withdraw = scanner.nextDouble();
        mae.Withdraw(withdraw);

        System.out.print(name + ", " + id + " deposited:" + deposits + " withdrawed:" + withdraw);
    }
}
