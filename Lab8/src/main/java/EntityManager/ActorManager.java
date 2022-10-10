package EntityManager;

import DAOs.ActorDao;
import Entities.Actor;

import java.util.ArrayList;
import java.util.List;

/**
 * Method manages Actor objects in current session
 */
public class ActorManager implements ActorDao {
    private final List<Actor> actors;

    /**
     * Constructor
     */
    public ActorManager(){
        actors = new ArrayList<>();
    }

    /**
     * Method returns actors
     * @return actors
     */
    @Override
    public List<Actor> getAllActors() {
        return actors;
    }

    /**
     * Method finds actor by id
     * @param id
     * @return actor
     */
    @Override
    public Actor getActor(int id) {
        for(Actor actor : actors){
            if(actor.getId() == id){
                return actor;
            }
        }
        return null;
    }

    /**
     * Method finds actor by name
     * @param name
     * @return actor
     */
    @Override
    public Actor getActor(String name) {
        for(Actor actor : actors){
            if(actor.getName().equals(name)){
                return actor;
            }
        }
        return null;
    }

    /**
     * Method adds actor
     * @param actor
     */
    @Override
    public void addActor(Actor actor) {
        if(getActor(actor.getId())==null){
            actors.add(actor);
        }
    }

    /**
     * Method deletes actor
     * @param actor
     */
    @Override
    public void deleteActor(Actor actor) {
        if(getActor(actor.getId())!=null){
            actors.remove(actor);
        }

    }
}
