package padrao.nullObject;

public class CookieFactory {

	public static Carrinho criarCarrinho(HTTPServletRequest request) {
		// aqui vai a l�gica para recuperar um carrinho previamente criado
		// pelo usu�rio a partir dos cookies armazenados em seu navegador.
		if (achouCarrinho())
			return new Carrinho();
		// por�m se o carrinho n�o estiver guardado no browser, retorna objeto nulo
		else
			return null;
			//return new CarrinhoNulo();
	}

	private static boolean achouCarrinho() {
		// TODO Auto-generated method stub
		double x = Math.random();
		System.out.println(x);
		return x>0.5?true:false;
	}

}
