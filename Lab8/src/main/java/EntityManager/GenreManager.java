package EntityManager;

import DAOs.GenreDao;
import Entities.Genre;

import java.util.ArrayList;
import java.util.List;

/**
 * Class GenreManager implements GenreDao interface
 */
public class GenreManager implements GenreDao {
    List<Genre> genres;
    int lastIndex = 1;

    /**
     * Constructor
     */
    public GenreManager() {
        genres = new ArrayList<>();
    }

    /**
     * Method returns all genres
     * @return genres
     */
    @Override
    public List<Genre> getAllGenres() {
        return genres;
    }

    /**
     * Method finds genre by id
     * @param id
     * @return genre
     */
    @Override
    public Genre getGenre(int id) {
        for (Genre genre : genres) {
            if (id == genre.getId()) {
                return genre;
            }
        }
        return null;
    }

    /**
     * Method finds genre by name
     * @param name
     * @return genre
     */
    @Override
    public Genre getGenre(String name){
        for(Genre genre : genres){
            if(name.equals(genre.getName())){
                return genre;
            }
        }
        return null;
    }

    public int getLastIndex(){
        return lastIndex;
    }

    /**
     * Method adds genre
     * @param genre
     */
    @Override
    public void addGenre(Genre genre) {
        if (getGenre(genre.getId()) == null) {
            genres.add(genre);
            lastIndex++;
        }
    }

    /**
     * Method deletes genre
     * @param genre
     */
    @Override
    public void deleteGenre(Genre genre) {
        if(getGenre(genre.getId())!=null){
            genres.remove(genre);
        }
    }
}
