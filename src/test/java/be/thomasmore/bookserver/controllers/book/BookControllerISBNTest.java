package be.thomasmore.bookserver.controllers.book;

import be.thomasmore.bookserver.AbstractIntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.AFTER_TEST_METHOD;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SuppressWarnings("SpringTestingSqlInspection")
@Sql("/sql/books/create_6_books.sql")
@Sql(scripts = "/sql/books/clean_books.sql", executionPhase = AFTER_TEST_METHOD)
public class BookControllerISBNTest extends AbstractIntegrationTest {

    @Test
    public void getOneBookISBN() throws Exception {
        mockMvc.perform(getMockRequestGet("/api/books/3"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(3))
                .andExpect(jsonPath("$.title").value("The Hunger Games"))
                .andExpect(jsonPath("$.isbn").value("978-0-306-40617-1"));
    }

    @Test
    public void getOneBookISBNNotFound() throws Exception {
        mockMvc.perform(getMockRequestGet("/api/books/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("Test Automation"))
                .andExpect(jsonPath("$.isbn").doesNotExist());
    }

    
    @Test
    public void getOneBookISBNWrongNotFound() throws Exception {
        final MvcResult mvcResult = mockMvc.perform(getMockRequestGet("/api/books/2"))
                .andExpect(status().isInternalServerError())
                .andReturn();
        assertThat(mvcResult.getResponse().getErrorMessage()).isEqualTo("This is not a correct ISBN number");
    }

    @Test
    public void getAllBooksISBN() throws Exception {
        mockMvc.perform(getMockRequestGet("/api/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(3))
                .andExpect(jsonPath("$[0].title").value("The Hunger Games"))
                .andExpect(jsonPath("$[0].isbn").doesNotExist())
                .andExpect(jsonPath("$[1].id").value(4))
                .andExpect(jsonPath("$[1].title").value("Catching Fire"))
                .andExpect(jsonPath("$[1].isbn").doesNotExist());
    }
}