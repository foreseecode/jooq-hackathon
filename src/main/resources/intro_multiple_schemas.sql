CREATE SCHEMA IF NOT EXISTS first_schema;
DROP TABLE IF EXISTS first_schema.author_book, first_schema.author, first_schema.book;

CREATE OR REPLACE TABLE first_schema.author (
  id             INT          NOT NULL PRIMARY KEY,
  first_name     VARCHAR(50),
  last_name      VARCHAR(50)  NOT NULL
);

CREATE OR REPLACE TABLE first_schema.book (
  id             INT          NOT NULL PRIMARY KEY,
  title          VARCHAR(100) NOT NULL
);

CREATE OR REPLACE TABLE first_schema.author_book (
  author_id      INT          NOT NULL,
  book_id        INT          NOT NULL,

  PRIMARY KEY (author_id, book_id),
  CONSTRAINT fk_ab_author     FOREIGN KEY (author_id)  REFERENCES author (id)
    ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT fk_ab_book       FOREIGN KEY (book_id)    REFERENCES book   (id)
);

INSERT INTO first_schema.author VALUES
  (1, 'Kathy', 'Sierra'),
  (2, 'Bert', 'Bates'),
  (3, 'Bryan', 'Basham');

INSERT INTO first_schema.book VALUES
  (1, 'Head First Java'),
  (2, 'Head First Servlets and JSP'),
  (3, 'OCA/OCP Java SE 7 Programmer');

INSERT INTO first_schema.author_book VALUES (1, 1), (1, 3), (2, 1);

DROP TABLE IF EXISTS second_schema.room, second_schema.house, second_schema.house_room;

CREATE SCHEMA IF NOT EXISTS second_schema;
CREATE OR REPLACE TABLE second_schema.house (
  id             INT          NOT NULL PRIMARY KEY,
  house_name      VARCHAR(50)  NOT NULL
);

CREATE OR REPLACE TABLE second_schema.room (
  id             INT          NOT NULL PRIMARY KEY,
  room          VARCHAR(100)  NOT NULL,
  number        VARCHAR(100)  NOT NULL
);

CREATE OR REPLACE TABLE second_schema.house_room (
  room_id         INT          NOT NULL,
  house_id        INT          NOT NULL,

  PRIMARY KEY (room_id, house_id),
  CONSTRAINT fk_ab_room        FOREIGN KEY (room_id)     REFERENCES room (id)
    ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT fk_ab_house       FOREIGN KEY (house_id)    REFERENCES house (id)
);

INSERT INTO second_schema.room VALUES
  (1, 'Room', '1'),
  (2, 'Room', '2'),
  (3, 'Room', '3');

INSERT INTO second_schema.house VALUES
  (1, 'First Mansion'),
  (2, 'Ronaldos Little Farm'),
  (3, 'Granny House');