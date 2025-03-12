import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = leitor.nextLine();
        System.out.println("Numero da conta: ");
        String numeroConta = leitor.nextLine();
        System.out.println("Digite seu nome: ");
        String nomeUsuario = leitor.nextLine();
        System.out.println("Digite seu saldo: ");
        float saldoConta = leitor.nextFloat();
        System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");
    }
}