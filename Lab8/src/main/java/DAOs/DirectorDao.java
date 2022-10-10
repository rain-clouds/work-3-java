package DAOs;

import Entities.Director;

import java.util.List;
/**
 * DirectorDao is a Data Access Object interface, that contains methods for finding and adding directors
 */
public interface DirectorDao {
    /**
     * Method returns all directors
     * @return directors
     */
    List<Director> getAllDirectors();

    /**
     * Method finds a director by it's id
     * @param id
     * @return director
     */
    Director getDirector(int id);
    /**
     * Method finds a director by it's name
     * @param name
     * @return director
     */
    Director getDirector(String name);

    /**
     * Method adds a director
     * @param director
     */
    void addDirector(Director director);

    /**
     * Method deletes a director
     * @param director
     */
    void deleteDirector(Director director);
}
