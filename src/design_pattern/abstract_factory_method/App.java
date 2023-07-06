package design_pattern.abstract_factory_method;

public class App {
    Game easy = new Game(new GameFactory().createGameEasy());
    Game medium = new Game(new GameFactory().createGameMedium());
}
