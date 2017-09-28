public class NonDigitNumberException extends Exception{
   String errorMsg ;
   public NonDigitNumberException(String s){
       this.errorMsg = s;
   }
public String toString(){
return (errorMsg ) ;
}  
}


