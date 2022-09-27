package App.Service;

import App.Model.Movie;
import App.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//@component registers this class as a potential bean.
@Component
public class MovieService {
    MovieRepository mr;
    @Autowired
    public MovieService(MovieRepository mr) {
        this.mr = mr;
    }
    public List<Movie> getAllMovies(){
        return mr.findAll();
    }
    public Movie getMovie(int id){
        return mr.getMovieById(id);
    }
    public Movie getOldest(){
        return mr.getOldestMovie();
    }
    public void addMovie(Movie m){
        mr.save(m);
    }
}
