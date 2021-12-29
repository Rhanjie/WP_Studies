package Lab1.Zad1_C;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory - Marcin Dyla\n");

        MazeGame mazeGame = new MazeGame();

        MazeFactory mazeFactory = new MazeFactory();
        MazeFactory darkMazeFactory = new DarkMazeFactory();
        MazeFactory magicMazeFactory = new MagicMazeFactory();

        var maze = mazeGame.CreateMaze(mazeFactory);
        var darkMaze = mazeGame.CreateMaze(darkMazeFactory);
        var magicMaze = mazeGame.CreateMaze(magicMazeFactory);

        maze.print();
        darkMaze.print();
        magicMaze.print();
    }
}
