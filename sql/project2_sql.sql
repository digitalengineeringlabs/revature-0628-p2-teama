DROP SCHEMA IF EXISTS ReimbursementSchema CASCADE;

CREATE SCHEMA reimbursementschema AUTHORIZATION postgres;

CREATE TABLE reimbursementschema.employee (
    employee_id serial NOT NULL,
    first_name varchar(255) NOT NULL,
    last_name varchar(255) NOT NULL,
    username varchar(255) NOT NULL,
    password varchar(255) not null,
    role varchar(255) NOT null,
    primary key (employee_id)
);


CREATE TABLE reimbursementschema.ticket (
    ticket_id serial NOT NULL,
    status varchar(255) NOT NULL,
    note varchar(500) NOT NULL,
    type varchar(255) NOT NULL,
    amount double precision NOT NULL,
    date_made date NOT NULL,
    date_resolved date,
    employee_id int NOT null,
    primary key (ticket_id),
    constraint fk_employee
        foreign key (employee_id) 
            references reimbursementschema.employee(employee_id)
);

INSERT INTO reimbursementschema.employee (first_name,last_name, role, username, password) VALUES ('nick','card', 'employee', 'nickcard@email.com', 'nickcard');
INSERT INTO reimbursementschema.employee (first_name,last_name, role, username, password) VALUES ('Anthoney','Newsome', 'employee', 'anewsome@email.com', 'anthoneynewsome');
INSERT INTO reimbursementschema.employee (first_name,last_name, role, username, password) VALUES ('Kha','lee', 'employee', 'klee@email.com', 'khalee');
INSERT INTO reimbursementschema.employee (first_name,last_name, role, username, password) VALUES ('Audrey','Keefe', 'manager', 'akeefe@email.com', 'audreykeefe');
INSERT INTO reimbursementschema.employee (first_name,last_name, role, username, password) VALUES ('test','1', 'manager', 'test1@email.com', 'test1');
INSERT INTO reimbursementschema.employee (first_name,last_name, role, username, password) VALUES ('test','2', 'employee', 'test2@email.com', 'test2');

insert into reimbursementschema.ticket (status, note, type, amount, date_made, date_resolved, employee_id) values ('pending', 'got some mcdonalds', 'food', 10.0, '2021/06/07', '2021/06/08', 5);
insert into reimbursementschema.ticket (status, note, type, amount, date_made, date_resolved, employee_id) values ('approved', 'gas', 'travel', 50.0, '2021/11/12', null, 5);
insert into reimbursementschema.ticket (status, note, type, amount, date_made, date_resolved, employee_id) values ('rejected', 'oil', 'travel', 10.0, '2021/11/12', null, 5);

--drop schema reimbursementschema;
--
--create schema reimbursementschema AUTHORIZATION postgres;
----- permissions -------
--GRANT ALL ON SCHEMA reimbursementschema TO postgres;
--
-- Drop table
--
-- DROP TABLE reimbursementschema.employee;
--
--CREATE TABLE reimbursementschema.employee (
--	employee_id serial NOT NULL,
--	first_name varchar(255) NOT NULL,
--	last_name varchar(255) NOT NULL,
--	username varchar(255) NOT NULL,
--	password varchar(255) not null,
--	"role" varchar(255) NOT null,
--	primary key (employee_id)
--);
--
--ALTER TABLE reimbursementschema.employee OWNER TO postgres;
--GRANT ALL ON TABLE reimbursementschema.employee TO postgres;
--
-- Drop table reimbursementschema.ticket;
--
 DROP TABLE reimbursementschema.ticket;
--
--CREATE TABLE reimbursementschema.ticket (
--	ticket_id serial NOT NULL,
--	status varchar(255) NOT NULL,
--	note varchar(500) NOT NULL,
--	type varchar(255) NOT NULL,
--	amount double precision NOT NULL,
--	date_made date NOT NULL,
--	date_resolved date NOT NULL,
--	employee_id int NOT null,
--	primary key (ticket_id),
--	constraint fk_employee
--		foreign key(employee_id)
--			references "reimbursementschema".employee(employee_id)
--);
--
--
--ALTER TABLE reimbursementschema.employee OWNER TO postgres;
--GRANT ALL ON TABLE reimbursementschema.employee TO postgres;
--
--
--insert into reimbursementschema.employee (first_name, last_name, username, password, role)
--values ('Joe', 'Schmoe', 'username1', 'password', 'employee'),
--('Jane', 'Doe', 'username2', 'password', 'admin');
--
--insert into "reimbursementschema".ticket(status, note, type, amount, date_made, date_resolved, employee_id)
--values('pending', 'lunch with client', 'food', 50.00, Now(), Now(), 1),
--('pending', 'train ticket', 'travel', 60.00, Now(), Now(), 2);
--
--
select * from reimbursementschema.ticket;
