CREATE TABLE movie(
	movie_id int,
	movie_name varchar(45),
	derector varchar(45),
	movie_type varchar(45),
	moviewcol varchar(45),
	primary key(movie_id)
)

insert into movie(movie_id, movie_name, derector, movie_type) 
values(1, '캐러비안의 해적', '감독1','sf'),
(2, '나를 찾아줘', '감독2','스릴'),
(3, '서프러제트', '감독3','드라마');


select * from movie;