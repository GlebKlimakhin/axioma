create table reading_speed_exercises(
    id bigserial not null unique,
    data text not null,
--     type varchar(50) not null,
    score int
);

-- insert into reading_speed_exercises(data, type, score) VALUES
-- ('this is test reading exercise', 'READING_SPEED', 5);

insert into reading_speed_exercises(data, score) VALUES
    ('this is test reading exercise', 5);