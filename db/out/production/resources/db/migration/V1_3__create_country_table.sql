
CREATE TABLE public.country
(
    id SERIAL NOT NULL,
    country_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    iso_country_code char(2) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT country_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.country
    OWNER to postgres;
