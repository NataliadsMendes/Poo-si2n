
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;

public class atv1 {
    public static void main(String[] args){
        
        int idade;  // - variavel
        idade = 28;
        
        int[] idades = new int[10]; 
        idades[0] = 28;
        idades[1] = 29;
        
        List<String> pauta = new ArrayList();
        pauta.add("Vinicius");
        pauta.add("Rosalen");
        pauta.add("Silva");
        pauta.add("Rosalen");
        
        Set<String> pauta2 = new HashSet();
        pauta2.add("Joao");
        pauta2.add("Maria");
        
        Map<String, String> pauta3;
        pauta3 = new HashMap();
        pauta3.put("Mat01", "Vinicius");
        pauta3.put("Mat02","Rosalen");
        
        for(int i=0; i< pauta.size(); i++){
            System.out.println(pauta.get(i));
        }
        
        System.out.println("== V2 ==");
        for(String e : pauta){
            System.out.println(e);
    
        }
        
        System.out.println("== V3 ==");
        pauta.forEach(e -> System.out.println(e));
        
        
        
    }
}
