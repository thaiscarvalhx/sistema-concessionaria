package MiniProjeto;

import java.util.Scanner;

public class SistemaConcessionariaMain {
    public static void main(String[] args) {

        System.out.println("--\tVerificação de conta cadastrada no banco de dados\t--");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Adicione os dados do cliente");
        System.out.println("Nome, genero, idade e seu número de CPF, respectivamente: ");
        Cliente cliente1 = new Cliente(entrada.next(), entrada.next(), entrada.nextInt(), entrada.nextLong());

        System.out.println("Vendedor que está solicitando acesso: " + "Insira nome, setor e número de identificação");
        Vendedor vendedor1 = new Vendedor(entrada.next(), entrada.next(), entrada.nextLong());

        System.out.println("Simulação de veículo");
        System.out.println("Adicione modelo, cor, ano e tipo de veículo: ");
        Veiculo veiculo1 = new Veiculo(entrada.next(), entrada.next(), entrada.nextInt(), entrada.next());

      /*  System.out.println("\nAdicione os dados do cliente");
        System.out.println("Nome, genero, idade e seu número de CPF, respectivamente: ");
        Cliente cliente1 = new Cliente("Thaís", "Feminino", 20, 49895806809L);
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getGenero());
        System.out.println(cliente1.getIdade());
        System.out.println(cliente1.getCpf());

        System.out.println("\nVendedor que está solicitando acesso: " + "Insira nome, setor e número de identificação");
        Vendedor vendedor1 = new Vendedor("Lucas", "Carro", 43600953842L);
        System.out.println(vendedor1.getNome());
        System.out.println(vendedor1.getSetorVeiculo());
        System.out.println(vendedor1.getIdentificacao());

        System.out.println("\n Simulação de veículo");
        System.out.println("Adicione modelo, cor, ano e tipo de veículo: ");
        Veiculo veiculo1 = new Veiculo("FOX", "Preto", 2020, "Carro");
        System.out.println(veiculo1.getModelo());
        System.out.println(veiculo1.getCor());
        System.out.println(veiculo1.getAno());
        System.out.println(veiculo1.getTipo()); */

        System.out.println("\n O cliente ");
        cliente1.imprimirCliente();
        System.out.println(" está solicitando o veículo ");
        veiculo1.imprimirVeiculo();
        System.out.println("simulado pelo vendedor ");
        vendedor1.imprimirVendedor();








    }
}
