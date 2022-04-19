import javax.swing.*;
import javax.xml.namespace.QName;

public class Userinput {
    public static void main(String[] args) {
//        String Name =JOptionPane.showInputDialog("Enter Your Name");
//        int Roll = Integer.parseInt(JOptionPane.showInputDialog(("Enter Your Roll")));
//        String Address = JOptionPane.showInputDialog(("Enter your Location"));
//
//        JOptionPane.showMessageDialog(null, "Name: "+Name+"\nRoll: "+Roll+"\nAddress: "+Address);
//        System.exit((0));



        double comp = Double.parseDouble(JOptionPane.showInputDialog("Enter marks For Computer"));
        double arch = Double.parseDouble(JOptionPane.showInputDialog("Enter Marks for arch"));
        double program = Double.parseDouble(JOptionPane.showInputDialog("Enter Marks for program"));
        double data = Double.parseDouble(JOptionPane.showInputDialog("Enter Marks for data"));
        double total = comp+arch+program+data;
        double percentage = total/4;
        int castper = (int) (percentage);
        JOptionPane.showMessageDialog(null, "Percentage:" +castper
         +"%");
        System.exit(0);



    }
}
