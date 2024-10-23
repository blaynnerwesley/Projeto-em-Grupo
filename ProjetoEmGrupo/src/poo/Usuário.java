package poo;

public class Usuário {
		 private String nomeDeUsuario;
		 private String nomeCompleto; 
		 private String sexo;
		 private String cpf; 
		 private String email; 
		 private String senha; 
		 private String endereço; 
		 private String telefone; 
		 private String tipoUsuario;
		 private String recuperarSenha;
		 private String idUsuario;
		 
		 
		 	public Usuário() {}
		 	
		 	
		 	
		 
		 
		 	public Usuário(String nomeDeUsuario, String nomeCompleto, String sexo, String cpf, String email, String senha, String endereço, String telefone, String tipoUsuario, String recuperarSenha, String idUsuario) {
			this.nomeDeUsuario = nomeDeUsuario;
			this.nomeCompleto = nomeCompleto;
			this.sexo = sexo;
			this.cpf = cpf;
			this.email = email;
			this.senha = senha;
			this.endereço = endereço;
			this.telefone = telefone;
			this.tipoUsuario = tipoUsuario;
			this.recuperarSenha = recuperarSenha;
			this.idUsuario = idUsuario;
		}





			public String getNomeDeUsuario() {
				return nomeDeUsuario;
			}





			public void setNomeDeUsuario(String nomeDeUsuario) {
				this.nomeDeUsuario = nomeDeUsuario;
			}





			public String getNomeCompleto() {
				return nomeCompleto;
			}





			public void setNomeCompleto(String nomeCompleto) {
				this.nomeCompleto = nomeCompleto;
			}





			public String getSexo() {
				return sexo;
			}





			public void setSexo(String sexo) {
				this.sexo = sexo;
			}





			public String getCpf() {
				return cpf;
			}





			public void setCpf(String cpf) {
				this.cpf = cpf;
			}





			public String getEmail() {
				return email;
			}





			public void setEmail(String email) {
				this.email = email;
			}





			public String getSenha() {
				return senha;
			}





			public void setSenha(String senha) {
				this.senha = senha;
			}





			public String getEndereço() {
				return endereço;
			}





			public void setEndereço(String endereço) {
				this.endereço = endereço;
			}





			public String getTelefone() {
				return telefone;
			}


			public void setTelefone(String telefone) {
				this.telefone = telefone;
			}


			public String getTipoUsuario() {
				return tipoUsuario;
			}



			public void setTipoUsuario(String tipoUsuario) {
				this.tipoUsuario = tipoUsuario;
			}



			public String getRecuperarSenha() {
				return recuperarSenha;
			}


			public void setRecuperarSenha(String recuperarSenha) {
				this.recuperarSenha = recuperarSenha;
			}



			public String getIdUsuario() {
				return idUsuario;
			}


			public void setIdUsuario(String idUsuario) {
				this.idUsuario = idUsuario;
			}
		 	
		 	
		 
     }
