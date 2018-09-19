package command;

public class RemoteControl {
    CommandInterface[] onCommands;
    CommandInterface[] offCommands;

    public RemoteControl() {
        this.onCommands = new CommandInterface[7];
        this.offCommands = new CommandInterface[7];

        CommandInterface noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWassPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n--------- Remote Control ------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() +
            "     " + offCommands[i].getClass().getName() + "\n");
        }

        return stringBuff.toString();
    }
}
