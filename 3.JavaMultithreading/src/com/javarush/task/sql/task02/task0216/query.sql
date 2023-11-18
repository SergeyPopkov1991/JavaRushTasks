SELECT  CASE
WHEN position ='backend developer ' then 'yes'
WHEN position = 'frontend developer' then 'yes'
ELSE 'no'
end
FROM employee
where department = 'cool devs'



