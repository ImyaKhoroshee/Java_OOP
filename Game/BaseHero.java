import java.util.List;

public abstract class BaseHero implements HeroInterface { // реализуем все методы интерфейса Actions
    
    protected int attack;      // protected виден в самом классе и его наследниках                       
    protected int defence;                            
    protected int shoot;                                        
    protected int health;
    protected int crntHealth;
    protected int speed;
    protected boolean delivery;
    protected boolean magic = true;
    protected String name;
    protected String status;
    protected Vector2 damage;
    protected Vector2 position;
    
    protected List<BaseHero> getList() {return list;}

    protected List<BaseHero> list;

    public BaseHero(List<BaseHero> side){list = side;}

    @Override
    public String returnCondition() {return name + " H:" + crntHealth + " D:" + defence + " A:" + attack + " " + status;}
    
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
    public void step() {
        // TODO Auto-generated method stub
        
    }
}
