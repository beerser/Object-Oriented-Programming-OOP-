package lap_1_intro_java;

import java.awt.Dialog;
import javax.swing.*;

public class in1_1 {
    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Fahrenheit degree");
        double y = Double.parseDouble(x);
        String output ="c = "+(5.0/9.0)*(y-32.0);
        JOptionPane.showMessageDialog(null,output);
        //
    } 
}