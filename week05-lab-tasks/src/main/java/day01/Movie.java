package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {
    private String movieTitle;
    private List<LocalDateTime> dates;

    public Movie(String movieTitle, List<LocalDateTime> dates) {
        this.movieTitle = movieTitle;
        this.dates = dates;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public List<LocalDateTime> getDates() {
        return dates;
    }
}
