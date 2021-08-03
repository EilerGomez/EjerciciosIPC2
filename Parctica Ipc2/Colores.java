public enum Colores{
    ROJO("RG45", 1),
    VERDE("VG56", 2),
    AZUL("AG78", 3),
    MORADO("MG12", 4),
    ROSA("RF23", 5);

    private final String codigo;
    private final int numero;

    private Colores(String cod, int num){
        this.codigo=cod;
        this.numero=num;
    }

    public String getCodigo(){
        return codigo;
    }
    public int getNumero(){
        return numero;
    }
}