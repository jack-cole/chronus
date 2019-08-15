CREATE TYPE STREAM_TYPE AS ENUM ('log', 'performance', 'storage');
CREATE TYPE PARAMETER_VALUE_TYPE AS ENUM ('string', 'integer', 'decimal', 'date', 'time');

CREATE TABLE source
(
    id    SERIAL UNIQUE,
    name  VARCHAR(256),
    token CHAR(256)
);

CREATE TABLE stream
(
    id        SERIAL UNIQUE,
    name      VARCHAR(256),
    source_id SERIAL REFERENCES source (id),
    type      STREAM_TYPE
);

CREATE TABLE log
(
    id           SERIAL UNIQUE,
    stream_id    SERIAL REFERENCES stream (id),
    msg          VARCHAR(16384),
    event_time   TIME,
    grabbed_time TIME
);

CREATE TABLE performance
(
    id           SERIAL UNIQUE,
    stream_id    SERIAL REFERENCES stream (id),
    cpu          INT,
    ram          INT,
    event_time   TIME,
    grabbed_time TIME
);

CREATE TABLE storage
(
    id           SERIAL UNIQUE,
    stream_id    SERIAL REFERENCES stream (id),
    used         INT,
    total        INT,
    event_time   TIME,
    grabbed_time TIME
);

CREATE TABLE parameter
(
    id           SERIAL UNIQUE,
    api_name     VARCHAR(64) UNIQUE NOT NULL,
    display_name VARCHAR(64) NOT NULL,
    value        VARCHAR(256) NOT NULL,
    type         PARAMETER_VALUE_TYPE NOT NULL,
    read_only   BOOLEAN NOT NULL
)