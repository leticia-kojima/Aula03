import java.util.Scanner;

public class OperadorOu {

	public static void main(String[] args) {
		/*Fa�a um programa que receba o total de compras de um usu�rio e um cupom. Se o total de compas exceder 1000 ou se o cupom for igual a DESCONTO20, aplicar um desconto de 20% na compra*/
		Scanner leitor = new Scanner(System.in);
		Double totalCompra, valorFinal=0.0;
		String cupom;
		System.out.println("SISTEMA DE DESCONTOS");
		System.out.println("Por favor, digite o valor total da compra");
		totalCompra = leitor.nextDouble();
		System.out.println("Por favor, digite o seu cupom");
		cupom = leitor.next();
		
		//Aqui � preciso criar um if que verifique as duas condi��es para que o desconto seja ou n�o aplicado
		
		if (cupom.equalsIgnoreCase("DESCONTO20") || totalCompra > 1000) {
			valorFinal = totalCompra * 0.8;
			System.out.println("Voc� possui desconto! Sendo assim, o valor total da compra foi de R$" + totalCompra + " para R$" + valorFinal + "!");
		}else {
			valorFinal = totalCompra;
			System.out.println("Cupom inv�lido ou valor n�o aplic�vel ao desconto!");
		}
		
		System.out.println("O valor final � de R$" + valorFinal);
		
		leitor.close();

	}

}
