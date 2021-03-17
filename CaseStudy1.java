
Import javax.jws.WebMethod;
Import javax.jws.WebService;

@WebService
public class CaseStudy1{ 

//Topic is about Account Management(Admin Side)
	private String Name;
 	private double Balance;
	private int AuthenticationTicket;
 	private String Position;


@WebMethod
   	public String getName(){
       	return Name;
   }
@WebMethod
   	public void setName(String n){
       	Name = n;
   }

@WebMethod
 	public double getBalance(){
      	return Balance;
   }
@WebMethod
  	public void setBalance(double bal){
      	Balance = balance;
   }

@WebMethod
	public String getPosition(){
	return Position;
}
@WebMethod
	public void setPostion(String pos){
	Position = pos;
}
@WebMethod
	Public int getAuthenticationTicket(){
	Return AuthenticationTicket;
}
@WebMethod
	Public void setAuthenticationTicket(int Auth){
	AuthenticationTicket = Auth;
}
}
