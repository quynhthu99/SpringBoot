use lesson4;
drop table if exists Product;

create table Product(
productID nvarchar(100) primary key,
display nvarchar(100),
priceIn int,
priceOut int,
priceSale int,
amount int,
shipday int,
`description` nvarchar(100),
images nvarchar(100),
creat_at timestamp default current_timestamp,
update_at timestamp default current_timestamp on update current_timestamp
);


drop table if exists `Account`;
create table `Account`(
accountID nvarchar(100) primary key,
email nvarchar(100),
display nvarchar(100),
`password` nvarchar(100),
role enum('ADMIN','STAFF','USER'),
avatar nvarchar(100),
creat_at timestamp default current_timestamp,
update_at timestamp default current_timestamp on update current_timestamp
);

drop table if exists Receipt;
create table Receipt(
saleID nvarchar(100) primary key,
productID nvarchar(100),
foreign key(`productID`) references `Product`(`productID`),
accountID nvarchar(100),
foreign key(`accountID`) references `Account`(`accountID`),
price int,
status nvarchar(100),
creat_at timestamp default current_timestamp,
update_at timestamp default current_timestamp on update current_timestamp
);








 