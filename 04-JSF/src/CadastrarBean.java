import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class CadastrarBean {
	String nome;
	String cpf;
	int idade;

	public void cadastrar() {
		
	}

	public void validaDado(FacesContext context, UIComponent component, Object value)
			throws ValidatorException{
			String valor = value.toString();
			if (!valor.contains("@") || valor.contains("#") || valor.contains("'")) { //* qualquer validação lógica
			throw new ValidatorException(new FacesMessage("Não pode haver caracter especiais !"));
			}
			}
	
	
	public CadastrarBean(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public CadastrarBean(String nome) {
		super();
		this.nome = nome;
	}



	public CadastrarBean() {
		super();
	}
	
	
	
}
