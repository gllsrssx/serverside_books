

insert into library (name, city)
values ('Centrale Bibliotheek Brussel', 'Brussel'); /*1*/
insert into library (name, city)
values ('Stedelijke Bibliotheek Antwerpen', 'Antwerpen'); /*2*/
insert into library (name, city)
values ('Gemeentelijke Bibliotheek Gent', 'Gent'); /*3*/
insert into library (name, city)
values ('Erfgoedbibliotheek Brugge', 'Brugge'); /*4*/
insert into library (name, city)
values ('Universiteitsbibliotheek Leuven', 'Leuven'); /*5*/

insert into book (title)
values ('Oryx and Crake'); /*1*/
insert into book (title)
values ('The year of the flood'); /*2*/
insert into book (title)
values ('The Hunger Games'); /*3*/
insert into book (title)
values ('Catching Fire'); /*4*/
insert into book (title)
values ('Design Patterns'); /*5*/

insert into library_books (library_id, book_id)
values (1, 1);
insert into library_books (library_id, book_id)
values (1, 2);
insert into library_books (library_id, book_id)
values (1, 3);
insert into library_books (library_id, book_id)
values (2, 3);
insert into library_books (library_id, book_id)
values (2, 4);
insert into library_books (library_id, book_id)
values (3, 3);
insert into library_books (library_id, book_id)
values (4, 3);
insert into library_books (library_id, book_id)
values (5, 5);

