DROP TABLE IF EXISTS spittle;

CREATE TABLE spittle
(
  id        INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  message   VARCHAR(80)         NOT NULL,
  gmtCreate DATETIME            NOT NULL,
  latitude  DOUBLE(6, 2),
  longitude DOUBLE(6, 2)
);

INSERT INTO spittle
(
  message, gmtCreate, latitude, longitude
)
VALUES
  ('消息01', now(), 1.1, 1.1),
  ('消息02', now(), 2.2, 2.2),
  ('消息03', now(), 3.3, 3.3),
  ('消息04', now(), 4.4, 4.4),
  ('消息05', now(), 5.5, 5.5),
  ('消息06', now(), 6.6, 6.6),
  ('消息07', now(), 7.7, 7.7),
  ('消息08', now(), 8.8, 8.8),
  ('消息09', now(), 9.9, 9.9),
  ('消息10', now(), 10.10, 10.10),
  ('消息11', now(), 11.11, 11.11),
  ('消息12', now(), 12.12, 12.12),
  ('消息13', now(), 13.13, 13.13),
  ('消息14', now(), 14.14, 14.14);


DROP TABLE IF EXISTS spitter;

CREATE TABLE spitter
(
  id        INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  username  VARCHAR(16)         NOT NULL,
  password  VARCHAR(25)         NOT NULL,
  firstName VARCHAR(30)         NOT NULL,
  lastName  VARCHAR(30)         NOT NULL,
  email     VARCHAR(30)         NOT NULL
);

INSERT INTO spitter
(
  username, password, firstName, lastName, email
)
VALUES
  ('aaaaa', 'aaaaa', 'aFirst', 'aLast', 'a@163.com'),
  ('bbbbb', 'bbbbb', 'bFirst', 'bLast', 'b@qq.com'),
  ('ccccc', 'ccccc', 'cFirst', 'cLast', 'c@163.com');


