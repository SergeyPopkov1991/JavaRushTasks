select *
from event
where year(curdate()) = year(date_time) and month(curdate()) = month(date_time)
