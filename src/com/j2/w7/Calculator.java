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

 //화면에 나올 문자열(숫자 스트링) 처리
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
 
 //연산된 결과값을 화면에 보여줌 long,double,integer등의 각기 다른 결과값을 받아서 처리하는 루틴
 //1.0 => 1로 출력하는 루틴 포함
 //overloading 로 구현
 public void textFieldView(){
   beforeTmp = String.valueOf(resultNum);
   viewNum = beforeTmp;
   c.jtextField.setText(viewNum);
 }
 //=연산자의 연속처리 
 public void textFieldView(long rNum){
   viewNum = String.valueOf(resultNum);
   c.jtextField.setText(viewNum);
   beforeTmp = viewNum; 
 } 
 
 /* 사칙연산 부호를 입력했을경우 연산하기전 변수들 초기화 루틴
  * 
  * 연산자를 누루고 아무것도 안누른 상테에서 또 연산자 누른경우
  * 처음 연사자를 누른 경우나 엔터를 치고 숫자넣고  처음 연산자 누른경우
  * 연산자를 누르고 엔터 안치고 숫자만 너코 또 연산자 는경우 3가지로 구분
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

 //실제로 사칙연산이 이루어 지는 루틴
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
 // = 를 눌렀을경우 실행루틴
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
 //모든 변수의 초기화
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
 
 //소수점 이 나왔을경우 Double 타입으로 바꾸어주는 루틴 
 public void pointType(){

 }

 public static void main(String[] args) {
  new CalcGUI("Calculator");
 }
}

