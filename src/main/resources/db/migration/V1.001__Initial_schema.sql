CREATE TABLE directions
(
  id   smallint not null primary key,
  name varchar  not null
);

CREATE TABLE cities
(
  id           smallint not null primary key,
  name         varchar  not null,
  direction_id smallint not null references directions (id)
);

