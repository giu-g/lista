package pctEnquanto;

import java.util.Scanner;

public class ExercicioEnquanto {

	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num=entrada.nextInt();
		
			while (num<0) {
				System.out.println("Digite um número: ");
				num=entrada.nextInt();
			}
			while (num <= 100){
				    if ((num%2) != 0) {
				      System.out.print(num+", ");
				    }
				    num++;
				}
			entrada.close();
	}
}



