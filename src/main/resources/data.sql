INSERT INTO pizza (image_url, name, price, category, rating)
VALUES ('https://dodopizza.azureedge.net/static/Img/Products/f035c7f46c0844069722f2bb3ee9f113_584x584.jpeg',
        'Пепперони Фреш с перцем', 803, 0, 4),
       ('https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/2ffc31bb-132c-4c99-b894-53f7107a1441.jpg',
        'Сырная', 245, 1, 6);

INSERT INTO type (name) VALUES ('тонкое'), ('традиционное');

INSERT INTO size (id) VALUES (26), (30), (40);

INSERT INTO pizza_type(pizza_id, type_id) VALUES (1, 1), (1, 2), (2, 1);

INSERT INTO pizza_size(pizza_id, size_id) VALUES (1, 26), (1, 30), (1, 40), (2, 26), (2, 40);