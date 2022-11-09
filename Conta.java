package Contas;

public class Conta {

    private int numero;
    private double saldo;
    private double limite;

    public Conta(int numero, double saldo, double limite){
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.setLimite(limite);
    }

    void depositar(double valor){
        setSaldo(getSaldo() + valor);
    }

    void  sacar (double valor){
        setSaldo(getSaldo() - valor);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}