package App.Repository;

import App.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    @Query("from Movie where id=:id")
    public Movie getMovieById(@Param("id") int id);
    @Query("from Movie where year = (select min(year) from Movie)")
    public Movie getOldestMovie();
}
