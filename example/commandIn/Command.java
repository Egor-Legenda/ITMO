package Egor.example.commandIn;

import Egor.example.base.CollectionManager;
import Egor.example.base.CommandControl;

public interface Command {
    CollectionManager man =new CollectionManager(); //Создан для работы с командами
    CommandControl control =new CommandControl();
    String execution(String arg);
}
