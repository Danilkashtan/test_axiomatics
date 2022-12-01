create table request
(
    id bigserial primary key,
    a bigint,
    b bigint,
    c bigint
);

create table response
(
    id bigserial primary key,
    x1 varchar(200),
    x2 varchar(200),
    request_id bigint,
    CONSTRAINT fkey_request_id FOREIGN KEY (request_id) REFERENCES request (id)
);