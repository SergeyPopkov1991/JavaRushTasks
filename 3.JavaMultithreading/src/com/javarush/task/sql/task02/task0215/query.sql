SELECT CASE number_of_season
WHEN  1 then 'winter'
WHEN  2 then 'spring'
WHEN  3 then 'summer'
when  4 then 'autumn'
ELSE  'unknown'
end
FROM months

