import java.util.List;

public class Produto {
	private String produto;
	private String id;
	private String qtd;
	

	public Produto() {
		super();
	}

	public Produto( String qtd) {
		super();
		this.qtd = qtd;
	}
	
	public Produto(String produto, String id) {
		super();
		this.produto = produto;
		this.id = id;

	}
	
	public Produto(String produto, String id, String qtd) {
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQtd() {
		return qtd;
	}

	public void setQtd(String qtd) {
		this.qtd = qtd;
	}

}
