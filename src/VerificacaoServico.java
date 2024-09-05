import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lê o nome do serviço a ser verificado
        System.out.print("Digite o nome do serviço a ser verificado (movel, fixa, banda larga ou tv): ");
        String servicoVerificar = scanner.nextLine().trim();

        // Lê o nome do cliente e os serviços contratados
        System.out.print("Digite o nome do cliente seguido pelos serviços contratados (exemplo: Alice,movel,fixa): ");
        String entradaCliente = scanner.nextLine().trim();

        // Divide a entrada do cliente em partes separadas por vírgula
        String[] partesEntrada = entradaCliente.split(",");

        // O primeiro elemento é o nome do cliente
        String nomeCliente = partesEntrada[0];

        // Verifica se o serviço está contratado pelo cliente
        boolean contratouServico = false;
        for (int i = 1; i < partesEntrada.length; i++) {
            if (partesEntrada[i].equals(servicoVerificar)) {
                contratouServico = true;
                break;
            }
        }

        // Imprime o resultado
        if (contratouServico) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        scanner.close();
    }
}
