/**
 * Интерфейс
 */

public interface HeroInterface {  // интерфейс - договоренности о том, как будет проходить игра. Тут указываются название методов и что они они возвращают
    
    void step();                     // - сигнатура всех методов
    boolean status();
    boolean changePosition();  // выбираем changePosition если персонаж ближнего боя. 
    String returnCondition();
}
