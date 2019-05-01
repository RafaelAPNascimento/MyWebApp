package acme.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Livro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Basic
	@NotNull
	private Long id;

	private String nome;

	private int numeroPaginas;

	private double preco;

	private Date publicacao;
	
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(Long id, String nome, int numeroPaginas, double preco, Date publicacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.numeroPaginas = numeroPaginas;
		this.preco = preco;
		this.publicacao = publicacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Date publicacao) {
		this.publicacao = publicacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public static List<Livro> getLivros() {
		
		return Arrays.asList(new Livro(1L, "Effective Java", 400, 12.5, new Date()),
				new Livro(2L, "Spring Receipes", 1200, 22.5, new Date()),
				new Livro(3L, "Java How to Program", 900, 19.99, new Date()),
				new Livro(4L, "JavaEE  7", 650, 15.5, new Date()),
				new Livro(5L, "Pró Spring 5", 950, 25.99, new Date()));
	}

}
