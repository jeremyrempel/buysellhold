DROP TABLE IF exists current_holding;

CREATE TABLE current_holding (
    id SERIAL PRIMARY KEY,
    buy_date DATE NOT NULL,
    create_date TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP NOT NULL,
    symbol varchar(255) UNIQUE NOT NULL,
    title character varying(255)
);


