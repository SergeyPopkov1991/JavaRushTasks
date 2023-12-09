select concat(number , ', ' , name) as full_name
from lego_set
order by length(name) asc

