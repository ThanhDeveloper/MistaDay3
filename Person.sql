Create table Person (
PersonId int,
LastName nvarchar(50),
FirstName nvarchar(50),
Address nvarchar(50)
)
select * from Person
insert into Person(PersonId,LastName,FirstName,Address) values(1,'Nguyen','Duy Loc','222 tran cao van')
insert into Person(PersonId,LastName,FirstName,Address) values(2,'Tran','Minh Chien','234 Le Duan')
insert into Person(PersonId,LastName,FirstName,Address) values(3,'Phan','Van Dinh','234 Nguyen Van Linh')
