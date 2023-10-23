import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;
public class Main {
    public static void main(String[] args) {
        /*
        Battle b = new Battle();
        Pokemon p1 =new Pokemon ("Чужой",1);
        Pokemon p2 =new Pokemon ("Хищник",1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
         */
        Sigilyph Sigilyph =new Sigilyph("",4);
        Pineco  Pineco =new Pineco("",6);
        Porygon Porygon =new Porygon("",6);
        Forretress Forretress= new Forretress("",10);
        Porygon2 Porygon2=new Porygon2("",8);
        PorygonZ PorygonZ=new PorygonZ("",10);
        System.out.println(Pineco);
        Battle Battle =new Battle();
        Battle.addFoe(Sigilyph);
        Battle.addAlly(PorygonZ);
        Battle.addFoe(Pineco);
        Battle.addAlly(Porygon2);
        Battle.addFoe(Forretress);
        Battle.addAlly(Porygon);
        Battle.go();

        /*
        Battle b = new Battle();
        Pokemon p1 =new Pignite ("Pignite",2);

        Pokemon p2 =new Pokemon ("Roselia",6);
        Pokemon p3 =new Pokemon ("Skiploom",3);
        Pokemon p4 =new Pokemon ("Kabuto",4);
        Pokemon p5 =new Pokemon ("Sandslash",2);
        Pokemon p6 =new Pokemon ("Kabutops",5);
        */

    }
    public static boolean chance(double d){
        return d> Math.random();
    }


}