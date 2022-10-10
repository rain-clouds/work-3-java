package DatasetManager;

import Entities.Genre;
import Entities.Movie;
import DatasetManager.Utils;
import EntityManager.GenreManager;
import EntityManager.MovieManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * Class parses data from CSV and creates Movie objects
 */
public class MovieParser {
    private final List<String[]> data;
    private final List<Movie> movies;
    private final MovieManager movieManager;
    private final GenreManager genreManager;

    /**
     * Constructor
     * @param data
     */
    public MovieParser(List<String[]> data) {
        this.data = data;
        movies = new ArrayList<>();
        movieManager = new MovieManager();
        genreManager = new GenreManager();
    }

    /**
     * Method creates Movie object from row
     * @param row
     * @return Movie
     */
    private Movie getMovie(String[] row) {
        int id = Utils.getId(row[0]);
        String title = row[1];
        String releaseDate = row[4];
        int duration = Integer.parseInt(row[6]);
        int score = (int)Double.parseDouble(row[14]);
        Movie movie = new Movie(id,title,releaseDate,duration,score);
        Genre genre = new Genre(genreManager.getLastIndex(),row[5]);
        movie.setGenre(genre);
        genreManager.addGenre(genre);
        movieManager.addMovie(movie);
        return movie;
    }

    /**
     * Method parses every row to create Movie objects
     * @return List of movie objects
     */
    public List<Movie> parse(){
        for(String[] row : data){
            movies.add(getMovie(row));
        }
        return movies;
    }

    /**
     * Method returns movieManager
     * @return movieManager
     */
    public MovieManager getMovieManager(){
        return movieManager;
    }


}
