import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {
	private List<String> carrinhoListaProdu;
	private String carrinhoListaQtd;
	private String pagamento;

	public List<Forma> getFormasPagamentos(){
		List<Forma> formas = new ArrayList<Forma>();
		formas.add(new Forma("credito",1));
		formas.add(new Forma("debito",2));
		formas.add(new Forma("Boleto",3));
		return formas;
	}
	
	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	
	public List<Produto> getProdutos() {
		List<Produto>produto = new ArrayList<Produto>();
		produto.add(new Produto("TV", "1"));
		produto.add(new Produto("Cama", "2"));
		produto.add(new Produto("Fone", "3"));
	
		return produto;

	}
	
	
	public void cadastrarCarrinho() {
		for (String string : carrinhoListaProdu) {
			System.out.println(string);
			
		}	
		System.out.println(getCarrinhoListaQtd());
		
	}
	
	public CarrinhoBean() {
		super();
	}

	public List<String> getCarrinhoListaProdu() {
		return carrinhoListaProdu;
	}

	public void setCarrinhoListaProdu(List<String> carrinhoListaProdu) {
		this.carrinhoListaProdu = carrinhoListaProdu;
	}

	public String getCarrinhoListaQtd() {
		return carrinhoListaQtd;
	}

	public void setCarrinhoListaQtd(String carrinhoListaQtd) {
		this.carrinhoListaQtd = carrinhoListaQtd;
	}

	public CarrinhoBean(List<String> carrinhoListaProdu, String carrinhoListaQtd, String pagamento) {
		super();
		this.carrinhoListaProdu = carrinhoListaProdu;
		this.carrinhoListaQtd = carrinhoListaQtd;
		this.pagamento = pagamento;
	}

}