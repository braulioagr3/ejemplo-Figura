/**
 *Esta clase simboliza a un Circulo.
 * 
 * @author (Braulio A. García Rivera) 
 * @version (08/09/2017)
 */
public class Circulo extends Figura
{
    private float radio;
    Circulo(float radio)
    {
       this.radio = radio;
    }
    /**
     * Calcula el area de la figura
     */
    @Override
    public void calcularArea()
    {
        area = 3.1416f * radio * radio;
    }
    /**
     * Calcula el perimetro de la figura
     */
    @Override
    public void calcularPerimetro()
    {
        perimetro = 3.14f * radio;
    }
}
