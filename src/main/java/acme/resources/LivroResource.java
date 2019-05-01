package acme.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import acme.model.Livro;

@Stateless
@Path("livros")
public class LivroResource {

	@GET
	@Path("/all")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response findAll() {

		List<Livro> livros = null;
		try {
			System.out.println("============ Look");
			livros = Livro.getLivros();		
			return Response.ok(livros).build();
		} 
		catch (NoResultException ex) {
			return Response.status(404).entity(ex.getMessage()).type(MediaType.TEXT_PLAIN).build();
		}		
	}
}
