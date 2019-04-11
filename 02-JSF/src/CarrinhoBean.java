import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {
	List<String> carrinhoListaProdu;
	List<String> carrinhoListaQtd;

	
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
		
		for (String strin : carrinhoListaQtd) {
			System.out.println(strin);
		}
		
	}
	
	
	
	public CarrinhoBean() {
		super();
	}

	public CarrinhoBean(List<String> carrinhoListaProdu, List<String> carrinhoListaQtd) {
		super();
		this.carrinhoListaProdu = carrinhoListaProdu;
		this.carrinhoListaQtd = carrinhoListaQtd;
	}

	public List<String> getCarrinhoListaProdu() {
		return carrinhoListaProdu;
	}

	public void setCarrinhoListaProdu(List<String> carrinhoListaProdu) {
		this.carrinhoListaProdu = carrinhoListaProdu;
	}

	public List<String> getCarrinhoListaQtd() {
		return carrinhoListaQtd;
	}

	public void setCarrinhoListaQtd(List<String> carrinhoListaQtd) {
		this.carrinhoListaQtd = carrinhoListaQtd;
	}

}
