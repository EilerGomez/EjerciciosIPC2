public class Hola{
    public static void main(String args[]){
        
        for(int i=4; i<=50; i++){
            try{
                Thread.sleep(200);
                System.out.println("Desencriptando..." + i+"%");
            }catch(InterruptedException e){
                System.out.println("Error en parar el programa "+ e);
            }
          
        }
    }
}
