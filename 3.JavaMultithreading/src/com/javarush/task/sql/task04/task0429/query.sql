select *
from event
where date_sub(curdate(), interval 2 week)
  and curdate()
