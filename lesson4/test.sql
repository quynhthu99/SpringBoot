use `shopese-spring`;
select * from Account;

update dbo.Account
set deleted = 1
where email ='abc' and role='STAFF';

-- 2. Product
-- CRUD

-- Create
insert into Product(productID,display,priceIn,priceOut, priceSale, amount, shipday, `description`, images) values('1');
-- Read all 
select * from Product where deleted = 0;

select * from Product 
where deleted =0
order by priceOut desc;


