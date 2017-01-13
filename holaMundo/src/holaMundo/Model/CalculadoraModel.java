package holaMundo.Model;

public class CalculadoraModel {
	
	public double calcularIMC(double estatura, double peso) throws Exception{
		if(peso==0)
			throw new Exception("No se puede tener peso igual a cero.");
		return estatura/peso;
	}
	
	public double calcularIVA(double valorBase,double descuento){
		return ((valorBase - descuento)*0.12);
	}

	public double totalPagar(double valorBase,double descuento){
		return valorBase+((valorBase - descuento)*0.12);
	}
	
	public double cambioMoneda(double dolares){
		return dolares*2900;
	}
}