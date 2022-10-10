package Entities;

/**
 * Class Movie models a movie
 */
public class Movie {
    private int id;
    private String title;
    private String releaseDate;
    private int duration;
    private int score;
    private Genre genre;

    /**
     * Constructor
     * @param id
     * @param title
     * @param releaseDate
     * @param duration
     * @param score
     */
    public Movie(int id, String title, String releaseDate, int duration, int score) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.score = score;
    }

    /**
     * Method returns id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Method sets id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method returns title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method sets the title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Method returns release date
     * @return release date
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Method sets the release date
     * @param releaseDate
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Method returns duration
     * @return duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Method sets the duration
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Method returns score
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * Method sets the score
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }


    public Entities.Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }



}
