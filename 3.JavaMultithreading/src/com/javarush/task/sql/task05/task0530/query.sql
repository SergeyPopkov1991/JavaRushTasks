select name, YEAR(discovery_date)  d_year,
            MONTHNAME(discovery_date)  d_month,
            DAYNAME(discovery_date) d_day
from object
