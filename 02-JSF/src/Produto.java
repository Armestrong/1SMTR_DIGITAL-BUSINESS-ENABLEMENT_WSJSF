
public class Produto {
	private String produto;
	private int id;
	private int qtd;

	public Produto() {
		super();
	}

	public Produto(String produto, int id, int qtd) {
		super();
		this.produto = produto;
		this.id = id;
		this.qtd = qtd;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

}
