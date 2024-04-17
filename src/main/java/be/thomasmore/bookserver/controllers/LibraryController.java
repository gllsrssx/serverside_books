package be.thomasmore.bookserver.controllers;

import be.thomasmore.bookserver.model.dto.LibraryDTO;
import be.thomasmore.bookserver.services.LibraryService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import be.thomasmore.bookserver.model.converters.LibraryDTOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/libraries")
@Slf4j
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @Autowired
    private LibraryDTOConverter libraryDTOConverter;

    @Operation(summary = "get all libraries from the database", description = "All libraries are returned. </br>")
    @GetMapping
    public List<LibraryDTO> getLibraries(@RequestParam(required = false) String city) {

        log.info("##### getLibraries");
        return libraryService.getLibraries(city)
                .stream()
                .map(libraryDTOConverter::convertToDto)
                .collect(Collectors.toList());
    }

    @Operation(summary = "get 1 library from the database.", description = "Library with id is fetched from database. ")
    @PostMapping
    public LibraryDTO createLibrary(@RequestBody LibraryDTO newLibraryDto) {
        log.info("##### createLibrary");
        return libraryDTOConverter
                .convertToDto(libraryService.createLibrary(libraryDTOConverter.convertToEntity(newLibraryDto)));
    }
}