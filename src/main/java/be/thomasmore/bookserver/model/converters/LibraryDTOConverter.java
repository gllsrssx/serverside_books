package be.thomasmore.bookserver.model.converters;

import be.thomasmore.bookserver.model.Library;
import be.thomasmore.bookserver.model.dto.LibraryDTO;
import be.thomasmore.bookserver.model.dto.BookDTO;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryDTOConverter {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BookDTOConverter bookDTOConverter;

    public LibraryDTO convertToDto(Library library) {
        LibraryDTO libraryDTO = modelMapper.map(library, LibraryDTO.class);
        libraryDTO.setBooks(library.getBooks().stream()
            .map(bookDTOConverter::convertToDto)
            .collect(Collectors.toList()));
        return libraryDTO;
    }

    public Library convertToEntity(LibraryDTO libraryDTO) {
        return modelMapper.map(libraryDTO, Library.class);
    }

    public Library convertToEntity(LibraryDTO libraryDTO, Library library) {
        modelMapper.map(libraryDTO, library);
        return library;
    }
}