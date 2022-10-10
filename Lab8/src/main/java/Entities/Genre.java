package Entities;

/**
 * Class Genre models a genre
 */
public class Genre {

    private int id;
    private String name;

    /**
     * Constructor
     * @param id
     * @param name
     */
    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Method returns the id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Method sets the id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method returns the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method sets the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


}
