select year(date) , month(date) , day(date) , count(*) as  total
from event
group by year(date), month(date), day(date)
having total > 5