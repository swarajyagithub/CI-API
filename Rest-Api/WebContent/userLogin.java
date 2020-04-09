package apiJava;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
@Path("/db")
public class userLogin {

		@Path("/register")
		@POST
		@Produces(MediaType.TEXT_HTML)
		public String UserRegistration(
		
			@FormParam("Name") String Name, 
			@FormParam("PhoneNumber") int PhoneNumber,
			@FormParam("Email") String email,
			@FormParam("Country")String Country,
			@FormParam("Password")String pass,
			@FormParam("ConfirmPass")String conpass)
		{
			System.out.println("Login Successfully");
			return Name;
		}
					
		
	
	

}
