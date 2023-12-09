select isbn , title
from book
left join author on book.author_id = author.id
where library.author.last_name like 'S%'
