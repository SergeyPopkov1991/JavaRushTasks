select  dayname(date) , count(*) as total
from event
where type = 'REGISTRATION'
group by  dayname(date)
order by total desc
limit 1
