
import javax.swing.JOptionPane;

public class _226 {

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 4) {
            choice = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Select an option:\n1. First-degree equation\n2. System of first-degree equations\n3. Second-degree equation with one variable\n4. Exit",
                    "Menu", JOptionPane.INFORMATION_MESSAGE));

            switch (choice) {
                case 1:
                    solveFirstDegreeEquation();
                    break;
                case 2:
                    solveSystemOfFirstDegreeEquations();
                    break;
                case 3:
                    solveSecondDegreeEquation();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Exiting the program...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void solveFirstDegreeEquation() {
        double a, b, x;
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of a: ", "Input", JOptionPane.INFORMATION_MESSAGE));
        
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid input. 'a' must be different from 0.");
            return;
        }
        
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of b: ", "Input", JOptionPane.INFORMATION_MESSAGE));

            x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution to the equation is x = " + x);
        }

    public static void solveSystemOfFirstDegreeEquations() {
        double a11, a12, b1, a21, a22, b2;
        double determinant, determinantX, determinantY;

        a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a11:"));
        a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a12:"));
        b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b1:"));
        a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a21:"));
        a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a22:"));
        b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b2:"));

        determinant = a11 * a22 - a21 * a12;
        determinantX = b1 * a22 - b2 * a12;
        determinantY = a11 * b2 - a21 * b1;

        if (determinant == 0) {
            if (determinantX == 0 && determinantY == 0) {
                JOptionPane.showMessageDialog(null, "The system of equations has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system of equations has no solution.");
            }
        } else {
            double xSolution = determinantX / determinant;
            double ySolution = determinantY / determinant;
            JOptionPane.showMessageDialog(null, "The solution to the system of equations is x = " + xSolution + ", y = " + ySolution);
        }
    }

    public static void solveSecondDegreeEquation() {
        double a, b, c;
        double discriminant, root1, root2;

        a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a:"));
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid input. 'a' must be different from 0.");
            return;
        }
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of c:"));
        
        
        discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            JOptionPane.showMessageDialog(null, "The roots of the equation are x1 = " + root1 + ", x2 = " + root2);
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "The equation has a single root x = " + root1);
        } else {
            JOptionPane.showMessageDialog(null, "The equation has no real roots.");
        }
    }
}
