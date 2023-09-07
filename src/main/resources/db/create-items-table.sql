CREATE TABLE IF NOT EXISTS items(
                        id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(245) NOT NULL COMMENT 'Nazwa przedmiotu',
                        description TEXT COMMENT 'Opis przedmiotu',
                        price INT NOT NULL CHECK ( price > 0 ),
                        quantity INT NOT NULL CHECK ( quantity >=0 ),
                        active BOOLEAN NOT NULL
);