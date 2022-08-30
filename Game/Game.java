import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 *                  Крестьянин       Разбойник       Снайпер     Колдун     Копейщик	Арбалетчик	    Монах
        Атака            1                8            12          17          4	        6	        12
        Защита           1                3            10          12          5	        3	        7
        Выстрелы         0                0            32          0           0	        16	        0
        Урон             1                2-4          8-10        -5          1-3	        2-3	        -4
        Здоровье         1                10           15          30          10          10          30
        Скорость         3                6            9           9           4           4           5
        Доставка         1                0            0           0           0           0           0
        Магия            0                0            0           1           0           0           1
        Имя
Написать программу с семью классами, описывающими данных в таблице персонажей. Для каждого создать по два конструктора							
и геттеры приватных полей. А также метод возвращающий строку с  кратким описанием персонажа. В основной программе создать списки с							
пятью экземплярами каждого персонажа и вывести информацию обо все в консоль.							

 */

public class Game extends BaseHero {            // Game это наследник BaseHero
    public static void main(String[] args) {
        List<Peasant> peasant = new ArrayList<>();
        while (peasant.size() < 5) {
            peasant.add(new Peasant());                             // создали 5 новых крестьян с возможностями как указано в классе в основном конструкторе
        }
        ListIterator<Peasant> listIter = peasant.listIterator();
        while(listIter.hasNext()) {
            System.out.println(listIter.next().getName());
        }

        List<Magician> magician = new ArrayList<>();
        while (magician.size() < 5) {
            magician.add(new Magician());
        }
        ListIterator<Magician> iter = magician.listIterator();
        while(iter.hasNext()) {
            System.out.println(iter.next().getName());
        }

        List<Robber> robber = new ArrayList<>();
        while (robber.size() < 5) {
            robber.add(new Robber());
        }
        ListIterator<Robber> itr = robber.listIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().getName());
        }

        List<Sniper> sniper = new ArrayList<>();
        while (sniper.size() < 5) {
            sniper.add(new Sniper());
        }
        ListIterator<Sniper> i = sniper.listIterator();
        while(i.hasNext()) {
            System.out.println(i.next().getName());
        }
        List<Spearsman> spearsman = new ArrayList<>();
        while (spearsman.size() < 5) {
            spearsman.add(new Spearsman());
        }
        ListIterator<Spearsman> element = spearsman.listIterator();
        while(element.hasNext()) {
            System.out.println(element.next().getName());
        }
        List<Priest> priest = new ArrayList<>();
        while (priest.size() < 5) {
            priest.add(new Priest());
        }
        ListIterator<Priest> elmnt = priest.listIterator();
        while(elmnt.hasNext()) {
            System.out.println(elmnt.next().getName());
        }
        List<Crossbowman> crossbowman = new ArrayList<>();
        while (crossbowman.size() < 5) {
            crossbowman.add(new Crossbowman());
        }
        ListIterator<Crossbowman> el = crossbowman.listIterator();
        while(el.hasNext()) {
            System.out.println(el.next().getName());
        }
       
        System.out.println(peasant.get(0).justInfo() + "\n");
        System.out.println(crossbowman.get(0).justInfo()+ "\n");
        System.out.println(magician.get(0).justInfo()+ "\n");
        System.out.println(priest.get(0).justInfo()+ "\n");
        System.out.println(robber.get(0).justInfo()+ "\n");
        System.out.println(sniper.get(0).justInfo()+ "\n");
        System.out.println(spearsman.get(0).justInfo());   
    }

    @Override
    public float hit() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float getHit(float damage) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean status() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean changePosition() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String returnCondition() {
        // TODO Auto-generated method stub
        return null;
    }
}