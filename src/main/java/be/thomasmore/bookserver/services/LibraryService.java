package be.thomasmore.bookserver.services;

import be.thomasmore.bookserver.model.Library;
import be.thomasmore.bookserver.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    public List<Library> getLibraries(String city) {
        if (city != null) {
            return libraryRepository.findByCityIgnoreCase(city);
        } else {
            return (List<Library>) libraryRepository.findAll();
        }
    }

    public Library createLibrary(Library newLibrary) {
        return libraryRepository.save(newLibrary);
    }
}