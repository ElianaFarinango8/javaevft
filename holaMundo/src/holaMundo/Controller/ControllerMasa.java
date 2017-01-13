package holaMundo.Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import holaMundo.Model.CalculadoraModel;

@ManagedBean /*
				 * permite que se use el lenguaje de expresiones desde la pagina
				 * web para guardar los datos como parte de la clase
				 * ControllerMasa
				 */
@SessionScoped // especifica que las variables se guardaran en una session
				// temporal

public class ControllerMasa {

	private String nombre; 		//IMC
	private double estatura;	//IMC
	private double peso;		//IMC
	private double resultado;	//IMC esta propiedad es de solo lectura por lo que solo se genera un get
	private double valorBase;	//IVA 
	private double descuento;	//IVA
	private double IVA;			//IVA
	private double valorPagar;	//IVA
	private double dolares;		//CambioMoneda
	private double resultCambio;//CambioMoneda

	public String actionCalcular() {
		CalculadoraModel calc = new CalculadoraModel();
		try {
			resultado = calc.calcularIMC(estatura, peso);
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		return "masa_resultado";
	}

	public String actionCalcularIVA(){
		CalculadoraModel calc = new CalculadoraModel();
		IVA=calc.calcularIVA(valorBase, descuento);
		valorPagar=calc.totalPagar(valorBase, descuento);
		return "iva_resultado";
	}
			
	public String actionCambioMoneda(){
		CalculadoraModel calc = new CalculadoraModel();
		resultCambio=calc.cambioMoneda(dolares);
		return "cambio_resultado";		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getResultado() {
		return resultado;
	}

	public double getValorBase() {
		return valorBase;
	}

	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getIVA() {
		return IVA;
	}

	public void setIVA(double iVA) {
		IVA = iVA;
	}

	public double getValorPagar() {
		return valorPagar;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getDolares() {
		return dolares;
	}

	public void setDolares(double dolares) {
		this.dolares = dolares;
	}

	public double getResultCambio() {
		return resultCambio;
	}

	
}
