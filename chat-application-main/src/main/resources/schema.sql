CREATE TABLE IF NOT EXISTS USERS (
  userid INT PRIMARY KEY auto_increment,
  username VARCHAR(20),
  salt VARCHAR,
  password VARCHAR,
  firstname VARCHAR(20),
  lastname VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS MESSAGES (
  messageid INT PRIMARY KEY auto_increment,
  username VARCHAR NOT NULL,
  messagetext VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS TUTORS (
  tutorid INT PRIMARY KEY auto_increment,
  tutorname VARCHAR(20),
  salt2 VARCHAR,
  tutorpassword VARCHAR,
  firsttutorname VARCHAR(20),
  lasttutorname VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS Trainers (
  id INT PRIMARY KEY auto_increment,
  name VARCHAR(30),
  degree VARCHAR(30),
  session VARCHAR(30)

  
);

CREATE TABLE IF NOT EXISTS Subjects (
  id INT PRIMARY KEY auto_increment,
  name VARCHAR(30),
  english VARCHAR(30),
  math  VARCHAR(30),
  chinese VARCHAR(30),
  liberal  VARCHAR(30)
  
);
