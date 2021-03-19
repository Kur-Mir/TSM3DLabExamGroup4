import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CaseStudy1 {
     
private String EmployeeID
private String AccountID


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

