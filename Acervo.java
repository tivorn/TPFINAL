public class Acervo {
	public String[] titulos = new String[3];
	public String[] autores = new String[3];
	public String[] categorias = new String[3];
	
	public void cadastrarLivroNoAcervo(String titulo, String autor, int titulo_id, String categoria) {
		this.titulos[titulo_id] = titulo;
		this.autores[titulo_id] = autor;
		this.categorias[titulo_id] = categoria;
	}
	
	public void consultarLivroDoAcervo(int titulo_id) {
		System.out.println("Encontramos o livro que você está procurando:");
		System.out.println("Título: " + titulos[titulo_id]);
		System.out.println("Autor: " + autores[titulo_id]);
		System.out.println("Categoria: " + categorias[titulo_id]);
	}
}