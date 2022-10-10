package DatasetManager;
import Entities.Actor;
import Entities.Movie;
import EntityManager.ActorManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Class parses data from CSV and creates Actor objects
 */
public class ActorParser {
    private final List<String[]> data;
    private final List<Actor> actors;
    private final ActorManager actorManager;

    /**
     * Constructor
     * @param data
     */
    public ActorParser(List<String[]> data) {
        this.data = data;
        actors = new ArrayList<>();
        actorManager = new ActorManager();
    }

    /**
     * Method creates Actor object from row
     * @param row
     * @return Actor
     */
    private Actor getActor(String[] row) {
        int id = DatasetManager.Utils.getId(row[0]);
        String name = row[1];
        Actor actor = new Actor(id, name);
        actorManager.addActor(actor);
        return actor;
    }

    /**
     * Method parses every row to create Actor objects
     * @return List of actor objects
     */
    public List<Actor> parse(){
        for(String[] row : data){
            actors.add(getActor(row));
        }
        return actors;
    }

    /**
     * Method returns actorManager
     * @return actorManager
     */
    public ActorManager getActorManager(){
        return actorManager;
    }
}
