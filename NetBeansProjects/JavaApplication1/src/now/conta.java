package now;

public class conta {
    int numero;
    
    double saldo;
    
    Cliente cliente;
  
    
    
    boolean sacar(double valor){
        if(verificarTransacao(valor)){
            saldo = saldo - valor;
            return true;
        }
        //boolean verificarTransacao(double valor){
        //    return saldo >= valor;
        //}
        // if(saldo >= valor){
        //        return true;
        //    }
        //    else
        //        return false;
        //}
    return false;
    }
    void depositar (double valor){
        saldo = saldo + valor;
        // saldo += valor;
    }

    private boolean verificarTransacao(double valor) {
        return true;
    }
}
