package one.digitalinovation;

public class Calculadora implements OperacaoMatematica {

    public Calculadora() {
        super();
    }

    @Override
    public void soma(double num1, double num2) {
        System.out.println("Soma: " + num1 + num2);
    }

    @Override
    public void subracao(double num1, double num2) {
        System.out.println("Subtracao: " + (num1 - num2));
    }

    @Override
    public void multiplicacao(double num1, double num2) {
        System.out.println("Multiplicação: " + num1 * num2);
    }

    @Override
    public void divisao(double num1, double num2) {
        System.out.println("Divisão: " + num1/num2);
    }
}
