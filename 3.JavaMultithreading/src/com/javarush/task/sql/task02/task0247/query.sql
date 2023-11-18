select department , position , count(*) as  count
from employee
group by department, position
having count = 1