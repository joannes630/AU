-- 1.
SELECT Author.Name
FROM Author
WHERE Nationality = 'American';

-- 2. 
SELECT COUNT(*)
FROM Book
WHERE PublicationYear > 2020;

-- 3.
SELECT Book.Title, Author.Name
FROM Book
JOIN Author
ON Book.AuthorID = Author.ID;

-- 4.
SELECT Member.Name, Book.Title, Borrowing.DueDate
FROM Borrowing
JOIN Member
ON Borrowing.MemberID = Member.ID
JOIN Book
On Borrowing.ISBN = Book.ISBN
WHERE Borrowing.ReturnDate IS NULL;

-- 5.
SELECT Book.Title
FROM Book
JOIN Author
ON Book.AuthorID = Author.ID
WHERE Author.Nationality = 'Canadian';


