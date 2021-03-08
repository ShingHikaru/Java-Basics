package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here.";
    }
}

class Jaws extends Movie {
    public Jaws() {
    super("Jaws");
    }
    public String plot() {
        return "A shark eats lots of people.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("independence day");
    }
    @Override
    public String plot() {
        return "Alien attempt to take over planet earth."
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }
    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie{
    public StarWars(String name) {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces...";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
}
public class Main {

    public static void main(String[] args) {
    }
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        }
    }

}
