package Egor.example.commandIn;

public class RemoveHead extends Commands implements Command {
    @Override
    public String execution(String arg){
        return man.removeHeadManager();
    }

}
