package Egor.example.commandIn;

public class Head extends Commands implements Command{
    @Override
    public String execution(String arg){
        return man.headManager();
    }
}
