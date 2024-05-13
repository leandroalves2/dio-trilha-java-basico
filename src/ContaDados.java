public class ContaDados {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public ContaDados(int numero, String agencia, String nomeCliente, double saldo)
    {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\"Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " +
                "conta " + numero + " e seu saldo " + saldo + " já está disponível para saque\".\n";
    }
}
