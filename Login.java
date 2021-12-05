import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  

public class Login extends JFrame implements ActionListener {

	JButton b1,reset;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    JTextField textField1,textField2;     
     
   Login()  
{                    
        userLabel = new JLabel();  
        userLabel.setText("Username");
        userLabel.setBounds(50,150,100,30);
                 
        textField1 = new JTextField(15);
        textField1.setBounds(150,150,150,30);
           
        passLabel = new JLabel();  
        passLabel.setText("Password");  
        userLabel.setBounds(100,220,100,30);
                   
        textField2 = new JPasswordField(15);
        textField2.setBounds(150, 220, 150, 30);
                  
        b1 = new JButton("SUBMIT");
        b1.setBounds(50,300,100,30);
        
        reset = new JButton ("RESET");
        reset.setBounds(200, 300, 100, 30);
        
        newPanel = new JPanel(); 
        newPanel.add(userLabel);    
        newPanel.add(textField1);     
        newPanel.add(passLabel);     
        newPanel.add(textField2);  
        newPanel.add(b1);
        newPanel.add(reset);
           
        add(newPanel);        
         
        b1.addActionListener(this);     
        setTitle(" LOGIN ");    
        
        reset.addActionListener(this);
        setTitle(" RESET ");
}  
        
    public void actionPerformed(ActionEvent ae)      
    {  
        String userValue = textField1.getText();          
        String passValue = textField2.getText();       
              
        if (ae.getSource() == b1)
        { if (userValue.equals("tester") && passValue.equals("1234")) {         
            HomePage page = new HomePage();  
            page.setVisible(true);        
            JLabel wel_label = new JLabel("Welcome: "+userValue);  
            page.getContentPane().add(wel_label);  
        }  
        else{  
        	JOptionPane.showMessageDialog(null,"Please enter valid username and password");  
        } }
       
        if (ae.getSource() == reset) {
            textField1.setText("");
            textField2.setText("");
        }
    }  
}  
