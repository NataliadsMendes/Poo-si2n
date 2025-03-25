package now;
 
public class app {
    public static void main(String[] args){
        
        Cliente c01 = new Cliente();
        c01.nome = "Vinicius";
        c01.endereco = "Mora na UVV";
        c01.cpf = "123456789-00";
        
        
        Cliente cliente02 = new Cliente("Rosalen",
                                  "Lab 11",
                                  "123456677-00");
                                  
        conta cc01 = new conta();
        cc01.numero = 1;
        cc01.saldo = 100;
        
        System.out.println("Saldo antes: " + cc01.saldo);
        
        cc01.depositar(50);
        cc01.sacar(30);
        
        System.out.println("Saldo depois: " + cc01.saldo);
        
        System.out.println("Qual o saldo da conta corrente de Vinicius");
        
        cc01.cliente = c01;
        
        System.out.println("Qual é o nome do Cliente da conta 1: ");
        System.out.println(cc01.cliente.nome);
        System.out.println(cc01.cliente.endereco);
    }
    
    
}
