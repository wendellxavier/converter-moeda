package converter;

import java.util.Scanner;
/// class principal
public class Principal {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int opcao;
/// menu principal
        Cofrinho cofrinho = new Cofrinho();
        do {
            System.out.println("Menu:");
            System.out.println("1- Listar ");
            System.out.println("2- Adicionar ");
            System.out.println("3- Remover ");
            System.out.println("4- Total");
            System.out.println("0- Encerrar ");
            opcao = teclado.nextInt();
    
            /// varifacndo qual opcao sera feita
            switch (opcao){

                case 1:
                    cofrinho.listar();
                    break;
                case 2:
                    adicionar(cofrinho, teclado);
                    break;
                case 3:
                    remover( cofrinho, teclado);
                    break;
                case 4:
                    System.out.println("Total " + cofrinho.calcularTotal());
                    break;
                case 0:
                    System.out.println("Encerrando");
                    break;
                default:
                    System.out.println("Opção invalida");
                }       
       
        } while (opcao != 0);

        teclado.close();

    }
/// menu de moeda
    private static void adicionar(Cofrinho cofrinho, Scanner teclado){
        System.out.println("Menu moeda: ");
        System.out.println("1- real");
        System.out.println("2- dolar");
        System.out.println("3-euro");
        int tipo = teclado.nextInt();
        System.out.println("valor: ");
        double valor = teclado.nextDouble();
    
        Moeda moeda = null;
    ///verificando tipo de moeda
        switch (tipo) {
            case 1:
                moeda = new Real(valor);
                break;
            case 2:
                moeda = new Dolar(valor);
                break;
            case 3:
                moeda = new Euro(valor);
                break;
            default:
                System.out.println("Invalido");
                return;
        }
    ///adicionando no cofre
        cofrinho.adicionar(moeda);
    
        System.out.println("Adicionou");
    
    }
///removendo do cofre
    private static void remover(Cofrinho cofrinho, Scanner teclado){
        System.out.print("qual valor da moeda a ser removida ?");
        double valor = teclado.nextDouble();

        Moeda moedaRemover = null;

        for (Moeda moeda : cofrinho.getMoedas()){
            if (moeda.getValor() == valor){
                moedaRemover = moeda;
                break;
            }
        }

        if (moedaRemover != null){
            cofrinho.remover(moedaRemover);
            System.out.println("removida");
        } else {
            System.out.println("moeda invalida");
        }
    }
}