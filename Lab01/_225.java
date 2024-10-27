import javax.swing.*;

public class _225 {
    public static void main(String[] args) {
        double num1 , num2 , num3, num4, num5;
        
        String strNum1 ,strNum2 ;
        
        strNum1 = JOptionPane.showInputDialog(null,
                " Please input the first number: ", " Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
        
        
        strNum2 = JOptionPane.showInputDialog(null,
                " Please input the second number: ", " Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        
        num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        
        num3 = sum;
        num4 = Math.abs(diff);
        num5 = quotient;
        
        JOptionPane.showMessageDialog(null, "Sum: " + sum + "\nDifference: " + diff + "\nProduct: " + product + "\nQuotient: " + quotient,
                "Show sum, difference, product, quotient", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);


    }
}
