package acme.view;

import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.keycloak.KeycloakSecurityContext;

@Model
public class IndexMB {

	public String logout() throws ServletException {
		
		System.out.println("Logout!.....");
		HttpServletRequest req = (HttpServletRequest)
								FacesContext.getCurrentInstance().getExternalContext().getRequest();
		
		KeycloakSecurityContext context = (KeycloakSecurityContext) req.getAttribute(KeycloakSecurityContext.class.getName());
		System.out.println("-------- realm name: "+context.getRealm());
		req.logout();
		return null;
	}
}
