package facade;
import java.util.Scanner;

public class Main{
	
public static void main(String[] args) {
	
    Combo p = new Combo();
    System.out.println("Selecione seu combo");
    System.out.println(" ");
    System.out.println("1. Combo Master");
    System.out.println(" ");
    System.out.println(" Combo Master:");
    System.out.println("____________________");
    p.Combo_Master();
    System.out.println("____________________");
    System.out.println(" ");
    System.out.println("2. Super Combo");
    System.out.println(" ");
    System.out.println(" Super combo:");
    System.out.println("____________________");
    p.Super_Combo();
    System.out.println("____________________");
    System.out.println(" ");
    System.out.print("Sua escolha: ");
    Scanner Input = new Scanner(System.in);

    int tipo = Input.nextInt();

    if (tipo == 1){
        p.Combo_Master();
        System.out.println("Pedido realizado");
        
    }

    else if(tipo == 2){
        p.Super_Combo();
        System.out.println("Pedido realizado");
       
    }

    else{
        System.out.println("Combo invalido");
    }
}

	}

