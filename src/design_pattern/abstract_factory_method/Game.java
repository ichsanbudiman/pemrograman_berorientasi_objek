package design_pattern.abstract_factory_method;

public class Game {
    private Arena arena;
    private Level level;
    private Enemy enemy;
   
    public Game(GameFactory gf){
        this.arena=gf.arena;
        this.level=gf.level;
        this.enemy=gf.enemy;
    }

    public void star(){
        arena.start();
        level.start();
        enemy.start();;
    }
    
}
