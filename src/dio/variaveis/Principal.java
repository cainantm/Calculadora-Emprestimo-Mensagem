package dio.variaveis;

public class Principal {

    public static void main(String[] args) {

        //calculadora
        System.out.println("Exercício Calculadora");
        calculadora.soma(3,6);
        calculadora.subtracao(9, 1.8);
        calculadora.multiplicacao(7,8);
        calculadora.divisao(5,2.5);

        //mensagem
        System.out.println("Exercício mensagem:");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //empréstimo
        System.out.println("Exercício empréstimo:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
