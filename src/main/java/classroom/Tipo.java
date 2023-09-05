package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	// numero de creditos por materia
	
	private int creditos;

	private Tipo(int credits) {
		this.creditos = credits;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int credits) {
		this.creditos = credits;
	}
	
}