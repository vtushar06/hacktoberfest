import java.util.Calendar;
public class CalanderOctober
{
        public static void printOctoberCalendar(int year)
        {
            // Create a calendar instance
            Calendar calendar = Calendar.getInstance();

            // Set the month to October (months are 0-based, so 9 represents October)
            calendar.set(Calendar.MONTH, Calendar.OCTOBER);
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.DAY_OF_MONTH, 1);  // Start from the 1st day of October

            // Get the first day of the week (Sunday = 1, Monday = 2, etc.)
            int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            // Get the number of days in October
            int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

            // Print the header of the calendar
            System.out.println("October " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Print leading spaces for the first week
            for (int i = 1; i < firstDayOfWeek; i++)
            {
                System.out.print("    ");  // Four spaces for each empty slot before the 1st day
            }

            // Print the calendar
            for (int day = 1; day <= daysInMonth; day++)
            {
                System.out.printf("%3d ", day);  // Print the day with 3 spaces padding

                // Move to the next line after Saturday (7th day of the week)
                if ((day + firstDayOfWeek - 1) % 7 == 0)
                {
                    System.out.println();
                }
            }
            System.out.println();  // Ensure the last line is printed properly
        }

        public static void main(String[] args)
        {
            int year = 2024;  // You can change the year
            printOctoberCalendar(year);
        }
    }
/*
October 2024
Sun Mon Tue Wed Thu Fri Sat
       1   2   3   4   5
  6   7   8   9  10  11  12
 13  14  15  16  17  18  19
 20  21  22  23  24  25  26
 27  28  29  30  31
 */
