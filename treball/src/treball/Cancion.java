package treball;

public class Cancion {
	private String titulo;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	private String autor;

	 Cancion(String titulo ,String autor) {
	 this.titulo=titulo;
	 this.autor=autor;	
	 
	}
	 public void cancion() {
		 System.out.println("El titulo es:" +titulo+ "Y el nombre del autor es "+autor);
	 }
	 
}
