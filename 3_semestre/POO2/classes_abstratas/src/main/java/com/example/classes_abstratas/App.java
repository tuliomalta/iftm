public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", "12345", 5000);
        System.out.println("Salário do Gerente: " + gerente.calculaSalario());

        Vendedor vendedor = new Vendedor("Ana", "67890", 2000, 10000);
        System.out.println("Salário do Vendedor: " + vendedor.calculaSalario());
    }
}
