1.  **test** veritabanınızda **employee** isimli sütun bilgileri **id(INTEGER)**, **name VARCHAR(50)**, **birthday DATE**, **email VARCHAR(100)** olan bir tablo oluşturalım.
```sql
CREATE TABLE employee(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100),
);
```
2.  Oluşturduğumuz **employee** tablosuna '[Mockaroo](https://www.mockaroo.com/)' servisini kullanarak 50 adet veri ekleyelim.
```sql
insert into employee (name, birthday, email) values ('Sybille Colebourn', '2003-01-07', 'scolebourn0@freewebs.com');
insert into employee (name, birthday, email) values ('Rossy de Tocqueville', '1993-12-03', 'rde1@google.com.br');
insert into employee (name, birthday, email) values ('Zacharie Lambshine', '2000-02-17', 'zlambshine2@ebay.com');
insert into employee (name, birthday, email) values ('Sabra Cowans', '2012-03-29', 'scowans3@yandex.ru');
insert into employee (name, birthday, email) values ('Roland Kruschov', '2015-03-16', 'rkruschov4@meetup.com');
insert into employee (name, birthday, email) values ('Whitney Kordovani', '2000-07-27', 'wkordovani5@amazon.co.uk');
insert into employee (name, birthday, email) values ('Helena Gallichiccio', '2000-04-23', 'hgallichiccio6@unesco.org');
insert into employee (name, birthday, email) values ('Bidget Ellaman', '2016-10-01', 'bellaman7@ow.ly');
insert into employee (name, birthday, email) values ('Larina Dicty', '2018-08-26', 'ldicty8@hexun.com');
insert into employee (name, birthday, email) values ('Allx Eskriett', '1999-05-28', 'aeskriett9@indiegogo.com');
insert into employee (name, birthday, email) values ('Hailey Punchard', '2010-08-24', 'hpuncharda@earthlink.net');
insert into employee (name, birthday, email) values ('Katya Garaghan', '2008-08-22', 'kgaraghanb@hao123.com');
insert into employee (name, birthday, email) values ('Tildy Darben', '2008-04-06', 'tdarbenc@msu.edu');
insert into employee (name, birthday, email) values ('Billye Bootyman', '2013-06-22', 'bbootymand@topsy.com');
insert into employee (name, birthday, email) values ('Marley Bigadike', '2007-04-06', 'mbigadikee@surveymonkey.com');
insert into employee (name, birthday, email) values ('Almeria Grinnell', '2000-12-18', 'agrinnellf@ucla.edu');
insert into employee (name, birthday, email) values ('Jacqueline Conahy', '1993-05-24', 'jconahyg@cornell.edu');
insert into employee (name, birthday, email) values ('Wainwright Bushell', '1993-03-18', 'wbushellh@sitemeter.com');
insert into employee (name, birthday, email) values ('Izzy O''Sherin', '2002-05-28', 'iosherini@ustream.tv');
insert into employee (name, birthday, email) values ('Osbourn Guerrieri', '2017-09-30', 'oguerrierij@typepad.com');
insert into employee (name, birthday, email) values ('Ryan Delepine', '1998-12-11', 'rdelepinek@ezinearticles.com');
insert into employee (name, birthday, email) values ('Benedicto Dovington', '2000-09-11', 'bdovingtonl@weather.com');
insert into employee (name, birthday, email) values ('Constantia Bickell', '1991-02-05', 'cbickellm@github.io');
insert into employee (name, birthday, email) values ('Josephine Cuningham', '2016-12-11', 'jcuninghamn@microsoft.com');
insert into employee (name, birthday, email) values ('Rad Sille', '1995-01-01', 'rsilleo@sphinn.com');
insert into employee (name, birthday, email) values ('Cammy Haston', '2013-03-12', 'chastonp@china.com.cn');
insert into employee (name, birthday, email) values ('Gabriela Manhood', '2008-10-20', 'gmanhoodq@va.gov');
insert into employee (name, birthday, email) values ('Marietta Rendbaek', '1992-01-20', 'mrendbaekr@twitter.com');
insert into employee (name, birthday, email) values ('Benedick Robuchon', '2008-10-10', 'brobuchons@goo.gl');
insert into employee (name, birthday, email) values ('Enrika Drinkeld', '2011-05-11', 'edrinkeldt@china.com.cn');
insert into employee (name, birthday, email) values ('Jaquelyn Pleasants', '1990-10-07', 'jpleasantsu@about.me');
insert into employee (name, birthday, email) values ('Hyatt Hamfleet', '2017-09-30', 'hhamfleetv@miitbeian.gov.cn');
insert into employee (name, birthday, email) values ('Curcio Biscomb', '2009-04-11', 'cbiscombw@gravatar.com');
insert into employee (name, birthday, email) values ('Devina Domingues', '2008-02-15', 'ddominguesx@fema.gov');
insert into employee (name, birthday, email) values ('Vallie Collingham', '1997-07-07', 'vcollinghamy@plala.or.jp');
insert into employee (name, birthday, email) values ('Erica Startin', '1990-09-13', 'estartinz@harvard.edu');
insert into employee (name, birthday, email) values ('Beverly Brooksbie', '2017-01-09', 'bbrooksbie10@pagesperso-orange.fr');
insert into employee (name, birthday, email) values ('Alec Ygou', '2011-02-13', 'aygou11@sitemeter.com');
insert into employee (name, birthday, email) values ('Cathie Gabitis', '2020-06-03', 'cgabitis12@columbia.edu');
insert into employee (name, birthday, email) values ('Arluene Rallin', '1998-06-22', 'arallin13@oakley.com');
insert into employee (name, birthday, email) values ('Danika Dabner', '2000-08-12', 'ddabner14@shutterfly.com');
insert into employee (name, birthday, email) values ('Northrop Stuther', '1991-11-24', 'nstuther15@360.cn');
insert into employee (name, birthday, email) values ('Ariela Culwen', '2000-07-11', 'aculwen16@digg.com');
insert into employee (name, birthday, email) values ('Janaya Rabjohns', '2021-03-11', 'jrabjohns17@apple.com');
insert into employee (name, birthday, email) values ('Bevan Erik', '2020-08-02', 'berik18@google.com');
insert into employee (name, birthday, email) values ('Orlando Glendzer', '1991-03-14', 'oglendzer19@scientificamerican.com');
insert into employee (name, birthday, email) values ('Lorine Grumbridge', '2021-03-10', 'lgrumbridge1a@liveinternet.ru');
insert into employee (name, birthday, email) values ('Hashim McNalley', '2004-11-23', 'hmcnalley1b@who.int');
insert into employee (name, birthday, email) values ('Casi Renyard', '2010-04-08', 'crenyard1c@vkontakte.ru');
insert into employee (name, birthday, email) values ('Tobye Nowakowski', '2006-06-23', 'tnowakowski1d@google.pl');
```
3.  Sütunların her birine göre diğer sütunları güncelleyecek 5 adet **UPDATE** işlemi yapalım.
```sql
UPDATE employee
SET name = 'Ali',
	birthday = '1990-01-01',
	email = 'ali@ali.com'
WHERE id = 13;

UPDATE employee
SET birthday = '1955-10-10',
	email = 'sabra@sabra.com'
WHERE name = 'Sabra Cowans';

UPDATE employee
SET name = 'Veli',
	email = 'veli@veli.com'
WHERE birthday > '2020-01-01';

UPDATE employee
SET name = 'Orhan',
	birthday = '1989-01-01'
WHERE email = 'rde1@google.com.br';

UPDATE employee
SET name = 'ABC',
	birthday = '1900-01-01'
WHERE name LIKE '%n%n%';
```
4.  Sütunların her birine göre ilgili satırı silecek 5 adet **DELETE** işlemi yapalım.
```sql
DELETE FROM employee
WHERE id = 5;

DELETE FROM employee
WHERE name = 'Larina Dicty';

DELETE FROM employee
WHERE birthday = '1997-07-07';

DELETE FROM employee
WHERE email = 'bellaman7@ow.ly';

DELETE FROM employee
WHERE id > 25;
```
