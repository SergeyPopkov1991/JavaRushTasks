select prod_date , count(*)
from cars
where name = 'Blue car'
order by prod_year
