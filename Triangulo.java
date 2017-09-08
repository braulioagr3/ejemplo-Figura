/**
 *Esta clase simboliza a un Triangulo.
 * 
 * @author (Braulio A. García Rivera) 
 * @version (08/09/2017)
 */
public class Triangulo extends Figura
{
    float base;
    float altura;
    Triangulo(float base, float altura)
    {
       this.base = base;
       this.altura = altura;
    }
    /**
     * Calcula el area de la figura
     */
    @Override
    public void calcularArea()
    {
        area = base * altura;
    }
    /**
     * Calcula el perimetro de la figura
     */
    @Override
    public void calcularPerimetro()
    {
        perimetro = (base * altura)/2;
    }
}
