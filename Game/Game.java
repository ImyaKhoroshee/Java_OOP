import java.util.ArrayList;
import java.util.Collections;
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
    private static final int[] l = {0};
    private static final List<BaseHero> darkSide = new ArrayList<>();
    private static final List<BaseHero> whiteSide = new ArrayList<>();
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String midl10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");

    public static void main(String[] args) {
        int step = 1;
        init();
        Scanner in = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        in.nextLine();

        while (true) {
            if (step == 1 ){
                System.out.print(AnsiColors.ANSI_RED + "First step" + AnsiColors.ANSI_RESET);
            } else {
                System.out.print(AnsiColors.ANSI_RED + "Step:" + step + AnsiColors.ANSI_RESET);
            }
            step++;

            view();
            darkSide.forEach(BaseHero::step);
            whiteSide.forEach(BaseHero::step);
            in.nextLine();
        }
    }
    private static void init() {
        int x = 1;
        int y = 1;
        darkSide.add(new Peasant(darkSide, x++, y));
        darkSide.add(new Robber(darkSide, x++, y));
        darkSide.add(new Sniper(darkSide, x++, y));
        darkSide.add(new Magician(darkSide, x++, y));
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)) {
                case 0:
                    darkSide.add(new Peasant(darkSide, x++, y));
                    break;
                case 1:
                    darkSide.add(new Robber(darkSide, x++, y));
                    break;
                case 2:
                    darkSide.add(new Sniper(darkSide, x++, y));
                    break;
                default:
                    darkSide.add(new Magician(darkSide, x++, y));
            }
        }

        x = 1;
        y = 10;
        whiteSide.add(new Peasant(whiteSide, x++, y));
        whiteSide.add(new Priest(whiteSide, x++, y));
        whiteSide.add(new Crossbowman(whiteSide, x++, y));
        whiteSide.add(new Spearsman(whiteSide, x++, y));

        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)) {
                case 0:
                    whiteSide.add(new Peasant(whiteSide, x++, y));
                    break;
                case 1:
                    whiteSide.add(new Priest(whiteSide, x++, y));
                    break;
                case 2:
                    whiteSide.add(new Crossbowman(whiteSide, x++, y));
                    break;
                default:
                    whiteSide.add(new Spearsman(whiteSide, x++, y));
            }
        }
    }
    private static void tabSetter(int cnt, int max){
        int dif = max - cnt + 2;
        if (dif>0) System.out.printf("%"+ dif +"s", ":\t"); else System.out.print(":\t");
    }
    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }
    private static String getChar(int x, int y){
        String out = "| ";
        for (int cnt = 0; cnt < darkSide.size(); cnt++) {
            if (darkSide.get(cnt).getPosition().x == x && darkSide.get(cnt).getPosition().y == y) {
                out = "|" + (AnsiColors.ANSI_BLUE + darkSide.get(cnt).getName().charAt(0) + AnsiColors.ANSI_RESET);
            } else if (whiteSide.get(cnt).getPosition().x == x && whiteSide.get(cnt).getPosition().y == y) {
                out = "|" + (AnsiColors.ANSI_GREEN + whiteSide.get(cnt).getName().charAt(0) + AnsiColors.ANSI_RESET);
            }
        }
        return out;
    }
    private static void view() {
        darkSide.forEach((v) -> l[0] = Math.max(l[0], v.returnCondition().length()));
        for (int i = 0; i < l[0]*2; i++) System.out.print("_");
        System.out.println("");
        System.out.print(top10 + "    ");
        System.out.print("Blue side");
        for (int i = 0; i < l[0]-9; i++) System.out.print(" ");
        System.out.println(":\tGreen side");
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i));
        }
        System.out.print("|    ");
        System.out.print(darkSide.get(0).returnCondition());
        tabSetter(darkSide.get(0).returnCondition().length(), l[0]);
        System.out.println(whiteSide.get(0).returnCondition());
        System.out.println(midl10);

        for (int i = 2; i < 9; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|    ");
            //System.out.print(darkSide.get(i-1).returnCondition());
            System.out.print(darkSide.get(i-1).getDistance(whiteSide).x+" "+darkSide.get(i-1).getDistance(whiteSide).y);
            tabSetter(darkSide.get(i-1).returnCondition().length(), l[0]);
            System.out.println(whiteSide.get(i-1).returnCondition());
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j));
        }
        System.out.print("|    ");
        System.out.print(darkSide.get(9).returnCondition());
        tabSetter(darkSide.get(9).returnCondition().length(), l[0]);
        System.out.println(whiteSide.get(9).returnCondition());
        System.out.println(bottom10);
    }
}