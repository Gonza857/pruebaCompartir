package ar.edu.unlam.dominio;

public class Cerradura {

	private int codigo;
	private boolean estaAbierta = false;

	public Cerradura(int nuevaClave) { // 1234
		
		// this.codigo = 1234;
		this.codigo = nuevaClave; 
		System.out.println("Configurada correctamente");
	}

	public String abrirCerradura(int codigo) {
		if (this.codigo == codigo) {
			this.estaAbierta = true;
			return "Cerradura Abierta";
		} else {
			return "Codigo incorrecto";
		}
	}

	public String estadoCerradura() {
		if (this.estaAbierta) {
			return "Esta abiera";
		} else {
			return "Esta cerrada";
		}
	}

	public void cerrarCerradura() {
		this.estaAbierta = false;
	}
	
	public int saberCOdigo () {
		return this.codigo;
	}
	
	public void sumarUno () {
		this.codigo += 1;
	}

}
