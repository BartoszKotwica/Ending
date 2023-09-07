USE sklep;

CREATE TABLE IF NOT EXISTS Cart (
                                    id INT AUTO_INCREMENT PRIMARY KEY,
                                    user_id INT NOT NULL,
                                    product_id INT NOT NULL,
                                    quantity INT NOT NULL,
                                    FOREIGN KEY (user_id) REFERENCES user_details(id),
                                    FOREIGN KEY (product_id) REFERENCES items(id)
);