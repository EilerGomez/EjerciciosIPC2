public class Hola{
    public static void main(String args[]){
        
        for(int i=0; i<=50; i++){
            try{
                Thread.sleep(100);
                System.out.println("Desencriptando..." + i+"%");
            }catch(InterruptedException e){
                System.out.println("Error en parar el programa "+ e);
            }
          
        }
    }
}
