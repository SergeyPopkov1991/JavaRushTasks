select full_name, count(distinct publisher.name) as publishers
from author
         left join book on author.id = book.author_id
         left join publisher on book.publisher_id = publisher.id
group by author.id



