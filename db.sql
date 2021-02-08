create table person
(
    id       serial not null
        constraint person_pk primary key,
    name     varchar(255),
    lastname varchar(255)
);

alter table person
    owner to postgres;

create
unique index person_id_uindex
    on person (id);

create table car
(
    id    serial not null
        constraint car_pk primary key,
    model varchar(255),
    owner integer
        constraint car_person_fk references person
);

alter table car
    owner to postgres;

create
unique index car_id_uindex
    on car (id);

INSERT INTO person (id, name, lastname)
VALUES (1, 'Eduan', 'Bekker');
INSERT INTO car (id, model, owner)
VALUES (1, 'Land Rover', 1);