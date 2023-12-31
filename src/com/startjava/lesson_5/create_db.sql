\c robots

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers(
    id         INT         GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    model_name VARCHAR(25) NOT NULL,
    mark       VARCHAR(15) NOT NULL,
    height     DECIMAL     NOT NULL,
    weight     DECIMAL     NOT NULL,
    status     VARCHAR(15) NOT NULL,
    origin     VARCHAR(25) NOT NULL,
    launch     DATE        NOT NULL,
    kaiju_kill INT
);

\i 'init_db.sql'
\i 'queries.sql'