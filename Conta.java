##CTQuestão01##

import java.util.ResourceBundle.Control;

public class ContaEspecial extends Conta{
    private double limite;

    public double getLimite(){
        return limite;
    }
    public void setLimite(double limite){
        this.limite = limite; 
    }
}

public class Conta extends Conta {
    public void reajustar(double percentual){
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual + percentual;
        this.depositar(reajuste);
    }
}
public ContaEspecial(int numero, String nome_titular, double limite){
    super(numero,nome_titular);
    this.limite=limite;
}
public Conta(int numero, String nome_titular){
    super(numero,nome_titular);
}
public class ContaPoupanca extends Conta{
    public void reajustar(double percentual){
        saldo = saldo + saldo * percentual;
    }
}
public boolean sacar(double valor){
    if(valor <= this.limite + this.saldo){
        this.saldo -= valor;
        return true;
    } else {
        return false;
    }
}
