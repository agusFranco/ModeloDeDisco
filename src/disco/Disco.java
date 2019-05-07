package disco;

public class Disco {

	private double radioInt;
	private double radioExt;
	private double perimetroExt;
	private double perimetroInt;
	private double superficie;

	public Disco(double radioInterior, double radioExterior) {
		if (radioInterior == 0 || radioExterior == 0) {
			throw new IllegalArgumentException("Los radios deben ser mayores a 0.");
		}

		if (radioInterior > radioExterior) {
			throw new IllegalArgumentException("El radio interior debe ser menor al radio exterior.");
		}
		
		this.setRadioExt(radioExterior);		
		this.setRadioInt(radioInterior);		
	}

	public double getRadioInt() {
		return radioInt;
	}

	public void setRadioInt(double radioInt) {
		if (radioInt > this.radioExt) {
			throw new IllegalArgumentException("El radio interior debe ser menor al radio ext");
		}

		this.radioInt = radioInt;
		this.calculoDelPerimetroInterior();
		this.calculoDeLaSuperficie();
	}

	public double getRadioExt() {
		return radioExt;
	}

	public void setRadioExt(double radioExt) {
		if (radioExt < this.radioInt) {
			throw new IllegalArgumentException("El radio exterior debe ser mayor al radio ext");
		}
		
		this.radioExt = radioExt;
		this.calculoDelPerimetroExterior();
		this.calculoDeLaSuperficie();
	}

	public double getPerimetroExt() {
		return this.perimetroExt;
	}

	public double getPerimetroInt() {
		return this.perimetroInt;
	}

	public double getSuperficie() {
		return this.superficie;
	}

	private void calculoDelPerimetroExterior() {
		// Redondeo a 2 decimales.
		this.perimetroExt = Math.round(this.radioExt * 2 * Math.PI * 100d) / 100d;
	}

	private void calculoDelPerimetroInterior() {
		// Redondeo a 2 decimales.
		this.perimetroInt = Math.round(this.radioInt * 2 * Math.PI * 100d) / 100d;
	}

	private void calculoDeLaSuperficie() {
		// Redondeo a 2 decimales.
		double superficieExt = Math.round(Math.PI * this.radioExt * this.radioExt * 100d) / 100d;
		double superficieInt = Math.round(Math.PI * this.radioInt * this.radioInt * 100d) / 100d;

		this.superficie = Math.round((superficieExt - superficieInt) * 100d) / 100d;
	}
}