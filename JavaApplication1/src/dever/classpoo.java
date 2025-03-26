import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author alunolab11
 */
public class classpoo {
    
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap();
        
        agenda.put("Alan", "27998023049");
        agenda.put("Beatriz","27998064567");
        agenda.put("Carlos", "28983456785");
        agenda.put("Denise","sai da live filha");
        agenda.put("Edu", "33993462974");
        agenda.put("Fe", "11994820394");
        
        System.out.println("== V3 ==");
        agenda.forEach(e -> System.out.println(e));
        
        
        
    }
    
}
