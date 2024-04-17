package be.thomasmore.bookserver.model;

import lombok.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode(exclude = { "authors" })
@ToString(exclude = { "authors" })
@Entity
public class Book {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @NotBlank(message = "Book Title should not be blank")
    @NotNull
    private String title;

    @Column(length = 1024)
    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Author> authors;

    @Column(length = 17)
    @Pattern(regexp = "^(97(8|9))?[0-9]{1,5}-[0-9]{1,7}-[0-9]{1,6}-[0-9]$", message = "This is not a correct ISBN number")
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;
}
