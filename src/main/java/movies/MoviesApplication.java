package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] myArray = MoviesArray.findAll();


        String userChoice2 = "y";

        while (userChoice2.equals("y")) {
            Scanner input = new Scanner(System.in);
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a movie too the list of movies");
            System.out.println();
            System.out.print("What would you like to do?: ");
            int userChoice = input.nextInt();
            System.out.println();
            mainMenu(myArray, userChoice);
            System.out.print("Would you like to choose another option (y/n): ");
            userChoice2 = input.next();
            input.nextLine();
            System.out.println();
        }
        System.out.println("goodbye...");


    }

    public static void iterateMovies(Movie[] myArray) {
        for (Movie movie : myArray) {
            System.out.println(movie.getName() + " (" + movie.getCategory() + ")");
        }
    }



    public static void iterateMoviesByCategory(Movie[] myArray, String category) {
        for (Movie movie : myArray) {
            if (movie.getCategory().equals(category)) {
                System.out.println(movie.getName());
            }
        }
    }

    public static void mainMenu (Movie[] myArray, int userChoice) {
        Scanner input = new Scanner(System.in);
        if (userChoice == 0) {
            System.out.println("are you sure?");
        } else if (userChoice == 1) {
            iterateMovies(myArray);
            System.out.println();
        } else if (userChoice == 2) {
            iterateMoviesByCategory(myArray, "animated");
            System.out.println();
        } else if (userChoice == 3) {
            iterateMoviesByCategory(myArray, "drama");
            System.out.println();
        } else if (userChoice == 4) {
            iterateMoviesByCategory(myArray, "horror");
            System.out.println();
        } else if (userChoice == 5) {
            iterateMoviesByCategory(myArray, "scifi");
            System.out.println();
        } else if (userChoice == 6) {
            System.out.print("What movie would you like to add: ");
            String newMovie = input.next();
            input.nextLine();
            System.out.print("What is the category of that movie?: ");
            String newMovieCategory = input.next();
            System.out.println();
        }
    }
//
//
//    public static Movie[] addMovie(Movie[] movies, String newMovie, String newMovieCategory) {
//        Movie[] newMovies = Arrays.copyOf(Movie, movies.length + 1);
//        newMovies[newMovies.length - 1] = newMovie;
//        return newMovies;
//    }

}
