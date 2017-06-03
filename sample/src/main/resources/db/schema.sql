#drop table if exists hangover.users;

CREATE TABLE IF NOT EXISTS hangover.users (
  id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(30),
  city  VARCHAR(50),
  age INTEGER
);