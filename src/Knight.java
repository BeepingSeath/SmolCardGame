 public class Knight extends Card{
    private int id;
    public Knight(int mana, int attack, int health, double dodge, int id) {
        super(mana,attack,health,dodge);
        setMana(5);
        setAttack(3);
        setHealth(7);
        setDodge(0.2);
        this.id = id;
        id = 0;
    }

     public int getId() {
         return id;
     }
     public void PlayAgainst() {

     }
 }
