package design_pattern.abstract_factory_method;

public class GameFactory {
     Arena arena;
     Level level;
     Enemy enemy;

    public GameFactory createGameEasy(){
         this.arena = new ArenaEasy();
         this.level =  new LevelEasy();
         this.enemy = new EnemyEasy();
         return this;
    }
        public GameFactory createGameMedium(){
         this.arena = new ArenaMedium();
         this.level =  new LevelMedium();
         this.enemy = new EnemyMedium();
         return this;
    }
        public GameFactory createGameHard(){
         this.arena = new ArenaHard();
         this.level =  new LevelHard();
         this.enemy = new EnemyHard();
         return this;
    }
}
