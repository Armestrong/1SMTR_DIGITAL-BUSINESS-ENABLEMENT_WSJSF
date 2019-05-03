import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginBean {
	private String login;
	private String senha;
	private boolean termo;

	public boolean isTermo() {
		return termo;
	}

	public void setTermo(boolean termo) {
		this.termo = termo;
	}

	public String logar() {
		if ("roger".equals(getLogin()) && "123".equals(getSenha())) {
			System.out.println("Usuario logado: " + getLogin());
			System.out.println(isTermo());
			return "carrinho";
		}else
			System.out.println("Usuario com senha incorreta");
			FacesMessage mensagem = new FacesMessage("Login Invalido");
			FacesContext.getCurrentInstance().addMessage( null , mensagem);
			return "login";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	public LoginBean(String login, String senha, boolean termo) {
		super();
		this.login = login;
		this.senha = senha;
		this.termo = termo;
	}

	public LoginBean() {
		super();
	}
	
}