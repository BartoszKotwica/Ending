USE sklep;

CREATE TABLE IF NOT EXISTS admin (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    first_name VARCHAR(245) NOT NULL,
    last_name VARCHAR(245) NOT NULL,
    email VARCHAR(245) NOT NULL,
    password VARCHAR(60) NOT NULL,
    superadmin TINYINT(1) NOT NULL COMMENT 'Czy użytkownik jest adminem',
    enable TINYINT(1) NOT NULL DEFAULT '1' COMMENT 'Czy jest aktywny i może się logować'
);