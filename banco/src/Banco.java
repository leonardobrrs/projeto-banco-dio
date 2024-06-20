public class Banco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("João", 1000, 500);
        ContaPoupanca cp = new ContaPoupanca("Maria", 2000, 0.03);

        cc.depositar(200);
        cc.sacar(500);
        cc.transferir(cp, 300);

        cp.renderJuros();
        cp.sacar(100);
        cp.transferir(cc, 200);

        System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
    }
}
