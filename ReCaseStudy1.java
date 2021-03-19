import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CaseStudy1 {
private String Balance;
private String Name;
private String Posistion;
private String AuthenticationTicket;     
private String EmployeeID;
private String AccountID;

@WebMethod
	public double getBalance(){
	return Balance;
}
@WebMethod
	public void setBalance(double bal){
	Balance = bal;
}
@WebMethod
	public String getName(){
	return Name;
}
@WebMethod
	public void setName(String n){
	Name = n;
}
@WebMethod
	public String getPosition(){
	return Position;
}
WebMethod
	public void setPosition(String pos){
	Position = pos;
}
@WebMethod
	public String getAuthenticationTicket(){
	return AuthenticationTicket;
}
@WebMethod
	public void setAuthenticationTicket(String auth){
	AuthenticationTicket = auth
}
@WebMethod
   	public String getEmployeeID(){
  	return EmployeeID;
}
@WebMethod
	public void setEmployeeID(String empid){
	EmployeeID = empid;
}
@WebMethod
	public String getAccountID(){
	return AccountID;
}
@WebMethod
	public void setAccountID(String accid){
	AccountID = accid;
   }
}

