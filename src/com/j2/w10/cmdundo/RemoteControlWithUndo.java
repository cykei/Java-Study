package com.j2.w10.cmdundo;

public class RemoteControlWithUndo{
  Command[] onCommands; //binding�� ��������� ���ݴϴ�. 
  Command[] offCommands;
  Command undoCommand;
  
  public RemoteControlWithUndo(){
    onCommands = new Command[7]; //button ���ڸ� �����ݴϴ�. ������ ArrayList������� ��� �þ�� �ְԲ� ���� �� �� �־��. 
    offCommands = new Command[7];
    
    Command noCommand=new NoCommand();
    for (int i=0; i<7; i++){
      onCommands[i]=noCommand;  // 1��. for�� ������ ������ �Ҵ� null �������� ������ ���ϱ�
      offCommands[i]=noCommand;  // 2��. slot �޾ƿ�����
    }
    undoCommand=noCommand;
  }
  public void setCommand(int slot, Command onCommand, Command offCommand){
    onCommands[slot]=onCommand;
    offCommands[slot]=offCommand;
  }
  public void onButtonWasPushed(int slot){ //inflaction ��ĵ� ���������� �װ� ������. ����� �̷��� ������ �ܿ��� ���°� ����.
    onCommands[slot].execute();
    undoCommand=onCommands[slot];
  }
  public void undoButtonWasPushed(){ //�̰͵� slot�� �ܿ��� �ϸ� ������ �������ϱ� Ʈ���� ����. undoCommand�� �����ؼ� Command�� slot��ȣ�� �޾Ƽ� �Ѵ�.
    undoCommand.undo();
  }
  public void offButtonWasPushed(int slot){
    offCommands[slot].execute();
    undoCommand=offCommands[slot];
  }
}
  


