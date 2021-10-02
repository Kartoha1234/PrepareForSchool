CREATE TABLE homeworks(
hw_id int NOT NULL auto_increment,
day_of_week varchar(20) NOT NULL,
subject varchar(255) NOT NULL,
source varchar(255),
tasks varchar(255),
entered_by varchar(255),
date_of_year date,
PRIMARY KEY (hw_id)
);

CREATE TABLE prepareforschool(
pfs_id int NOT NULL auto_increment,
day_of_week varchar(15) NOT NULL,
subject varchar(255) NOT NULL,
quarter int NOT NULL,
PRIMARY KEY (pfs_id)
);


DROP TABLE IF EXISTS homeworks
DROP TABLE IF EXISTS prepareforschool

-- MONDAY 
INSERT INTO homeworks VALUES(1, 'monday', 'russian', 'diary', 'no', 'teacher', '2021-09-20');
INSERT INTO homeworks VALUES(2, 'monday', 'natural science', 'diary', 'no', 'teacher', '2021-09-20');
INSERT INTO homeworks VALUES(3, 'monday', 'math', 'diary', 'no', 'teacher', '2021-09-20');
INSERT INTO homeworks VALUES(4, 'monday', 'social science', 'diary', 'no', 'teacher', '2021-09-20');
-- TUESDAY
INSERT INTO homeworks VALUES(5, 'tuesday', 'russian', 'diary', 'p.28 execr.17', 'teacher', '2021-09-21');
INSERT INTO homeworks VALUES(6, 'tuesday', 'math', 'diary', 'p.23 execr.2', 'teacher', '2021-09-21');
INSERT INTO homeworks VALUES(7, 'tuesday', 'music', 'diary', 'no', 'teacher', '2021-09-21');
INSERT INTO homeworks VALUES(8, 'tuesday', 'english', 'diary', 'no', 'teacher', '2021-09-21');
INSERT INTO homeworks VALUES(9, 'tuesday', 'latvian', 'diarya', 'no', 'teacher', '2021-09-21');
INSERT INTO homeworks VALUES(10, 'tuesday', 'sport', 'diary', 'no', 'teacher', '2021-09-21');
-- WEDNESDAY
INSERT INTO homeworks VALUES(11, 'wednesday', 'math', 'diary', 'p.29 execr.1', 'teacher', '2021-09-22');
INSERT INTO homeworks VALUES(12, 'wednesday', 'russian', 'diary', 'p.19 execr.3-4', 'teacher', '2021-09-22');
INSERT INTO homeworks VALUES(13, 'wednesday', 'latvian', 'diary', 'no', 'teacher', '2021-09-22');
INSERT INTO homeworks VALUES(14, 'wednesday', 'christian teaching', 'diary', 'no', 'teacher', '2021-09-22');
INSERT INTO homeworks VALUES(15, 'wednesday', 'art', 'diary', 'no', 'teacher', '2021-09-22');
-- THURSDAY
INSERT INTO homeworks VALUES(16, 'thursday', 'natural science', 'diary', 'p.21', 'teacher', '2021-09-23');
INSERT INTO homeworks VALUES(17, 'thursday', 'russian', 'diary', 'p.27 execr.5', 'teacher', '2021-09-23');
INSERT INTO homeworks VALUES(18, 'thursday', 'english', 'diary', 'no', 'teacher', '2021-09-23');
INSERT INTO homeworks VALUES(19, 'thursday', 'latvian', 'diary', 'p.10 execr.2', 'teacher', '2021-09-23');
INSERT INTO homeworks VALUES(20, 'thursday', 'sport', 'diary', 'no', 'teacher', '2021-09-23');
-- FRIDAY
INSERT INTO homeworks VALUES(21, 'friday', 'housekeeping', 'diary', 'no', 'teacher', '2021-09-24');
INSERT INTO homeworks VALUES(22, 'friday', 'math', 'diary', 'p.33 execr. 1.-2.', 'teacher', '2021-09-24');
INSERT INTO homeworks VALUES(23, 'friday', 'russian', 'diary', 'p.29 execr.10', 'teacher', '2021-09-24');
INSERT INTO homeworks VALUES(24, 'friday', 'latvian', 'diary', 'answerso on 10 questins, orally', 'teacher', '2021-09-24');
INSERT INTO homeworks VALUES(25, 'friday', 'parenting lesson', 'diary', 'no',  'teacher', '2021-09-24');
-- MONDAY
INSERT INTO homeworks VALUES(26, 'monday', 'russian', 'diary', 'no', 'teacher', '2021-09-27');
INSERT INTO homeworks VALUES(27, 'monday', 'natural science', 'diary', 'p.6 execr.12', 'teacher', '2021-09-27');
INSERT INTO homeworks VALUES(28, 'monday', 'math', 'diary', 'p.23 execr. 1.28', 'teacher', '2021-09-27');
INSERT INTO homeworks VALUES(29, 'monday', 'social science', 'diary', 'no', 'teacher', '2021-09-27');
-- TUESDAY
INSERT INTO homeworks VALUES(30, 'tuesday', 'russian', 'diary', 'p.31 execr.13', 'teacher', '2021-09-28');
INSERT INTO homeworks VALUES(31, 'tuesday', 'matha', 'diary', 'p.31 execr.2', 'teacher', '2021-09-28');
INSERT INTO homeworks VALUES(32, 'tuesday', 'music', 'diary', 'no', 'teacher', '2021-09-28');
INSERT INTO homeworks VALUES(33, 'tuesday', 'english', 'diary', 'p.12.-13.', 'teacher', '2021-09-28');
INSERT INTO homeworks VALUES(34, 'tuesday', 'latvian', 'diary', 'no', 'teacher', '2021-09-28');
INSERT INTO homeworks VALUES(35, 'tuesday', 'sport', 'diary', 'no', 'teacher', '2021-09-28');
-- WEDNESDAY
INSERT INTO homeworks VALUES(36, 'wednesday', 'math', 'diary', 'no', 'teacher', '2021-09-29');
INSERT INTO homeworks VALUES(37, 'wednesday', 'russian', 'diary', 'no', 'teacher', '2021-09-29');
INSERT INTO homeworks VALUES(38, 'wednesday', 'latvian', 'diary', 'no', 'teacher', '2021-09-29');
INSERT INTO homeworks VALUES(39, 'wednesday', 'christian teaching', 'diary', 'no', 'teacher', '2021-09-29');
INSERT INTO homeworks VALUES(40, 'wednesday', 'art', 'diary', 'no', 'teacher', '2021-09-29');
-- THURSDAY
INSERT INTO homeworks VALUES(41, 'thursday', 'natural science', 'diary', 'p.22-25', 'teacher', '2021-09-30');
INSERT INTO homeworks VALUES(42, 'thursdaya', 'russian', 'diary', 'no', 'teacher', '2021-09-30');
INSERT INTO homeworks VALUES(43, 'thursday', 'english', 'diary', 'no', 'teacher', '2021-09-30');
INSERT INTO homeworks VALUES(44, 'thursday', 'latvian', 'diary', 'no', 'teacher', '2021-09-30');
INSERT INTO homeworks VALUES(45, 'thursday', 'sport', 'diary', 'no', 'teacher', '2021-09-30');
-- FRIDAY
INSERT INTO homeworks VALUES(46, 'friday', 'housekeeping', 'diary', 'p.23-24', 'teacher', '2021-10-01');
INSERT INTO homeworks VALUES(47, 'friday', 'math', 'diary', 'no', 'teacher', '2021-10-01');
INSERT INTO homeworks VALUES(48, 'friday', 'russian', 'diary', 'no', 'teacher', '2021-10-01');
INSERT INTO homeworks VALUES(49, 'friday', 'latvian', 'diary', 'no', 'teacher', '2021-10-01');
INSERT INTO homeworks VALUES(50, 'friday', 'parenting lesson', 'diary', 'no', 'teacher', '2021-10-01');

SELECT * from homeworks;


-- MONDAY
INSERT INTO prepareforschool VALUES(1, 'monday', 'russian', 1);
INSERT INTO prepareforschool VALUES(2, 'monday', 'natural science', 1);
INSERT INTO prepareforschool VALUES(3, 'monday', 'math', 1);
INSERT INTO prepareforschool VALUES(4, 'monday', 'social science', 1);
-- TUESDAY
INSERT INTO prepareforschool VALUES(5, 'tuesday', 'russian', 1);
INSERT INTO prepareforschool VALUES(6, 'tuesday', 'math', 1);
INSERT INTO prepareforschool VALUES(7, 'tuesday', 'music', 1);
INSERT INTO prepareforschool VALUES(8, 'tuesday', 'english', 1);
INSERT INTO prepareforschool VALUES(9, 'tuesday', 'latvian', 1);
INSERT INTO prepareforschool VALUES(10, 'tuesday', 'sport', 1);
-- WEDNESDAY
INSERT INTO prepareforschool VALUES(11, 'wednesday', 'math', 1);
INSERT INTO prepareforschool VALUES(12, 'wednesday', 'russian', 1);
INSERT INTO prepareforschool VALUES(13, 'wednesday', 'latvian', 1);
INSERT INTO prepareforschool VALUES(14, 'wednesday', 'christian teaching', 1);
INSERT INTO prepareforschool VALUES(15, 'wednesday', 'art', 1);
-- THURSDAY
INSERT INTO prepareforschool VALUES(16, 'thursday', 'natural science', 1);
INSERT INTO prepareforschool VALUES(17, 'thursday', 'russian', 1);
INSERT INTO prepareforschool VALUES(18, 'thursday', 'english', 1);
INSERT INTO prepareforschool VALUES(19, 'thursday', 'latvian', 1);
INSERT INTO prepareforschool VALUES(20, 'thursday', 'sport', 1);
-- FRIDAY
INSERT INTO prepareforschool VALUES(21, 'friday', 'housekeeping', 1);
INSERT INTO prepareforschool VALUES(22, 'friday', 'math', 1);
INSERT INTO prepareforschool VALUES(23, 'friday', 'russian', 1);
INSERT INTO prepareforschool VALUES(24, 'friday', 'latvian', 1);
INSERT INTO prepareforschool VALUES(25, 'friday', 'parenting lesson', 1);
-- SATURDAY
INSERT INTO prepareforschool VALUES(26, 'saturday', 'Have a pleasent weekend!', 1);
-- SUNDAY
INSERT INTO prepareforschool VALUES(27, 'sunday', 'Have a pleasent weekend!', 1);

SELECT * from prepareforschool WHERE day_of_week = 'friday';