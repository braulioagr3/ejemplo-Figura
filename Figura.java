/**
 * Esta es una Super clase para la Figura
 * 
 * @author (Braulio A. García Rivera) 
 * @version (08/09/2017)
 */
public class Figura
{
    protected float area;
    protected float perimetro;
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
    public void calcularArea()
    {
        System.out.println("No se como calcular el area");
    }
    /**
     * Calcula el perimetro de la figura
     */
    public void calcularPerimetro()
    {
        System.out.println("No se como calcular el perimetro");
    }
    /**
     * Imprime el area de la Figura
     */
    public void imprimeArea()
    {
        System.out.println("El area de la figura es: "+area);
    }
    /**
     * Imprime el perimetro de la Figura
     */
    public void imprimePerimetro()
    {
        System.out.println("El perimetro de la figura es: "+perimetro);
    }
}
