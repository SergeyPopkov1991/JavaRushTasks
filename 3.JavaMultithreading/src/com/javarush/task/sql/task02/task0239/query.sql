select YEAR(date_of_birth) , MONTH(date_of_birth)
from employee
# where MONTH(date_of_birth)  = 1  or MONTH(date_of_birth) = 2 or MONTH(date_of_birth) = 12
where MONTH(date_of_birth) in (1,2,12)