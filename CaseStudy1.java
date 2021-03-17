
Import javax.jws.WebMethod;
Import javax.jws.WebService;

@WebService
public class CaseStudy1{ 

//Topic is about Account Management(Admin Side)
	private String Username;
 	private String Password;
	private String Name;
 	private double Balance;
	private int AuthenticationTicket;
 	private String Position;
	private String Address;
  	private String Age;
	private String EmployeeID;
	private String AccountID;


@WebMethod
   	public String getUsername(){
    	return Username;
   }
@WebMethod
   	public void setUsername(String user){
     	Username=user;
   }
@WebMethod
   	public String getPassword(){
      	return Password;
   }
@WebMethod
   	public void setPassword(String pass){
       	Password = pass;
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
	public int getAuthenticationTicket(){
	Return AuthenticationTicket;
}
@WebMethod
	public void setAuthenticationTicket(int Auth){
	AuthenticationTicket = Auth;
	}
}
@WebMethod
	public String getAddress(){
	return Address;
   }
@WebMethod
	public void setAddress(String add){
	Address = add;
   }
@WebMethod
	public String getAge(){
	return Age;
   }
@WebMethod
	public void setAge(String ag){
	Age = ag;
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
