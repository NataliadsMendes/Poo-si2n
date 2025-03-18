package atores;

public class u1{
    public static void main(String[] args) {
        
        a1 a01 = new a1();
        
        a01.corCabelo = "Roxo";
        a01.posX = 0;
        a01.posY = -10;
        
        a01.move();
        a01.turn();
        
        if(a01.posY >0)
            a01.say("BUUUUUUUUUUUUUUUUUUUUU");
        
        else
            a01.say("oiiiiiiiiiiiiiiiiii");
    }
}

/*como em java um numero em random e numero e que seja maior que 50%*/