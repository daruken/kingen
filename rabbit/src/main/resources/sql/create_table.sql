create table member (
                        id bigint primary key auto_increment,
                        name varchar(30),
                        email varchar(255),
                        phone varchar(20),
                        created_at datetime,
                        updated_at datetime
);
