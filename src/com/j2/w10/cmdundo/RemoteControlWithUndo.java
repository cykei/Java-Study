package com.j2.w10.cmdundo;

public class RemoteControlWithUndo{
  Command[] onCommands; //binding을 명시적으로 해줍니다. 
  Command[] offCommands;
  Command undoCommand;
  
  public RemoteControlWithUndo(){
    onCommands = new Command[7]; //button 숫자를 정해줍니다. 싫으면 ArrayList방식으로 계속 늘어날수 있게끔 해줄 수 도 있어요. 
    offCommands = new Command[7];
    
    Command noCommand=new NoCommand();
    for (int i=0; i<7; i++){
      onCommands[i]=noCommand;  // 1번. for문 가지고 실행을 할대 null 이있으면 에러가 나니깐
      offCommands[i]=noCommand;  // 2번. slot 받아오려고
    }
    undoCommand=noCommand;
  }
  public void setCommand(int slot, Command onCommand, Command offCommand){
    onCommands[slot]=onCommand;
    offCommands[slot]=offCommand;
  }
  public void onButtonWasPushed(int slot){ //inflaction 방식도 가능하지만 그건 느리다. 결론은 이렇게 슬롯을 외워서 쓰는게 좋다.
    onCommands[slot].execute();
    undoCommand=onCommands[slot];
  }
  public void undoButtonWasPushed(){ //이것도 slot을 외워서 하면 되지만 귀찮으니까 트릭을 쓴다. undoCommand를 지정해서 Command의 slot번호를 받아서 한다.
    undoCommand.undo();
  }
  public void offButtonWasPushed(int slot){
    offCommands[slot].execute();
    undoCommand=offCommands[slot];
  }
}
  


