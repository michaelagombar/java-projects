public class NegativeNumberException extends Exception{
   String errorMsg ;
   public NegativeNumberException(String s){
       this.errorMsg = s;
   }
public String toString(){
return (errorMsg ) ;
}  
}