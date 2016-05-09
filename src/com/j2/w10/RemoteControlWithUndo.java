package com.j2.w10;

public class RemoteControlWithUndo{
  CommandUndo[] onCommands; //binding�� ��������� ���ݴϴ�. 
  CommandUndo[] offCommands;
  CommandUndo undoCommand;
  public RemoteControlWithUndo(){
    onCommands = new CommandUndo[7]; //button ���ڸ� �����ݴϴ�. ������ ArrayList������� ��� �þ�� �ְԲ� ���� �� �� �־��. 
    offCommands = new CommandUndo[7];
    CommandUndo noCommand=new NoCommand();
    for (int i=0; i<7; i++){
      onCommands[i]=noCommand;  // 1��. for�� ������ ������ �Ҵ� null �������� ������ ���ϱ�
      offCommands[i]=noCommand;  // 2��. slot �޾ƿ�����
    }
    undoCommand=noCommand;
  }
  public void setCommand(int slot, CommandUndo onCommand, CommandUndo offCommand){
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
}


