import java.util.Scanner;

public class OperadorEComNumero {

	public static void main(String[] args) {
		/*Faça um programa que verifique se o usuário digitado é igual a 'administrador' e se a senha digitada é igual a '123'*/
		Scanner leitor = new Scanner(System.in);
		String usuario;
		int senha;
		System.out.println("SISTEMA DE LOGIN");
		System.out.println("Por favor, digite seu username:");
		usuario = leitor.next();
		System.out.println("Por favor, digite sua senha:");
		senha = leitor.nextInt();	
		//Aqui é preciso criar um if que verifique as duas condições para o login ser bem sucedido
		
		if (usuario.equals("administrador") && senha == 123) {
			System.out.println("Login realizado com sucesso!");
		}else {
			System.out.println("Usuário ou senha incorretos");
		}
		
		
		
		leitor.close();

	}

}
