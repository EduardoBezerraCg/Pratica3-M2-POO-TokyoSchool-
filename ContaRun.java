package Contas;

public class ContaRun {

    public static void main(String[] args) {
        Conta c1 = new Conta(111,1000,2000);
        Conta c2 = new Conta(222,1200,1500);


        c1.depositar(200);
        c2.depositar(200);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }

}
