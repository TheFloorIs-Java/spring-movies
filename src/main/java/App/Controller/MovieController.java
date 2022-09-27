package App.Controller;

import App.Model.Movie;
import App.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class MovieController {
    MovieService movieService;
//    @autowired automatically finds the most appropriate bean and injects it into this class.
    @Autowired
    public MovieController(MovieService mv){
        this.movieService = mv;
    }
    @GetMapping("hello")
    public String sayHello(){
        return "Hello API!";
    }
    @GetMapping("movies")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }
    @GetMapping("movies/{id}")
    public Movie getMovie(@PathVariable("id") int id){
        return movieService.getMovie(id);
    }
    @PostMapping("movies")
    public void addMovie(@RequestBody Movie m){
        movieService.addMovie(m);
    }
    @GetMapping("old/movie")
    public Movie getOldest(){
        return movieService.getOldest();
    }
}
