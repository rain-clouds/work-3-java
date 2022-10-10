package DAOs;

import Entities.Movie;

import java.util.List;

/**
 * Class MovieDao is a Data Access Model class and contains methods for finding and adding movies.
 */
public interface MovieDao {
     /**
      * Method returns all movies
      * @return movies
      */
     List<Movie> getAllMovies();

     /**
      * Method finds movie by it's id
      * @param id
      * @return movie
      */
     Movie getMovie(int id);

     /**
      * Method finds movie by it's title
      * @param title
      * @return movie
      */
     Movie getMovie(String title);

     /**
      * Method adds movie
      * @param movie
      */
     void addMovie(Movie movie);

     /**
      * Method deletes movie
      * @param movie
      */
     void deleteMovie(Movie movie);
}
