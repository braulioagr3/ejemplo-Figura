/**
 *Esta clase simboliza a un Cuadro.
 * 
 * @author (Braulio A. García Rivera) 
 * @version (08/09/2017)
 */
public class Cuadro extends Figura
{
    private float lado;
    Cuadro(float lado)
    {
        this.lado = lado;
    }
    /**
     * Calcula el area de la figura
     */
    @Override
    public void calcularArea()
    {
        area = lado * lado;
    }
    /**
     * Calcula el perimetro de la figura
     */
    @Override
    public void calcularPerimetro()
    {
        perimetro = lado * 4;
    }
}