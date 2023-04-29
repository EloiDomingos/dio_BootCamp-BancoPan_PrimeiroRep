package one.digitaiinovation;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();//upcast
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // downcast - Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}
