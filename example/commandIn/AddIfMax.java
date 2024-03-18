package Egor.example.commandIn;

public class AddIfMax extends Commands implements Command{
    @Override
    public String execution(String arg){

        return man.addIfMaxManager();
    }

}
