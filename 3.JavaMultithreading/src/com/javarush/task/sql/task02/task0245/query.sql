select name , count(*) as 'count'
from cars
group by name
having count > 1