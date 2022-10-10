package DAOs;

import Entities.Genre;

import java.util.List;

/**
 * GenreDao is a Data Access Object interface, that contains methods for finding and adding genres
 */
public interface GenreDao {
    /**
     * Method returns all genres
     * @return genres
     */
    List<Genre> getAllGenres();

    /**
     * Method finds a genre by it's id
     * @param id
     * @return genre
     */
    Genre getGenre(int id);
    /**
     * Method finds a genre by it's name
     * @param name
     * @return genre
     */
    Genre getGenre(String name);

    /**
     * Method adds a genre
     * @param genre
     */
    void addGenre(Genre genre);

    /**
     * Method deletes a genre
     * @param genre
     */
    void deleteGenre(Genre genre);

    int getLastIndex();
}
