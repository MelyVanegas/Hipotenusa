
package LogicaNegocio;

public class Hipotenusa {
    
    public Hipotenusa()
    {    
    }
    
    public double CalcularHipotenusa(Double LadoUno, Double LadoDos)
    {
        double Hipotenusa = 0;
        double CuadradoLadoUno = 0;
        double CuadradoLadoDos = 0;        
        
        CuadradoLadoUno = Math.pow(LadoUno, 2);
        CuadradoLadoDos = Math.pow(LadoDos, 2);
        
        Hipotenusa = CuadradoLadoUno + CuadradoLadoDos;
        
        Hipotenusa = Math.sqrt(Hipotenusa);
        
        return Hipotenusa;
                
    }    
}

