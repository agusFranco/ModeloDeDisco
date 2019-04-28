package discoTest;

import org.junit.Assert;
import org.junit.Test;

import disco.Disco;

public class DiscoTests {

	@Test(expected = IllegalArgumentException.class)
	public void noSeCreaUnDiscoPorRadiosCero() {
		double radioInt = 0;
		double radioExt = 0;

		Disco disco = new Disco(radioInt, radioExt);
	}

	@Test(expected = IllegalArgumentException.class)
	public void noSeCreaUnDiscoPorRadiosIntMayorARadioExt() {
		double radioInt = 2;
		double radioExt = 1;

		Disco disco = new Disco(radioInt, radioExt);
	}

	@Test
	public void seCreaUnDisco() {
		double radioInt = 2;
		double radioExt = 3;

		Disco disco = new Disco(radioInt, radioExt);
		Assert.assertTrue(disco != null);
	}

	@Test
	public void seCreaUnDiscoConRadioIntDosYRadioExtTres() {
		double radioInt = 2;
		double radioExt = 3;

		Disco disco = new Disco(radioInt, radioExt);
		Assert.assertTrue(disco.getRadioInt() == radioInt);
		Assert.assertTrue(disco.getRadioExt() == radioExt);
	}

	@Test
	public void seActualizaElRadioInterior() {
		double radioInt = 2;
		double radioExt = 3;
		double radioIntEsperado = 4;

		Disco disco = new Disco(radioInt, radioExt);
		disco.setRadioInt(radioIntEsperado);

		Assert.assertTrue(disco.getRadioInt() == radioIntEsperado);
	}

	@Test
	public void seActualizaElRadioExterior() {
		double radioInt = 2;
		double radioExt = 3;
		double radioExtEsperado = 4;

		Disco disco = new Disco(radioInt, radioExt);
		disco.setRadioExt(radioExtEsperado);

		Assert.assertTrue(disco.getRadioExt() == radioExtEsperado);
	}

	@Test
	public void seObtieneElPerimetroInterior() {
		double radioInt = 2;
		double radioExt = 3;
		double perimetroEsperado = 12.57;

		Disco disco = new Disco(radioInt, radioExt);

		double perimetroObtenido = disco.getPerimetroInt();

		Assert.assertTrue(perimetroObtenido == perimetroEsperado);
	}

	@Test
	public void seObtieneElPerimetroExterior() {
		double radioInt = 2;
		double radioExt = 3;
		double perimetroEsperado = 18.85;

		Disco disco = new Disco(radioInt, radioExt);

		double perimetroObtenido = disco.getPerimetroExt();

		Assert.assertTrue(perimetroObtenido == perimetroEsperado);
	}

	@Test
	public void seObtieneLaSuperficie() {
		double radioInt = 2;
		double radioExt = 3;
		double superficieEsperada = 15.7;

		Disco disco = new Disco(radioInt, radioExt);

		double superficieObtenida = disco.getSuperficie();

		Assert.assertTrue(superficieObtenida == superficieEsperada);
	}

	@Test
	public void alAcualizarRadioIntCambiaElPerimetroInt() {
		double radioInt = 2d;
		double radioExt = 3d;
		double radioIntNuevo = 4d;
		double perimetroInicialEsperado = 12.57d;
		double perimetroFinalEsperado = 25.13d;

		Disco disco = new Disco(radioInt, radioExt);

		double perimetroInicialObtenido = disco.getPerimetroInt();

		Assert.assertTrue(perimetroInicialObtenido == perimetroInicialEsperado);

		disco.setRadioInt(radioIntNuevo);

		double perimetroFinalObtenido = disco.getPerimetroInt();

		Assert.assertTrue(perimetroFinalObtenido == perimetroFinalEsperado);
	}

	@Test
	public void alAcualizarRadioExtCambiaElPerimetroExt() {
		double radioInt = 2d;
		double radioExt = 3d;
		double radioExtNuevo = 5d;
		double perimetroInicialEsperado = 18.85d;
		double perimetroFinalEsperado = 31.42d;

		Disco disco = new Disco(radioInt, radioExt);

		double perimetroInicialObtenido = disco.getPerimetroExt();

		Assert.assertTrue(perimetroInicialObtenido == perimetroInicialEsperado);

		disco.setRadioExt(radioExtNuevo);

		double perimetroFinalObtenido = disco.getPerimetroExt();

		Assert.assertTrue(perimetroFinalObtenido == perimetroFinalEsperado);
	}

	@Test
	public void alActualizarRadioIntCambiaLaSuperficie() {
		double radioInt = 2d;
		double radioExt = 6d;
		double radioIntNuevo = 4d;
		double superficieInicialEsperada = 100.53d;
		double superficieFinalEsperada = 62.83d;

		Disco disco = new Disco(radioInt, radioExt);

		double superficieInicialObtenida = disco.getSuperficie();

		Assert.assertTrue(superficieInicialObtenida == superficieInicialEsperada);

		disco.setRadioInt(radioIntNuevo);

		double superficieFinalObtenida = disco.getSuperficie();

		Assert.assertTrue(superficieFinalObtenida == superficieFinalEsperada);
	}

	@Test
	public void alActualizarRadioExtCambiaLaSuperficie() {
		double radioInt = 2d;
		double radioExt = 6d;
		double radioExtNuevo = 8d;
		double superficieInicialEsperada = 100.53d;
		double superficieFinalEsperada = 188.49d;

		Disco disco = new Disco(radioInt, radioExt);

		double superficieInicialObtenida = disco.getSuperficie();

		Assert.assertTrue(superficieInicialObtenida == superficieInicialEsperada);

		disco.setRadioExt(radioExtNuevo);

		double superficieFinalObtenida = disco.getSuperficie();

		Assert.assertTrue(superficieFinalObtenida == superficieFinalEsperada);
	}
}
