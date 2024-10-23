package poo;

public class Pagamento extends Produto{  
	private String idPagamento; 
	private String moeda;
	private String dataPagamento;
	private String metodoPagamento; 
	private String statusPagamento;
	private String descricaoPagamento;
	
	
	public Pagamento() {}
	
	
	
	public Pagamento (String idPagamento, Double valor, String moeda, String dataPagamento, String metodoPagamento, String statusPagamento, String descricaoPagamento) {
		this.idPagamento= idPagamento; 
		this.moeda= moeda; 
		this.dataPagamento= dataPagamento; 
		this.metodoPagamento= metodoPagamento;
		this.statusPagamento= statusPagamento; 
		this.descricaoPagamento= descricaoPagamento;
		
	}



	public String getIdPagamento() {
		return idPagamento;
	}



	public void setIdPagamento(String idPagamento) {
		this.idPagamento = idPagamento;
	}


	public String getMoeda() {
		return moeda;
	}



	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}



	public String getDataPagamento() {
		return dataPagamento;
	}



	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}



	public String getMetodoPagamento() {
		return metodoPagamento;
	}



	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}



	public String getStatusPagamento() {
		return statusPagamento;
	}



	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}



	public String getDescricaoPagamento() {
		return descricaoPagamento;
	}



	public void setDescricaoPagamento(String descricaoPagamento) {
		this.descricaoPagamento = descricaoPagamento;
	}
	
	
	

}
