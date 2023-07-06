package design_pattern.abstract_factory_method;

public class ArenaFactory {
    public Arena createArena(String level){
        switch (level){
            case "easy": return new ArenaEasy();
            case "medium": return new ArenaMedium();
            default: return new ArenaHard();
        }
    }
}
