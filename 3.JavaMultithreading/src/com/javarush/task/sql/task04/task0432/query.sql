select monthname(date) ,count(*) as total
from event
where status = 'ERROR' or status = 'FAILED'
group by monthname(date)
order by total desc
limit 1
