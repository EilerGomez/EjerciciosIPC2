public enum MiClase{

    BETO("Bravo", 20),
    LUIS("Gomez", 27),
    MARIA("Lopez", 23);
     private final String apellido;
     private final int edad;

     private MiClase(String a, int b){
         this.apellido =a;
         this.edad=b;
     }

     public String getApellido(){
         return apellido;
     }

     public int getEdad(){
         return edad;
     }
}