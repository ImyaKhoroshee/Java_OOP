 public abstract class BaseHero implements Actions { // реализуем все методы интерфейса Actions
    
    private int attack;      // protected виден в самом классе и его наследниках                       
    private int defence;                            
    private int shoot;                              
    private int damageLow;
    private int damageHigh;           
    private int health;
    private int speed;
    private boolean delivery;
    private boolean magic = true;
    private String name;

    public BaseHero() {}    // конструктор без параметров должен быть обязательно
    
    public String getName() {return String.format(name);}
    public void setName(String name) {this.name = name;}
    
    public int getAttack() {return attack;}
    public void setAttack(int attack) {this.attack = attack;}

    public int getDefence() {return defence;}
    public void setDefence(int defence) {this.defence = defence;}

    public int getShoot() {return shoot;}
    public void setShoot(int shoot) {this.shoot = shoot;}

    public int getDamageLow() {return damageLow;}
    public int getDamageHigh() {return damageHigh;}
    public void setDamage(int damageLow, int damageHigh) {
        this.damageLow = damageLow;
        this.damageHigh = damageHigh;
    }

    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}

    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}

    public boolean getDelivery() {return delivery;}
    public void setDelivery(boolean delivery) {this.delivery = delivery;}

    public boolean getMagic() {return magic;}
    public void setMagic(boolean magic) {this.magic = magic;}

    public String justInfo(){
        return String.format(this.getClass() + "\nName: " + getName() + "\nAttack: " + getAttack() + "\nDefence: " + getDefence() + 
                            "\nShoot: " + getShoot() + "\nHealth: " + getHealth() + "\nDamageLow: " + getDamageLow() +
                            "\nDamageHigh: " + getDamageHigh() + "\nSpeed: " + getSpeed() + "\nDelivery: " + getDelivery() +
                            "\nMagic: " + getMagic());
    }
}
