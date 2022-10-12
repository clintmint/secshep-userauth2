import java.util.Base64;
import java.util.Date;

class Main {
  public static void main(String[] args) {
    Date dateObj = new Date();
    String dateStr = String.valueOf(dateObj);
    String passwordResetToken = Base64.getEncoder().encodeToString(dateStr.getBytes());
    System.out.println("Use this token: " + passwordResetToken);
  }
}
