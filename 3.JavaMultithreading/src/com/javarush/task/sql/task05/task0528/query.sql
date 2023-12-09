select name
from publisher
left join book on publisher.id = book.publisher_id
left join author on book.author_id = author.id
where library.author.full_name =  'Mark Twain'

