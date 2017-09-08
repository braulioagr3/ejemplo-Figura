/**
 * Esta es una Super clase para la figura
 * 
 * @author (Braulio A. García Rivera) 
 * @version (V 0.1)
 */
public class Figura
{
    protected float area;
    /**
     * Constructor de la clase Figura
     */
    public Figura()
    {
        area = 0;
    }
    /**
     * Calcula el area de la figura
     */
    public void calculaArea()
    {
        System.out.println("No se como calcular el area");
    }
    /**
     * Imprime el area de la Figura
     */
    public void imprimeArea()
    {
        System.out.println("El area de la figura es: "+area);
    }
}
