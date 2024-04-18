CREATE TABLE if NOT EXISTS sk_example_table
(
    id SERIAL,
    obj JSONB NOT NULL,
    PRIMARY KEY(id)
);