delete from library;
alter table library alter column id restart with 1;

delete from book;
alter table book alter column id restart with 1;

