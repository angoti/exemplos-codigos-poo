package padrao.nullObject;

public class ApresentacaoCarrinho {
	public void colocarInformacoesCarrinho(HTTPServletRequest request) {
		Carrinho c = CookieFactory.criarCarrinho(request);
		if (c != null) {
			System.out.println("Carrinho encontrado");
			request.setAttribute("valor", c.getValor());
			request.setAttribute("qtd", c.getTamanho());
		} else {
			System.out.println("Carrinho NÃO encontrado");
			request.setAttribute("valor", 0.0);
			request.setAttribute("qtd", 0);
		}
	}
}
