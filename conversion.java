package assignment2;
import java.text.SimpleDateFormat;
import java.util.Date;


public class conversion {
    
  public static void main(String[] args) {
    
    Date date = new Date();

    // Use SimpleDateFormat to format the date
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    String formattedDate = formatter.format(date);

    
    System.out.println("Date in yyyy-MM-dd format: " + formattedDate);
}
}
