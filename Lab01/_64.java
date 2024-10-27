import java.util.Scanner;

public class _64 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int year, month, days;

        do {
            year = getYear(keyboard);
            month = getMonth(keyboard);
            
            if (isValidInput(year, month)) {
                days = getDaysInMonth(year, month);
                System.out.println("Number of days: " + days);
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);

        keyboard.close();
    }

    private static int getYear(Scanner scanner) {
        System.out.print("Enter year: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid year. Please enter a non-negative number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static int getMonth(Scanner scanner) {
        System.out.print("Enter month: ");
        String input = scanner.next();
        
        switch (input) {
            case "January": case "Jan": case "Jan.": case "1": return 1;
            case "February": case "Feb": case "Feb.": case "2": return 2;
            case "March": case "Mar": case "Mar.": case "3": return 3;
            case "April": case "Apr": case "Apr.": case "4": return 4;
            case "May": case "5": return 5;
            case "June": case "Jun": case "Jun.": case "6": return 6;
            case "July": case "Jul": case "Jul.": case "7": return 7;
            case "August": case "Aug": case "Aug.": case "8": return 8;
            case "September": case "Sep": case "Sep.": case "9": return 9;
            case "October": case "Oct": case "Oct.": case "10": return 10;
            case "November": case "Nov": case "Nov.": case "11": return 11;
            case "December": case "Dec": case "Dec.": case "12": return 12;
            default: return -1; 
        }
    }
    

    private static boolean isValidInput(int year, int month) {
        return year >= 0 && month >= 1 && month <= 12;
    }

    private static int getDaysInMonth(int year, int month) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (isLeapYear(year)) ? 29 : 28;
            default:
                return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}