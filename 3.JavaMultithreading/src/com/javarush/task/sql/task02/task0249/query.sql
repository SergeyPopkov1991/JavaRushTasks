select department , position , count(*) as 'total'
from employee
where position = 'backend developer'
group by department, position
having total = 1
