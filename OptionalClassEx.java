package Optionalclass;
import java.util.Optional;
public class OptionalClassEx {
	   public static void main(String[] args) {  
	      String var=null;  
	        Optional<String> checkNull = Optional.ofNullable(var);  
	        if(checkNull.isPresent()){    
	            var="Hallo world";
	            System.out.print(var);  
	        }else  
	            System.out.println("string value is not present");  
	    }  
	}  

