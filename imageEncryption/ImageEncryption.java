import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
import java.awt.FlowLayout;
import javax.swing.text.AttributeSet.FontAttribute;
import javax.xml.crypto.Data;

import java.awt.Font;

public class ImageEncryption {

  public static void Operate(int key){
    JFileChooser fileChooser=new JFileChooser();
    fileChooser.showOpenDialog(null);
    File file=fileChooser.getSelectedFiles();
    // file input stream reader 
    try
    {

        FileInputStream fis=new FileInputStream(file);

        byte []data=new byte[fis.available()];
        fis.read(data);
        int i=0;
        for(byte b:data)
        {
            System.out.println(b);
            data[i]=(byte)(b^key);
            i++;
        }

        FileOutputStream fos=new FileOutputStream(file);
        fos.write(data);
        fos.close();
        fis.close();
        JOptionPane.showMessageDialog(null, "Done");

    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
  public static void main(String[] args) throws IOException {
    System.out.println("this is testing"); 
    JFrame f = new JFrame();
    f.setTitle("image Opreation");
    f.setSize(300, 400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //fornt selection
    Font font = new Font("Helvetica", Font.BOLD, 18);
    // creating botton
    JButton button=new JButton();
    button.setText("Select Image");
    button.setFont(font);
    // creating text filed 
    JTextField textField=new JTextField(10);
    textField.setFont(font);
    //creating action listener
    button.addActionListener(e->{
      System.out.println("button clicked");
      String text=textField.getText();
      int temp=Integer.parseInt(text);
      Operate(temp);
    });

    f.setLayout(new FlowLayout());

    f.add(button);
    f.add(textField);
    f.setVisible(true);
  }

}
