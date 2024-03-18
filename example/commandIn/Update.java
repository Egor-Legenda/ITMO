package Egor.example.commandIn;

public class Update extends Commands implements Command{
    @Override
    public String execution(String arg){
        return  man.updateManager(arg);
    }
}
