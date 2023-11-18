select department , position , count(*) as total
from employee
where position = 'frontend developer'
group by department, position
having  total > 1
limit 1
