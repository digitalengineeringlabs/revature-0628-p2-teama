-- Drop table

 DROP TABLE "ReimbursementSchema".employee;

CREATE TABLE "ReimbursementSchema".employee (
	employee_id serial NOT NULL,
	first_name varchar(255) NOT NULL,
	last_name varchar(255) NOT NULL,
	username varchar(255) NOT NULL,
	paswsord varchar(255) not null,
	"role" varchar(255) NOT null,
	primary key (employee_id)
);

-- Drop table

 DROP TABLE "ReimbursementSchema".ticket;

CREATE TABLE "ReimbursementSchema".ticket (
	ticket_id serial NOT NULL,
	status varchar(255) NOT NULL,
	note varchar(500) NOT NULL,
	"type" varchar(255) NOT NULL,
	amount double precision NOT NULL,
	date_made date NOT NULL,
	date_resolved date NOT NULL,
	employee_id int NOT null,
	primary key (ticket_id),
	constraint fk_employee
		foreign key(employee_id)
			references(employee_id)
);

