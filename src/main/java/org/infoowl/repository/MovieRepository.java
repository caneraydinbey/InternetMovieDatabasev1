package org.infoowl.repository;

/**
 * Created by caneraydin on 25.03.2016.
 */
import org.infoowl.domain.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by caneraydin on 15.03.2016.
 */
public interface MovieRepository extends CrudRepository<Movie, Long> {

    Page<Movie> findAll(Pageable pageable);

}