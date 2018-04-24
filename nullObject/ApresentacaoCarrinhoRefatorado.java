package padrao.nullObject;

public class ApresentacaoCarrinhoRefatorado {
	public void colocarInformacoesCarrinho(HTTPServletRequest request) {
		Carrinho c = CookieFactory.criarCarrinho(request);

		request.setAttribute("valor", c.getValor());
		request.setAttribute("qtd", c.getTamanho());

	}
}
