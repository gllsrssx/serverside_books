package be.thomasmore.bookserver.repositories;

import java.util.List;
import be.thomasmore.bookserver.model.Library;
import org.springframework.data.repository.CrudRepository;

public interface LibraryRepository extends CrudRepository<Library, Integer> {
    List<Library> findByCityIgnoreCase(String city);
}
