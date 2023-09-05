package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);

	
	private int codigo;

	private Tipo(int code) {
		this.codigo = code;
	}
	
	public int getCreditos() {
		return codigo;
	}
	
	public void setCreditos(int code) {
		this.codigo = code;
	}
	
}