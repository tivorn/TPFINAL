public class Livro {
	public String titulo;
	public String autor;
	public String categoria;
	public int titulo_id;
	public boolean disponibilidade;

	
	public void cadastrarLivro(String titulo, String autor, int titulo_id, String categoria) {		
		this.titulo = titulo;
		this.titulo_id = titulo_id;
		this.autor = autor;
		this.categoria = categoria;
		this.disponibilidade = true;
	}
	
	public void removerLivro(int titulo_id) {
		if (titulo_id == this.titulo_id) {
			this.disponibilidade = false;
		} else {
			System.out.println("Este livro não consta no nosso acervo!");
		}
	}
	
	public String consultarAutor() {
		return autor;
	}
	
	public String consultarTitulo() {
		return titulo;
	}
	
	public String consultarCategoria() {
		return categoria;
	}
	
	public int consultarIdentificador() {
		return titulo_id;
	}
	

}