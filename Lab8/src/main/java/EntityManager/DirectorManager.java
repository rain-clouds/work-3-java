package EntityManager;

import DAOs.DirectorDao;
import Entities.Director;

import java.util.ArrayList;
import java.util.List;
/**
 * Method manages Director objects in current session
 */
public class DirectorManager implements DirectorDao {
    private final List<Director> directors;

    /**
     * Constructor
     */
    public DirectorManager(){
        directors = new ArrayList<>();
    }

    /**
     * Method returns directors
     * @return directors
     */
    @Override
    public List<Director> getAllDirectors() {
        return directors;
    }

    /**
     * Method finds director by id
     * @param id
     * @return director
     */
    @Override
    public Director getDirector(int id) {
        for(Director director : directors){
            if(director.getId() == id){
                return director;
            }
        }
        return null;
    }

    /**
     * Method finds director by name
     * @param name
     * @return director
     */
    @Override
    public Director getDirector(String name) {
        for(Director director : directors){
            if(director.getName().equals(name)){
                return director;
            }
        }
        return null;
    }

    /**
     * Method adds director
     * @param director
     */
    @Override
    public void addDirector(Director director) {
        if(getDirector(director.getId())==null){
            directors.add(director);
        }
    }

    /**
     * Method deletes director
     * @param director
     */
    @Override
    public void deleteDirector(Director director) {
        if(getDirector(director.getId())!=null){
            directors.remove(director);
        }
    }
}
