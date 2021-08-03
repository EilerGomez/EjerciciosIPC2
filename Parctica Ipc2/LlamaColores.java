import java.util.Scanner;
public class LlamaColores{
    public static void main(String args[]){
        String rojo="ROJO";
        String azul="Azul";
        String verde ="VERDE";
       String posicion[]= new String[3];
        Scanner teclado = new Scanner(System.in);

      
        int i=0;
        /*while(i==0){
                System.out.print("Presione la tecla y para continuar: ");
                String tecla = teclado.next();
            if(tecla.equalsIgnoreCase("y")){
                System.out.println("A continuación se le muestran algunos enums: ");
                System.out.println("---------------------");
                for(Colores colores: Colores.values()){
                System.out.printf("%s\t%s\t%d\n", colores, colores.getCodigo(),
                colores.getNumero());
                System.out.println("---------------------");
                }
                i=1;
            }else{
                System.out.println("Debes presionar la tecla y");
                i=0;
            }
        }*/
        for(int a=0; a<=3; a++){
            for(int h=0; h<=2;h++){
                int aleatorio=(int)(Math.random()*3);
            
                if(aleatorio==0){
                    posicion[h]="ROJO";
                }else if(aleatorio==1){
                    posicion[h]="VERDE";
                }else if(aleatorio==2){
                    posicion[h]="AZUL";
                    }
            }
            System.out.print("");
        System.out.println("----------------------");
        System.out.println("| " +posicion[0]+" | "+posicion[1]+" | "+posicion[2] + "|");
        System.out.println("----------------------");
        }
        
        
        

        //juegos de azar
     

     
        
    }
}