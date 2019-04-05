package acme.view;

import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Model
public class IndexMB {

	public String logout() throws ServletException {
		
		System.out.println("Logout!.....");
		HttpServletRequest req = (HttpServletRequest)
								FacesContext.getCurrentInstance().getExternalContext().getRequest();
		req.logout();
		return null;
	}
}
