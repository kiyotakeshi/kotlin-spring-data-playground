insert into seats (id, name)
values (100, 'okamoto');

insert into students (id, name, seat_id)
values (100, 'tanaka', 100);

insert into person (id, birth_data, location, name)
values (100, '2021-11-21', 'tokyo', 'mike');

insert into course (id, name, created_date, last_update_date)
values (100, 'kotlin-beginner', '2021-11-20T20:20', '2021-11-21T01:18:14.063271');

insert into course (id, name, created_date, last_update_date)
values (101, 'kotlin-expert', sysdate(), sysdate());

insert into review (id, title, description, rating, course_id)
values (100, 'excellent', 'this course is useful for kotlin beginner', '5', 100);

insert into review (id, title, description, rating, course_id)
values (101, 'good', 'this course gives me some unknown tips','4', 100);

insert into review (id, title, description, rating, course_id)
values (102, 'excellent', 'this course is useful for to be kotlin expert','5', 101);
