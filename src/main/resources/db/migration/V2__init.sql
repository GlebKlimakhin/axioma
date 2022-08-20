create table done_exercises(
user_id bigint not null,
exercise_id bigint not null,
score int,
primary key(user_id, exercise_id)
);