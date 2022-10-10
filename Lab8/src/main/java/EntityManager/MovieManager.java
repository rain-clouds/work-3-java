package EntityManager;

import DAOs.MovieDao;
import Entities.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Class MovieManager implements the MovieDao interface
 */
public class MovieManager implements MovieDao {
    List<Movie> movies;

    /**
     * Constructor
     */
    public MovieManager() {
        movies = new ArrayList<>();
    }


    /**
     * Method returns all movies
     * @return movies
     */
    @Override
    public List<Movie> getAllMovies() {
        return movies;
    }

    /**
     * Method find movies by title
     * @param title
     * @return movie
     */
    @Override
    public Movie getMovie(String title){
        for(Movie movie : movies){
            if(title.equals(movie.getTitle())){
                return movie;
            }
        }
        return null;
    }

    /**
     * Method find movies by id
     * @param id
     * @return movie
     */
    @Override
    public Movie getMovie(int id) {
        for (Movie movie : movies) {
            if (id == movie.getId()) {
                return movie;
            }
        }
        return null;
    }

    /**
     * Method adds a movie
     * @param movie
     */
    @Override
    public void addMovie(Movie movie) {
        if (getMovie(movie.getId()) == null) {
            movies.add(movie);
        }
    }

    /**
     * Method deletes a movie
     * @param movie
     */
    @Override
    public void deleteMovie(Movie movie) {
        if(getMovie(movie.getId())!=null){
            movies.remove(movie);
        }
    }
}
