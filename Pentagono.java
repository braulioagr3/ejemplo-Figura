/**
 *Esta clase es una Super clase para los Poligonos.
 * 
 * @author (Braulio A. García Rivera) 
 * @version (08/09/2017)
 */
public class Pentagono extends Poligono
{
    private int lado;
    private float apotema;
    Pentagono()
    {
        caras = 5;
        this.lado = lado;
        this.apotema = apotema;
    }
    /**
     * Calcula el area de la figura
     */
    @Override
    public void calcularArea()
    {
        area = apotema * lado * lado;
    }
    /**
     * Calcula el perimetro de la figura
     */
    @Override
    public void calcularPerimetro()
    {
        perimetro = lado * caras;
    }
}