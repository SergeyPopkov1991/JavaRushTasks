# SELECT if(position = 'manager' AND salary > 10000, 'good',
#           if(position != 'manager' AND salary > 5000, 'good',
#              if(position = 'manager' AND salary <= 10000, 'bad', if(position != 'manager' AND salary <= 5000 , 'bad')))) FROM employee where city = 'London'
SELECT  if(position = 'manager' , if(salary > 10000 , 'good' , 'bad'), if(salary < 5000 , 'good' , 'bad')) from employee where city = 'London'