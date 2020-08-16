import java.util.Base64;
import java.util.Date;

class Main {
  public static void main(String[] args) {
    // Create a new date object instance
    Date newDate = new Date();
    
    // Convert date to string
    String dateToString = String.valueOf(newDate);
    
    // base64 encode string
    String resetPasswordToken = Base64.getEncoder().encodeToString(dateToString.getBytes());

    // Print the token
    System.out.println("Use this token: " + resetPasswordToken);
  }
}
