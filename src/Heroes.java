
import java.util.ArrayList;


public class Heroes extends General {
    private int atrapv;
    private ArrayList habilidades;

    public Heroes(int atrapv, ArrayList habilidades, String nombre, String planet, int edad, double altura) {
        super(nombre, planet, edad, altura);
        this.atrapv = atrapv;
        this.habilidades = habilidades;
    }
    
}
