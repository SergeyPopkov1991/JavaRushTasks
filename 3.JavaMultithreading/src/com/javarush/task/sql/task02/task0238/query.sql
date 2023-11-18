select YEAR(date_of_birth) , MONTH(date_of_birth)
from employee
group by YEAR(date_of_birth), MONTH(date_of_birth)
