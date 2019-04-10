import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean {
	List<String> carrinhoListaProdu;
	List<String> carrinhoListaQtd;

	public void cadastrar() {
		List<Produto>lista = new ArrayList<Produto>();
		lista.add(new Produto("TV", 1, 50));
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
