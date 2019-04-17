import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {
	List<String> carrinhoListaProdu;
	String carrinhoListaQtd;
	String pagamento;
	
	public List<Forma> getFormas(){
		List<Forma>qtdpro = new ArrayList<Forma>();
		qtdpro.add(new Forma("Cedito", 1));
		qtdpro.add(new Forma("Debito", 2));
		qtdpro.add(new Forma("Boleto", 3));
		return qtdpro;
	}
	
	public List<Produto> getQtds(){
		List<Produto>qtdpro = new ArrayList<Produto>();
		qtdpro.add(new Produto("1"));
		qtdpro.add(new Produto("2"));
		qtdpro.add(new Produto("3"));
		qtdpro.add(new Produto("4"));
		qtdpro.add(new Produto("5"));
		return qtdpro;
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
		
		System.out.println("Quantidade :" + getCarrinhoListaQtd());
		
		
		System.out.println("Forma de pagamento :" + getPagamento());
		System.out.println(" -- ");
		
	}
	
	
	
	public CarrinhoBean() {
		super();
	}

	public CarrinhoBean(List<String> carrinhoListaProdu, String carrinhoListaQtd) {
		super();
		this.carrinhoListaProdu = carrinhoListaProdu;
		this.carrinhoListaQtd = carrinhoListaQtd;
	}

	public CarrinhoBean(List<String> carrinhoListaProdu, String carrinhoListaQtd, String pagamento) {
		super();
		this.carrinhoListaProdu = carrinhoListaProdu;
		this.carrinhoListaQtd = carrinhoListaQtd;
		this.pagamento = pagamento;
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

	

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	
	

}
