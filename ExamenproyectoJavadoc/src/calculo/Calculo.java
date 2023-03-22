package calculo;

public class Calculo {

    private final int numero1;
    
    private int numero2;

    public Calculo() {
		super();
		this.numero1 = 0;
	}
	public Calculo(int numero1) {
		super();
		this.numero1 = numero1;
	}

	
	public Calculo(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getNumero2() {
		return numero2;
	}

	public int getNumero1() {
		return numero1;
	}
	
	public int sumaNumeros() {
		return numero1 + numero2;
	}

	public int restaNumeros() {
		return numero1 - numero2;
	}
	
	
	public int divideNumeros() throws Exception {
		if(numero2 == 0) {
			throw new Exception("No se puede dividir por 0");
		}
		return numero1 / numero2;
	}
	
	public void muestraTablaMultiplicar() {
		for(int i = 0; i<=10; i++) {
			int resultado = numero1 * i;
			System.out.println(String.format("%1$d x %2$d = %3$d ",numero1, i, resultado));
		}
	}


}
