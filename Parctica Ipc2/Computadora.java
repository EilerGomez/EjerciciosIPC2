public class Computadora{

    public static void main(String args[]){
        for(MiClase personas : MiClase.values()){
            System.out.printf("%s\t%s\t%d\n", personas, personas.getApellido(), personas.getEdad());
            System.out.println("-------------------------");
        }
    }
}