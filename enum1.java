package assignment2;

 enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
  
    public boolean isWeekend() {
      return this == Day.SUNDAY || this == Day.SATURDAY;
    }
  }
  
  public class enum1 {
  
    public static void main(String[] args) {
      Day today = Day.FRIDAY;
      System.out.println("Today is: " + today);
  
      if (today.isWeekend()) {
        System.out.println("Enjoy your weekend!");
      } else {
        System.out.println("Back to work!");
      }
    }
  }
    

