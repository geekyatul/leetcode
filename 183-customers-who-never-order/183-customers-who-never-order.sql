# Write your MySQL query statement below

select Customers.name as "Customers"
from Customers
where customers.id not in
(
select c.id
from Customers as c
inner join Orders as o
on c.id=o.customerId);