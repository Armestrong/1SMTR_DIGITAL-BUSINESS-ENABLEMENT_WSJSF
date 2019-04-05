import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroBean {
	private List<String> listaSelecionados;
	private List<String> listaSelecionados2;

	public List<Usuario> getUsuarios() {
		List<Usuario> usuararios = new ArrayList<Usuario>();
		usuararios.add(new Usuario("ListaTeste1",1));
		usuararios.add(new Usuario("ListaTeste2",2));
		
		return usuararios;
	}

	
	
	public CadastroBean(List<String> listaSelecionados) {
		super();
		this.listaSelecionados = listaSelecionados;
	}




	public void setListaSelecionados(List<String> listaSelecionados) {
		this.listaSelecionados = listaSelecionados;
	}



	public CadastroBean() {
		super();
	}

	
	public void cadastrar() {
		for (String string : listaSelecionados2) {
			System.out.println(string);
			System.out.println("--");
		}

		for (String u : listaSelecionados) {

			System.out.println(u);
			System.out.println("----");
		}
	
	
	}
	

	public List<String> getListaSelecionados2() {
		return listaSelecionados2;
	}



	public void setListaSelecionados2(List<String> listaSelecionados2) {
		this.listaSelecionados2 = listaSelecionados2;
	}



	public List<String> getListaSelecionados() {
		return listaSelecionados;
	}
	
	

	
	
}
