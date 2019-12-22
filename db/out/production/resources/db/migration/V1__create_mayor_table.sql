create table MAYOR (
    id bigserial not null primary key,
    mayorId varchar(16) not null,
    first_name varchar(100) not null,
    middle_name varchar(100) not null,
    last_name varchar(100) not null
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.mayor
    OWNER to postgres;
