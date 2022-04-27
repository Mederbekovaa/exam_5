create table minibus (
        id integer primary key,
        num_minibus varchar(30) unique not null ,
        start_point_minibus varchar(30) unique not null ,
        end_point_minibus varchar(100) unique not null
);

select from minibus m ;

create table bus (
        id integer primary key,
        bus_num varchar (100) unique not null,
        minibus_id integer references minibus(id)
);

select from bus b ;

create table driver (
        id integer primary key,
        name varchar (100) not null
);

select from driver d ;

create table driver_bus(
        id integer primary key,
        driver_id integer references driver(id),
        bus_id integer references bus(id)
);

select from driver_bus ;

create table driver_journal(
        id integer primary key,
        driver_bus_id integer references driver_bus(id),
        start_time date not null,
        end_time date not null
);

select from driver_journal ;


insert into minibus
values (1, '169','Дордой плаза', 'Ак орго' ),
(2, '216', 'Цум', 'Орто-Сай'  ),
(3, '172', 'Орто-Сай', 'Аламедин'),
(4, '220',  'Ош базар','Бишкек Парк');

insert into bus
values (1, '2387', 3),
(2, '797', 1),
(3, '890', 2),
(4, '608', 4);

insert into driver
values (1, 'Aibek'),
(2, 'Ali'),
(3, 'Baya'),
(4, 'Chyngyz');

insert into driver_bus
values (1, 2, 3),
(2, 1, 1),
(3, 3, 2),
(4, 4, 4);


insert into driver_journal
values (1, 1, '12:00', '23:00'),
(2, 2, '13:00', '20:00'),
(3, 3, '14:00', '21:00'),
(4, 4, '15:00', '22:20');


















