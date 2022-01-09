# Write your MySQL query statement below

#table Person Address

select 
firstName,lastName,city,state 
from 
Person left join Address
on
Person.personId=Address.personId;


