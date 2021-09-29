CREATE TABLE homeworks(
hw_id int NOT NULL auto_increment,
day_of_week varchar(10) NOT NULL,
subject varchar(255) NOT NULL,
source varchar(255),
tasks varchar(255),
entered_by varchar(255),
date_of_year date,
PRIMARY KEY (hw_id)
);

CREATE TABLE prepareforschool(
pfs_id int NOT NULL auto_increment,
day_of_week varchar(10) NOT NULL,
subject varchar(255) NOT NULL,
quarter int NOT NULL,
PRIMARY KEY (pfs_id)
);


DROP TABLE IF EXISTS homeworks

INSERT INTO homeworks VALUES(1, 'pirmdiena', 'matemātika', 'teams', 'lpp.3 uzd.5', 'skolotajs', null);
SELECT * from homeworks;

INSERT INTO prepareforschool VALUES(1, 'pirmdiena', 'matematika', 1);
SELECT * from prepareforschool;