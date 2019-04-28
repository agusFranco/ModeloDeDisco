package disco;

public class Disco {
	
	private float radioInt;
	private float radioExt;
	public double perimetroExt = 0;
	public double perimetroInt = 0;
	public double superficie = 0;



public void Disco(float radioInterior,float radioExterior) {
	
	this.setRadioInt(radioInterior);
	this.setRadioExt(radioExterior);
	this.setRadioExt(radioExterior);
	this.setRadioInt(radioInterior);
	this.setPerimetroExt(this.calculoDelPerimetroExterior(radioExterior));
	this.setPerimetroInt(this.calculoDelPerimetroInterior(radioInterior));
	this.setSuperficie(this.calculoDeLaSuperficie(radioExterior));	
}


// Calculo de Perimetros y Superficie




public double calculoDelPerimetroExterior(double radioParaPerimetroExterior) {
	
	double perimetroExterior = radioParaPerimetroExterior * 2 * Math.PI;
	return perimetroExterior;
	
}

public double calculoDelPerimetroInterior(double radioParaPerimetroInterior) {
	
	double perimetroInterior = radioParaPerimetroInterior * 2 * Math.PI;
	return perimetroInterior;
}

public double calculoDeLaSuperficie(double radioExteriorParaLaSuperficie) {
	
	double Superficie = Math.PI * radioExteriorParaLaSuperficie * radioExteriorParaLaSuperficie;
	return Superficie;


}	


//Getters and Setters

public void setSuperficie(double superficie) {
	this.superficie = superficie;
}

public void setPerimetroExt(double perimetroExt) {
	this.perimetroExt = perimetroExt;
}

public void setPerimetroInt(double perimetroInt) {
	this.perimetroInt = perimetroInt;
}

public void setRadioInt(float radioInt) {
	this.radioInt = radioInt;
}

public float getRadioInt() {
	return radioInt;
}


public float getRadioExt() {
	return radioExt;
}


public double getPerimetroExt() {
	return perimetroExt;
}


public double getPerimetroInt() {
	return perimetroInt;
}


public double getSuperficie() {
	return superficie;
}


public void setRadioExt(float radioExt) {
	this.radioExt = radioExt;
}



}