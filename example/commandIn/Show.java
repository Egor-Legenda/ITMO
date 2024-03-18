package Egor.example.commandIn;

public class Show extends Commands implements Command{
    @Override
    public String execution(String arg){
        return  man.showManager();
    }
}
