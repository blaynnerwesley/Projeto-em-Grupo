package poo;

public class Pedidos extends Produto{ 
	private int quantidade; 
	private String dataPedido; 
	private String dataEntrega;
	private String statusPedido;
	private String codigoRastreio; 
	public String enderecoEntrega; 
	private Double valorTotal; 
	private Double desconto; 
	private Double frete;
	
	public Pedidos() {}
	
	
	
	public Pedidos(int quantidade, String dataPedido, String dataEntrega, String statusPedido, String codigoRastreio, String enderecoEntrega, Double valorTotal, Double desconto, Double frete) {
		this.quantidade= quantidade; 
		this.dataPedido= dataPedido; 
		this.dataEntrega= dataEntrega; 
		this.statusPedido= statusPedido; 
		this.codigoRastreio= codigoRastreio; 
		this.enderecoEntrega= enderecoEntrega;
		this.valorTotal= valorTotal; 
		this.desconto= desconto; 
		this.frete= frete;
	}
	
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public String getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	
	public String getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	
	public String getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
	
	
	public String getCodigoRastreio() {
		return codigoRastreio;
	}
	public void setCodigoRastreio(String codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}
	
	
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	
	public Double getFrete() {
		return frete;
		
	}
	public void setFrete(Double frete) {
		this.frete = frete;
	} 
	
	
	
	
	
	

}
