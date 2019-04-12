import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {
	private String login;
	private String senha;
	private  boolean termo;


	public void setTermo(boolean termo) {
		this.termo = termo;
	}


	public String logar() {
		if("mod".equals(getLogin()) && "1234".equals(getSenha())) {
			System.out.println("Usuario logado : " + getLogin());
			System.out.println("Checkbox Conectado : " + termo);
			return "carrinho";
		}else {
			System.out.println("Usuario nao autorizado");
			System.out.println("Checkbox Conectado : " + termo);
			return "login";
		}
			
	}

	
	public LoginBean(String login, String senha, boolean termo) {
		super();
		this.login = login;
		this.senha = senha;
		this.termo = termo;
	}
	
	public LoginBean(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}


	public boolean isTermo() {
		return termo;
	}
	
	public LoginBean() {
		super();
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
	

}
