package ImportCSV;

import Connection.ConnectionProvider;
import DatasetManager.EntityType;
import Entities.Actor;
import Entities.Movie;
import DatasetManager.CsvTool;
import DatasetManager.ActorParser;
import DatasetManager.MovieParser;


import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;
import java.util.List;

/**
 * Class manages a tool for importing data from csv and inserting into data base
 */
public class ImportTool {
    private final String path;
    private final ConnectionProvider connectionProvider;
    private int entries = 0;
    private int MAX_ENTRIES = 2000;
    private static EntityType type;
    private static ActorParser actorParser;
    private static MovieParser movieParser;
    public static String outputPath = "web\\report.html";

    /**
     * Constructor
     * @param path
     * @throws ClassNotFoundException
     */
    public ImportTool(String path) throws ClassNotFoundException {
        this.path = path;
        connectionProvider = ConnectionProvider.connect();
    }

    /**
     * Method sets max entries
     * @param maxEntries
     */
    public void setMaxEntries(int maxEntries){
        MAX_ENTRIES = maxEntries;
    }

    /**
     * Method imports from csv and inserts into db
     * @throws SQLException
     */
    public void importFromCsv() throws SQLException {
        CsvTool csvParser = new DatasetManager.CsvTool(this.path);
        csvParser.setMaxEntries(MAX_ENTRIES);
        List<String[]> data = csvParser.getData();
        if (path.contains("movies")) {
            type = EntityType.movies;
            movieParser = new MovieParser(data);
            List<Movie> movies = movieParser.parse();
            for (Movie movie : movies) {
                if(entries == MAX_ENTRIES) {
                    break;
                }
                connectionProvider.insert("movies", movie);
                connectionProvider.insert("movieGenre",movie, movie.getGenre());
                entries++;
            }
        }else if(path.contains("actors")){
            type = EntityType.actors;
          actorParser = new ActorParser(data);
           List<Actor> actors = actorParser.parse();
           for(Actor actor : actors){
               if(entries == MAX_ENTRIES){
                   break;
               }
               connectionProvider.insert("actors",actor);
               entries++;
           }
        }
    }

    /**
     * Method creates HTML report using Velocity Marker
     * @throws IOException
     */
    public static void createReport() throws IOException {
        String template;
        VelocityEngine ve = new VelocityEngine();
        ve.init();
        VelocityContext vc = new VelocityContext();

        if(type == EntityType.actors){
            template = "web\\general-template.vm";
            vc.put("title","Actors");
            vc.put("objs",actorParser.getActorManager().getAllActors());
        }else{
            template = "web\\movie-template.vm";
            vc.put("title","Movies");
            vc.put("objs",movieParser.getMovieManager().getAllMovies());
        }



        Writer writer = new FileWriter(new File(outputPath));
        Velocity.mergeTemplate(template,"UTF-8",vc,writer);
        writer.flush();
        writer.close();
        System.out.println("Generated HTML report at "+ outputPath);
    }
}
