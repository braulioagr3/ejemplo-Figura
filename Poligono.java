/**
 *Esta clase es una Super clase para los Poligonos.
 * 
 * @author (Braulio A. García Rivera) 
 * @version (08/09/2017)
 */
public class Poligono extends Figura
{
    protected int caras;
    Poligono()
    {
        caras = 0;
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
}