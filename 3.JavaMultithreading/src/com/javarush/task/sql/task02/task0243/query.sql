select YEAR(prod_date) as prod_year , MONTH(prod_date) as prod_month , count(*)
from cars
group by prod_year , prod_month
