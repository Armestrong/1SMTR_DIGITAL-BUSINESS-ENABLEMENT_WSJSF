
public class Forma {
	private String nome;
	private int codigo;
	public String getForma() {
		return nome;
	}
	public void setForma(String forma) {
		this.nome = forma;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Forma(String forma, int codigo) {
		super();
		this.nome = forma;
		this.codigo = codigo;
	}
	public Forma() {
		super();
	}
	
}
