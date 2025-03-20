/* Classe abstrata ContaBancaria que serve como base para diferentes tipos de contas */
abstract class ContaBancaria {
    protected double saldo; // Saldo da conta

    // Construtor que inicializa o saldo
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método abstrato para saque (deve ser implementado nas subclasses)
    public abstract void sacar(double valor);

    // Método para realizar depósito
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado: R$" + valor);
        System.out.println("Saldo atual: R$" + saldo);
    }
}

/* Classe ContaCorrente que herda de ContaBancaria */
class ContaCorrente extends ContaBancaria {
    // Construtor que inicializa o saldo
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    // Método para saque
    public void sacar(double valor) {
        if (valor > saldo) { // Verifica se há saldo suficiente
            System.out.println("Erro: Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        System.out.println("Saque realizado: R$" + valor);
        System.out.println("Saldo atual: R$" + saldo);
    }
}

/* Classe ContaPoupanca que herda de ContaBancaria */
class ContaPoupanca extends ContaBancaria {
    // Construtor que inicializa o saldo
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    // Método para saque
    public void sacar(double valor) {
        if (saldo - valor < 50) { // Verifica se o saldo não ficará abaixo de R$50
            System.out.println("Erro: Saldo mínimo de R$50,00 necessário!");
            return;
        }
        saldo -= valor;
        System.out.println("Saque realizado: R$" + valor);
        System.out.println("Saldo atual: R$" + saldo);
    }
}

/* Classe Banco que testa as contas */
class Banco {
    public static void main(String[] args) {
        // Criação de uma conta corrente com saldo inicial de R$500
        ContaCorrente cc = new ContaCorrente(500);
        // Criação de uma conta poupança com saldo inicial de R$200
        ContaPoupanca cp = new ContaPoupanca(200);

        // Realizando depósitos
        cc.depositar(100);
        cp.depositar(50);

        // Realizando saques
        cc.sacar(200); // Sucesso
        cp.sacar(180); // Sucesso
        cp.sacar(100); // Falha (saldo mínimo de R$50 necessário)
    }
}
