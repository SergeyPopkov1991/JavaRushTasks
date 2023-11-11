SELECT if(age <= 12, 'child', if(age >= 20, 'adult','teenager'))
FROM customers
LIMIT 5
