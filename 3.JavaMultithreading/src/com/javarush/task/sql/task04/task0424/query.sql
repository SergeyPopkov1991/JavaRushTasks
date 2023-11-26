select name , position
from employee
where  dayofyear(date_of_birth) between 1 and 200
