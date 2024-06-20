public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && getSaldo() + limite >= valor) {
            super.depositar(-valor);  // Utiliza o método depositar para subtrair o valor
            System.out.println("Saque de " + valor + " realizado com sucesso (com limite).");
        } else {
            System.out.println("Saque não realizado. Verifique o saldo, o limite ou o valor do saque.");
        }
    }
}
