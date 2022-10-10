package DAOs;

import Entities.Actor;

import java.util.List;
/**
 * ActorDao is a Data Access Object interface, that contains methods for finding and adding actors
 */
public interface ActorDao {
    /**
     * Method returns all actors
     * @return actors
     */
    List<Actor> getAllActors();

    /**
     * Method finds a actor by it's id
     * @param id
     * @return actor
     */
    Actor getActor(int id);
    /**
     * Method finds a actor by it's name
     * @param name
     * @return actor
     */
    Actor getActor(String name);

    /**
     * Method adds a actor
     * @param actor
     */
    void addActor(Actor actor);

    /**
     * Method deletes a actor
     * @param actor
     */
    void deleteActor(Actor actor);
}
