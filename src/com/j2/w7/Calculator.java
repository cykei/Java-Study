package Calculator;

import java.awt.event.*;

public class Calculator implements ActionListener{
 CalcGUI c;
 String viewNum,beforeTmp,afterTmp;
 long resultNum;
 char op;
 boolean newInput = true;
 boolean enter   = true;
 boolean existNum = false;
 boolean againOp  = false;

 
 public Calculator(CalcGUI c){
  this.c = c;
 }
 
 public void actionPerformed(ActionEvent e){
  Object obj = e.getSource();
  if(obj == c.jbtn_Back){
   c.jtextField.setText("Back");
   c.jbtn_Back.setBorder(c.bLower);
  }
  if(obj == c.jbtn_CE){
   buttonCE();
  }
  if(obj == c.jbtn_C){
   buttonCE();
  }
  if(obj == c.jbtn_7){
   stringPlus("7");
  }
  if(obj == c.jbtn_8){
   stringPlus("8");
  }
  if(obj == c.jbtn_9){
   stringPlus("9");
  }
  if(obj == c.jbtn_4){
   stringPlus("4");
  }
  if(obj == c.jbtn_5){
   stringPlus("5");
  }
  if(obj == c.jbtn_6){
   stringPlus("6");
  }
  if(obj == c.jbtn_1){
   stringPlus("1");
  }
  if(obj == c.jbtn_2){
   stringPlus("2");
  }
  if(obj == c.jbtn_3){
   stringPlus("3");
  }
  if(obj == c.jbtn_0){
   if(existNum)
    stringPlus("0");
  }
  if(obj == c.jbtn_Div){
   c.jtextField.setText("Div");
  }

  if(obj == c.jbtn_Astric){
   c.jtextField.setText("Astric");
  }

  if(obj == c.jbtn_Minus){
   if(existNum){
    setOperation('-');
   }

  }

  if(obj == c.jbtn_PlusMinus){
   c.jtextField.setText("PlusMinus");
  }
  if(obj == c.jbtn_Dot){
   c.jtextField.setText("Dot");
  }
  if(obj == c.jbtn_Plus){
   if(existNum){
    setOperation('+');
   }
  }
  if(obj == c.jbtn_Enter){
    enterProcess();
    newInput = true;
  }
 }

 //ȭ�鿡 ���� ���ڿ�(���� ��Ʈ��) ó��
 public void stringPlus(String btn){
  if(newInput || viewNum=="0"){
   viewNum = btn;
   newInput = false;
   existNum = true;
  }else{
   viewNum = viewNum + btn;
  }
  againOp = false;
  c.jtextField.setText(viewNum);
  
 }
 
 //����� ������� ȭ�鿡 ������ long,double,integer���� ���� �ٸ� ������� �޾Ƽ� ó���ϴ� ��ƾ
 //1.0 => 1�� ����ϴ� ��ƾ ����
 //overloading �� ����
 public void textFieldView(){
   beforeTmp = String.valueOf(resultNum);
   viewNum = beforeTmp;
   c.jtextField.setText(viewNum);
 }
 //=�������� ����ó�� 
 public void textFieldView(long rNum){
   viewNum = String.valueOf(resultNum);
   c.jtextField.setText(viewNum);
   beforeTmp = viewNum; 
 } 
 
 /* ��Ģ���� ��ȣ�� �Է�������� �����ϱ��� ������ �ʱ�ȭ ��ƾ
  * 
  * �����ڸ� ����� �ƹ��͵� �ȴ��� ���׿��� �� ������ �������
  * ó�� �����ڸ� ���� ��쳪 ���͸� ġ�� ���ڳְ�  ó�� ������ �������
  * �����ڸ� ������ ���� ��ġ�� ���ڸ� ���� �� ������ �°�� 3������ ����
  * True:existNum 
  */ 
 public void setOperation(char opTmp){
  if(againOp){
   op = opTmp;
  }
  else if(enter){
   beforeTmp = viewNum;
   op = opTmp;
   newInput = true;
   againOp = true; 
   enter=false;
  }  
  else{

   basicOperation();
   textFieldView();
   newInput = true;
   againOp = true;
  }
 }

 //������ ��Ģ������ �̷�� ���� ��ƾ
 public void basicOperation(){

  switch(op){
   case '+':
    if(newInput==false || enter==false)
     afterTmp = viewNum;
    
    resultNum = Long.parseLong(beforeTmp) + Long.parseLong(afterTmp);
    break;
   case '-':
    if(newInput==false || enter==false)
     afterTmp = viewNum;
    
    resultNum = Long.parseLong(beforeTmp) - Long.parseLong(afterTmp);

    break;
   case '*':
    System.out.println("~~~~");
    break;
   case '/':
    System.out.println("~~~~");
    break;
  }
 }
 // = �� ��������� �����ƾ
 public void enterProcess(){
  if(newInput && enter){
   basicOperation();
   textFieldView(resultNum);
   newInput = true;
   againOp = true;

  }else{
   basicOperation();
   textFieldView();
   againOp = false;
   enter = true;  
  }
 }
 //��� ������ �ʱ�ȭ
 public void buttonCE(){
  viewNum="";
  beforeTmp="";
  afterTmp="";
  resultNum=0;
  op=' ';
  newInput = true;
  enter   = true;
  existNum = false;
  againOp  = false;
  textFieldView();
 }
 
 //�Ҽ��� �� ��������� Double Ÿ������ �ٲپ��ִ� ��ƾ 
 public void pointType(){

 }

 public static void main(String[] args) {
  new CalcGUI("Calculator");
 }
}

