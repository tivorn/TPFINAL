public class Main {

	public static void main(String[] args) {

		Livro livro = new Livro();
		Acervo acervo = new Acervo();
		
		String[] titulos = {
			"Reviravolta",
			"Sandman",
			"Data Smart"
		};
		
		String[] autores = {
			"Jared Diamond",
			"Neil Gaiman",
			"Foreman"
		};
		
		String[] categorias = {
			"História",
			"Quadrinho",
			"Análise de dados"
		};
		
		for (int i = 0; i < titulos.length; i++) {
			livro.cadastrarLivro(titulos[i], autores[i], i, categorias[i]);
			
			acervo.cadastrarLivroNoAcervo(livro.consultarTitulo(), livro.consultarAutor(), livro.consultarIdentificador(), livro.consultarCategoria());
			
		}
		
		acervo.consultarLivroDoAcervo(1);
	}
}