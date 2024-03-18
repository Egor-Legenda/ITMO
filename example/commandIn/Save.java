package Egor.example.commandIn;

public class Save extends Commands implements Command{
    @Override
    public String execution(String arg){
        return man.saveManager();
    }
}
