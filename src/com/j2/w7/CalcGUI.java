package Calculator;



import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


public class CalcGUI extends JFrame{
Container contentPane;
JPanel jp_textField,jp_buttonAll,jp_rightButton;
JPanel jp_ceButton,jp_numButton;
JButton jbtn_1, jbtn_2, jbtn_3,jbtn_4,jbtn_5,jbtn_6,jbtn_7,jbtn_8,jbtn_9,jbtn_0,
  jbtn_Back,jbtn_CE,jbtn_C,jbtn_PlusMinus,
  jbtn_Dot,jbtn_Div,jbtn_Astric,jbtn_Minus,jbtn_Plus,jbtn_Sqrt,jbtn_Per,
  jbtn_1DivX,jbtn_Enter,jbtn_Space;
Border bRaise = BorderFactory.createBevelBorder(BevelBorder.RAISED);
Border bLower = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
JTextField  jtextField;

Calculator event = new Calculator(this);

public CalcGUI(String title){
 super(title);
 viewGUI();
 buttonEvent();
}
public void viewGUI(){
 setDefaultCloseOperation(DISPOSE_ON_CLOSE);
 contentPane = getContentPane();

 viewTextField();
 makeButtonAllPanel();
 makeRightButtonPanel();  
 viewCeButton();
 viewNumButton();  

 contentPane.add(jp_textField, BorderLayout.NORTH);
 contentPane.add(jp_buttonAll,BorderLayout.CENTER);
 jp_buttonAll.add(jp_rightButton,BorderLayout.CENTER);
 jp_rightButton.add(jp_ceButton,BorderLayout.NORTH);
 jp_rightButton.add(jp_numButton,BorderLayout.CENTER);

 //pack(); 
 setBounds(200,200,302,235);
 setResizable(false);
 setVisible(true);
}
public void viewTextField(){
 jp_textField = new JPanel();
 jtextField = new JTextField("0",26);
 jtextField.setBorder(bLower);
 jtextField.setHorizontalAlignment(JTextField.RIGHT);
 jtextField.setEnabled(false);
 jtextField.setDisabledTextColor(Color.black);
 jp_textField.add(jtextField);
}
public void makeButtonAllPanel(){
 jp_buttonAll = new JPanel();
 jp_buttonAll.setLayout(new BorderLayout(10,1));  
}

public void makeRightButtonPanel(){
 jp_rightButton = new JPanel();
 jp_rightButton.setLayout(new BorderLayout(1,10));  
}
public void viewCeButton(){
 jp_ceButton = new JPanel();
 jp_ceButton.setLayout(new GridLayout(1,3,5,5));
 jp_ceButton.setPreferredSize(new Dimension(0,28));
 jbtn_Back = new JButton("Backspace");
 jbtn_CE = new JButton("CE");
 jbtn_C = new JButton("C");

 jbtn_Back.setBorder(bRaise);
 jbtn_CE.setBorder(bRaise);
 jbtn_C.setBorder(bRaise);

 jbtn_Back.setForeground(Color.RED);
 jbtn_CE.setForeground(Color.RED);  
 jbtn_C.setForeground(Color.RED);

 jp_ceButton.add(jbtn_Back);
 jp_ceButton.add(jbtn_CE);
 jp_ceButton.add(jbtn_C);
}
public void viewNumButton(){
 jp_numButton = new JPanel();
 jp_numButton.setLayout(new GridLayout(4,5,5,5));
 jbtn_7 = new JButton("7");
 jbtn_8 = new JButton("8");
 jbtn_9 = new JButton("9");
 jbtn_Div = new JButton("/");
 jbtn_Sqrt = new JButton("sqrt");
 jbtn_4 = new JButton("4");
 jbtn_5 = new JButton("5");
 jbtn_6 = new JButton("6");
 jbtn_Astric = new JButton("*");
 jbtn_Per = new JButton("%");
 jbtn_1 = new JButton("1");
 jbtn_2 = new JButton("2");
 jbtn_3 = new JButton("3");
 jbtn_Minus = new JButton("-");
 jbtn_1DivX = new JButton("1/x");
 jbtn_0 = new JButton("0");
 jbtn_PlusMinus = new JButton("+/-");
 jbtn_Dot = new JButton(".");
 jbtn_Plus = new JButton("+");
 jbtn_Enter = new JButton("=");

 jbtn_7.setForeground(Color.BLUE);
 jbtn_8.setForeground(Color.BLUE);
 jbtn_9.setForeground(Color.BLUE);
 jbtn_Div.setForeground(Color.RED);
 jbtn_Sqrt.setForeground(Color.BLUE);
 jbtn_4.setForeground(Color.BLUE);
 jbtn_5.setForeground(Color.BLUE);
 jbtn_6.setForeground(Color.BLUE);
 jbtn_Astric.setForeground(Color.RED);
 jbtn_Per.setForeground(Color.BLUE);
 jbtn_1.setForeground(Color.BLUE);
 jbtn_2.setForeground(Color.BLUE);
 jbtn_3.setForeground(Color.BLUE);
 jbtn_Minus.setForeground(Color.RED);
 jbtn_1DivX.setForeground(Color.BLUE);
 jbtn_0.setForeground(Color.BLUE);
 jbtn_PlusMinus.setForeground(Color.BLUE);
 jbtn_Dot.setForeground(Color.BLUE);
 jbtn_Plus.setForeground(Color.RED);
 jbtn_Enter.setForeground(Color.RED);

 jbtn_7.setBorder(bRaise);
 jbtn_8.setBorder(bRaise);
 jbtn_9.setBorder(bRaise);
 jbtn_Div.setBorder(bRaise);
 jbtn_Sqrt.setBorder(bRaise);
 jbtn_4.setBorder(bRaise);
 jbtn_5.setBorder(bRaise);
 jbtn_6.setBorder(bRaise);
 jbtn_Astric.setBorder(bRaise);
 jbtn_Per.setBorder(bRaise);
 jbtn_1.setBorder(bRaise);
 jbtn_2.setBorder(bRaise);
 jbtn_3.setBorder(bRaise);
 jbtn_Minus.setBorder(bRaise);
 jbtn_1DivX.setBorder(bRaise);
 jbtn_0.setBorder(bRaise);
 jbtn_PlusMinus.setBorder(bRaise);
 jbtn_Dot.setBorder(bRaise);
 jbtn_Plus.setBorder(bRaise);
 jbtn_Enter.setBorder(bRaise);
 
 jp_numButton.add(jbtn_7);
 jp_numButton.add(jbtn_8);
 jp_numButton.add(jbtn_9);
 jp_numButton.add(jbtn_Div);
 jp_numButton.add(jbtn_Sqrt);
 jp_numButton.add(jbtn_4);
 jp_numButton.add(jbtn_5);
 jp_numButton.add(jbtn_6);
 jp_numButton.add(jbtn_Astric);
 jp_numButton.add(jbtn_Per);
 jp_numButton.add(jbtn_1);
 jp_numButton.add(jbtn_2);
 jp_numButton.add(jbtn_3);
 jp_numButton.add(jbtn_Minus);
 jp_numButton.add(jbtn_1DivX);
 jp_numButton.add(jbtn_0);
 jp_numButton.add(jbtn_PlusMinus);
 jp_numButton.add(jbtn_Dot);
 jp_numButton.add(jbtn_Plus);
 jp_numButton.add(jbtn_Enter);
}
public void buttonEvent(){
 jbtn_Back.addActionListener(event);
 jbtn_CE.addActionListener(event);
 jbtn_C.addActionListener(event);
 jbtn_7.addActionListener(event);
 jbtn_8.addActionListener(event);
 jbtn_9.addActionListener(event);
 jbtn_Div.addActionListener(event);
 jbtn_Sqrt.addActionListener(event);
 jbtn_4.addActionListener(event);
 jbtn_5.addActionListener(event);
 jbtn_6.addActionListener(event);
 jbtn_Astric.addActionListener(event);
 jbtn_Per.addActionListener(event);
 jbtn_1.addActionListener(event);
 jbtn_2.addActionListener(event);
 jbtn_3.addActionListener(event);
 jbtn_Minus.addActionListener(event);
 jbtn_1DivX.addActionListener(event);
 jbtn_0.addActionListener(event);
 jbtn_PlusMinus.addActionListener(event);
 jbtn_Dot.addActionListener(event);
 jbtn_Plus.addActionListener(event);
 jbtn_Enter.addActionListener(event);
}
}
