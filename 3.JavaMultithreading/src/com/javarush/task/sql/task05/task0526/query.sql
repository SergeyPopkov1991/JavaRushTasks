select publication_year, isbn, title, library.author.full_name as author, library.publisher.name as publisher
from book
left join library.author a on book.author_id = a.id
left join library.publisher p on book.publisher_id = p.id

