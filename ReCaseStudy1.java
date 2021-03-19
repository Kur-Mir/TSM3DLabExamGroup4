import javax.jws.WebMethod;
import javax.jws.WebService;
/* Account Example
   EmployeeID: 12345
   AccountID : 54321   */
@WebService
public class CaseStudy1 {
private String Username;
private String Password;
private String Balance;
private String Name;
private String Address;
private int Age;
private String Posistion;
private String AuthenticationTicket;     
private String EmployeeID;
private String AccountID;

@WebMethod
	public String getUsername(){
	return Username;
}
@WebMethod
	public void setUsername(String user){
	Username = user;
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
	public String getAddress(){
	return Address;
}
@WebMethod
	public void setAddress(String addr){
	Address = addr;
}
@WebMethod
	public int getAge(){
	return Age;
}
@WebMethod
	public void setAge(int a){
	Age = a;
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
@WebMethod
   public void findAccount(String EmpID,String AccID){
       if(EmpID.equals("12345") && AccID.equals("12345") || EmpID.equals("12345") || AccID.equals("12345")){

  
    
           Username = "Heero";
           Password = "password12345";
           Name = "Hosenilla, Heero M.";
           Position = "Manager";
           Balance = 50000.0;
           AuthenticationTicket = "D123AK13";
           Address = "Fiesta Communities, San Rafael";
           Age = 21;
           EmployeeID = "12345";
           AccountID = "12345";
          
       
       }else {
           Username = "";
           Password = "";
           Name = "";
           Position = "";
           Balance = 0.0;
           AuthenticationTicket = "";
           Address = "";
           Age = 0;
           EmployeeID = "";
           AccountID = "";
       }
   }

