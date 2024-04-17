package be.thomasmore.bookserver.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class LibraryDTO {
    private int id;
    private String name;
    private List<BookDTO> books;
}