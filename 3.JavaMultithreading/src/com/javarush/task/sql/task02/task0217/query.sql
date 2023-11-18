SELECT CASE
WHEN euro > 5 THEN 'best'
WHEN euro = 5 THEN 'good'
ELSE 'bad'
end
FROM cars
where prod_year > 2020
order by price
LIMIT 5

