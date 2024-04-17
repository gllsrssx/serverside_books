CREATE TABLE Library (
    id INTEGER PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    city VARCHAR(255),
    FOREIGN KEY (book_id) REFERENCES Book(id)
);