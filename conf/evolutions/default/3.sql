

# --- !Ups

create TYPE my_enum_type as ENUM ('VAL_1', 'VAL_2');

CREATE TABLE test(
    id bigserial not NULL PRIMARY KEY ,
    my_str text,
    my_enum my_enum_type not null
);

# --- !Downs