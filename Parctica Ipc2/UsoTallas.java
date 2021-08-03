import java.util.*;
public class UsoTallas{
    //enum Talla {MINI,MEIDANO,GRANDE,MUY_GRANDE};

    enum Talla {
        MINI("s"), MEIDANO("m"), MUY_GRANDE("XL"), GRANDE("L");

        private Talla(String abreviatura){
            this.abreviatura=abreviatura;
        }
        public String dameAbreviatura(){
            return abreviatura;
        }
        private String abreviatura;
    }
    public static void main(String args[]){
     
     Scanner teclado = new Scanner(System.in);
     System.out.println("Escribe una talla: MINI, MEDIANA, GRANDE O MUY GRANDE");
     String entradaTalla = teclado.next().toUpperCase();
     Talla talla = Enum.valueOf(Talla.class, entradaTalla);

     System.out.println("Talla= " + talla);
     System.out.println("Abreviatura= " + talla.dameAbreviatura());

    }
     
}