drop table if exists user_details;
drop table if exists contact;

create table contact(
id int not null auto_increment,
org_name varchar(30) not null,
street varchar(30) not null,
city varchar(30) not null,
state varchar(30) not null,
primary key(id));


create table user_details(
id int not null auto_increment,
username varchar(30) not null,
last_login_time date not null,
contact_id int not null,
primary key(id),
foreign key(contact_id)
references contact(id)); 

insert into contact (org_name,street,city,state) values ('Amphisoft','10/a Eatteri Road','Salem','TamilNadu');
insert into contact (org_name,street,city,state) values ('Amphisoft','43/d warren road','Chennai','TamilNadu');
insert into contact (org_name,street,city,state) values ('Nippon','9/5A Hosur Road','Bangalore','Karnataka');
insert into contact (org_name,street,city,state) values ('Datex','GC Road','Belgaum','Karnataka');
insert into contact (org_name,street,city,state) values ('Girias','Hosa Road','Ankola','Karnataka');

insert into user_details(username,last_login_time,contact_id) values ('Vinai','2017-06-16',1);
insert into user_details(username,last_login_time,contact_id) values ('Srinath','2017-08-02',2);
insert into user_details(username,last_login_time,contact_id) values ('Rita','2017-07-22',3);
insert into user_details(username,last_login_time,contact_id) values ('Jane','2017-11-12',4);
insert into user_details(username,last_login_time,contact_id) values ('Jenny','2017-10-17',5);
