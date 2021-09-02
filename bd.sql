CREATE TABLE public.accounts
(
    username character varying(20)[] COLLATE pg_catalog."default" NOT NULL,
    active boolean,
    password character varying(128)[] COLLATE pg_catalog."default",
    rol character varying(20)[] COLLATE pg_catalog."default",
    CONSTRAINT accounts_pkey PRIMARY KEY (username)
);

CREATE TABLE public.customers
(
    id uuid NOT NULL,
    name character varying(100) COLLATE pg_catalog."default",
    email character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT customers_pkey PRIMARY KEY (id)
);

CREATE TABLE public.orders
(
    id uuid NOT NULL,
    amount double precision NOT NULL,
    order_num integer,
    order_date date,
    customer_id uuid NOT NULL,
    CONSTRAINT orders_pkey PRIMARY KEY (id)
);

CREATE TABLE public.orders_details
(
    id uuid NOT NULL,
    amount double precision NOT NULL,
    price double precision NOT NULL,
    quantity integer NOT NULL,
    order_id uuid NOT NULL,
    product_id uuid NOT NULL,
    CONSTRAINT orders_details_pkey PRIMARY KEY (id)
);

CREATE TABLE public.products
(
    id uuid NOT NULL,
    code character varying(20)[] COLLATE pg_catalog."default",
    name character varying(255)[] COLLATE pg_catalog."default",
    create_date date,
    CONSTRAINT products_pkey PRIMARY KEY (id)
);