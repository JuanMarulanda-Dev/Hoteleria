CREATE TABLE public.users
(
    id serial,
    email character varying NOT NULL,
    password character varying NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

ALTER TABLE IF EXISTS public.users
    OWNER to postgres;


--########
CREATE TABLE public.rooms
(
    id serial,
    name character varying NOT NULL,
    description character varying NOT NULL,
    capacity integer NOT NULL DEFAULT 0,
    status boolean NOT NULL DEFAULT true,
    CONSTRAINT room_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

ALTER TABLE IF EXISTS public.rooms
    OWNER to postgres;


--########
CREATE TABLE public.customers
(
    id serial,
    user_id integer NOT NULL,
    first_name character varying(30) NOT NULL,
    last_name character varying(30) NOT NULL,
    birthdate date NOT NULL,
    status boolean NOT NULL,
    CONSTRAINT customer_pkey PRIMARY KEY (id),
    CONSTRAINT user_customer_fkey FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE NO ACTION
        NOT VALID
)
WITH (
    OIDS = FALSE
);

ALTER TABLE IF EXISTS public.customers
    OWNER to postgres;


--########
CREATE TABLE IF NOT EXISTS public.reservations
(
    id serial,
    customer_id integer,
    room_id integer,
    check_in timestamp without time zone NOT NULL,
    check_out timestamp without time zone NOT NULL,
    status boolean NOT NULL DEFAULT true,
    CONSTRAINT reservation_pkey PRIMARY KEY (id),
    CONSTRAINT customer_reservation_fkey FOREIGN KEY (customer_id)
        REFERENCES public.customers (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE NO ACTION,
    CONSTRAINT room_reservation_fkey FOREIGN KEY (room_id)
            REFERENCES public.rooms (id) MATCH SIMPLE
            ON UPDATE CASCADE
            ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
);

ALTER TABLE IF EXISTS public.reservations
    OWNER to postgres;