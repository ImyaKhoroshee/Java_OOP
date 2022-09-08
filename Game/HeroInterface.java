/**
 * Интерфейс
 */

public interface HeroInterface {  // интерфейс - договоренности о том, как будет проходить игра. Тут указываются название методов и что они они возвращают
    
    boolean status();
    void step();
    String returnCondition();
    String getName();
    Vector2 getPosition();
}
