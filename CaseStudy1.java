
Import javax.jws.WebMethod;
Import javax.jws.WebService;

@WebService
public class CaseStudy1{ 

//Topic is about Account Management(Admin Side)

	Private int AuthenticationTicket;

@WebMethod
	Public int getAuthenticationTicket(){
	Return AuthenticationTicket;
}
@WebMethod
	Public void setAuthenticationTicket(int Auth){
	AuthenticationTicket = Auth;
}
}
