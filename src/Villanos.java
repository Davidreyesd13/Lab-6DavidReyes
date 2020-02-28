
public class Villanos extends General {
    private boolean libertad;
    private int victimas;

    public Villanos(boolean libertad, int victimas, String nombre, String planet, int edad, double altura) {
        super(nombre, planet, edad, altura);
        this.libertad = libertad;
        this.victimas = victimas;
    }

    
    
}
