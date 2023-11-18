select if(YEAR(date_of_birth) < 2000 , 'yes' , 'no') as experienced , MONTH(date_of_birth) as month_of_birth
from employee

