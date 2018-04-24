package padrao.nullObject;

public class Teste {
	public static void main(String[] args) {
		ApresentacaoCarrinho apresentacaoCarrinho = new ApresentacaoCarrinho();
		apresentacaoCarrinho.colocarInformacoesCarrinho(new HTTPServletRequest());
	}
}
