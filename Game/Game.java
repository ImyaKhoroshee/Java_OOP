import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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

public class Game { 
    public static void main(String[] args) {
        int step = 1;
        List<BaseHero> darkSide = new ArrayList<BaseHero>();
        List<BaseHero> whiteSide = new ArrayList<BaseHero>();

        darkSide.add(new Peasant(darkSide, 0,0));
        darkSide.add(new Robber(darkSide, 0,0));
        darkSide.add(new Sniper(darkSide, 0,0));
        darkSide.add(new Magician(darkSide, 0,0));
        
        Random rnd = new Random();
        
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)){
                case 0:
                    darkSide.add(new Peasant(darkSide, 0,0));
                    break;
                case 1:
                    darkSide.add(new Robber(darkSide, 0,0));
                    break;
                case 2:
                    darkSide.add(new Sniper(darkSide, 0,0));
                    break;
                default:
                    darkSide.add(new Magician(darkSide, 0,0));
            }
        }

        whiteSide.add(new Peasant(whiteSide, 0,0));
        whiteSide.add(new Priest(whiteSide, 0,0));
        whiteSide.add(new Crossbowman(whiteSide, 0,0));
        whiteSide.add(new Spearsman(whiteSide, 0,0));

        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)){
                case 0:
                    whiteSide.add(new Peasant(whiteSide, 0,0));
                    break;
                case 1:
                    whiteSide.add(new Priest(whiteSide, 0,0));
                    break;
                case 2:
                    whiteSide.add(new Crossbowman(whiteSide, 0,0));
                    break;
                default:
                    whiteSide.add(new Spearsman(whiteSide, 0,0));
            }
        }

        if (step == 1 ){
            System.out.println("First step");
        } else {
            System.out.println("Step:" + Integer.toString(step));
        }
        System.out.println("--------------------------------------------");
        System.out.println("Dark side\t\t\t\t\t\tWhite side");
        for (int i = 0; i < darkSide.size(); i++) {
            if (darkSide.get(i).returnCondition().length() > 27) {
                System.out.println(darkSide.get(i).returnCondition() + "\t:\t" + whiteSide.get(i).returnCondition());
            } else {
                System.out.println(darkSide.get(i).returnCondition() + "\t\t:\t\t" + whiteSide.get(i).returnCondition());
            }
        }

        Scanner in = new Scanner(System.in);
        while (true) {
            String txt = in.nextLine();
            if (txt.equals("next")){
                for (int i = 0; i < darkSide.size(); i++) {
                    darkSide.get(i).step();
                    whiteSide.get(i).step();
                    if (darkSide.get(i).returnCondition().length() > 27) {
                        System.out.println(darkSide.get(i).returnCondition() + "\t:\t" + whiteSide.get(i).returnCondition());
                    } else {
                        System.out.println(darkSide.get(i).returnCondition() + "\t\t:\t" + whiteSide.get(i).returnCondition());
                    }
                }
            }
            if (txt.equals("quit")) {break;}
        }

    }

}
