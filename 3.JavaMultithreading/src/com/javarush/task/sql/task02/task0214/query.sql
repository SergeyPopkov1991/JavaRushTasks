SELECT CASE
    WHEN experience < 1 then 'junior'
    WHEN experience < 3 then 'middle'
    WHEN experience < 5 then 'senior'
    end
from developers
