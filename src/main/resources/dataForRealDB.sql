insert into book (title) values ('Oryx and Crake'); /*1*/
insert into book (title) values ('The year of the flood');/*2*/
insert into book (title) values ('MaddAddam');/*3*/
insert into book (title) values ('1Q84');/*4*/
insert into book (title) values ('De opwindvogelkronieken');/*5*/
insert into book (title) values ('Design Patterns');/*6*/
insert into book (title) values ('Anderland: De Stad Van Gouden Schaduw'); /*7*/
insert into book (title) values ('Anderland:  Rivier van blauw vuur'); /*8*/
insert into book (title) values ('Anderland:  Berg van zwart glas'); /*9*/
insert into book (title) values ('Anderland:  Zee van zilveren licht'); /*10*/
insert into book (title) values ('Neuromancer '); /*11*/
insert into book (title) values ('Snow crash'); /*12*/
insert into book (title) values ('Rainbows’s end'); /*13*/
insert into book (title) values ('Hard-boiled wonderland en het einde van de wereld'); /*14*/
insert into book (title) values ('Ready Player one'); /*15*/
insert into book (title) values ('Refactoring'); /*16*/
insert into book (title) values ('Extreme Programming Explained'); /*17*/
insert into book (title) values ('Implementation patterns'); /*18*/
insert into book (title) values ('Clean code'); /*19*/

insert into author (name) values ('Margaret Atwood'); /*1*/
insert into author (name) values ('Haruki Murakami'); /*2*/
insert into author (name) values ('Erich Gamma'); /*3*/
insert into author (name) values ('Richard Helm'); /*4*/
insert into author (name) values ('Ralph Johnson'); /*5*/
insert into author (name) values ('John Vlissides'); /*6*/
insert into author (name) values ('Tad Williams'); /*7*/
insert into author (name) values ('William Gibson'); /*8*/
insert into author (name) values ('Neal Stephenson'); /*9*/
insert into author (name) values ('Vernor Vinge'); /*10*/
insert into author (name) values ('Martin Fowler'); /*11*/
insert into author (name) values ('Kent Beck'); /*12*/
insert into author (name) values ('Robert C Martin'); /*13*/


insert into book_authors (books_id, authors_id) values (1, 1);
insert into book_authors (books_id, authors_id) values (2, 1);
insert into book_authors (books_id, authors_id) values (3, 1);
insert into book_authors (books_id, authors_id) values (4, 2);
insert into book_authors (books_id, authors_id) values (5, 2);
insert into book_authors (books_id, authors_id) values (6, 3);
insert into book_authors (books_id, authors_id) values (6, 4);
insert into book_authors (books_id, authors_id) values (6, 5);
insert into book_authors (books_id, authors_id) values (6, 6);
insert into book_authors (books_id, authors_id) values (7, 7);
insert into book_authors (books_id, authors_id) values (8, 7);
insert into book_authors (books_id, authors_id) values (9, 7);
insert into book_authors (books_id, authors_id) values (10, 7);
insert into book_authors (books_id, authors_id) values (11, 8);
insert into book_authors (books_id, authors_id) values (12, 9);
insert into book_authors (books_id, authors_id) values (13, 10);
insert into book_authors (books_id, authors_id) values (14, 2);
insert into book_authors (books_id, authors_id) values (15, 10);
insert into book_authors (books_id, authors_id) values (16, 11);
insert into book_authors (books_id, authors_id) values (17, 12);
insert into book_authors (books_id, authors_id) values (18, 12);
insert into book_authors (books_id, authors_id) values (19, 13);


insert into SERIE(NAME) values ('Oryx and Crake');
insert into SERIE(NAME) values ('Anderland');

