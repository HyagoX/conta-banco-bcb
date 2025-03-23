import java.util.Locale;
import java.util.Scanner;

public class SimulacaoContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.UK);

        //Recebendo informacoes da conta
        System.out.println("Seja bem vindo ao nosso banco Terminal, vamos criar sua conta");
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite a sua agencia bancaria: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da agencia: ");
        int numero = scanner.nextInt();

        System.out.println("Defina a quantidade que deseja depositar: ");
        double saldo = scanner.nextDouble();

        //Colocando as informacoes no terminal
        System.out.println("Olá " + nome + " ,obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " ,conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
    }
}
