INSERT INTO pizza (image_url, name, price, category, rating)
VALUES ('https://dodopizza.azureedge.net/static/Img/Products/f035c7f46c0844069722f2bb3ee9f113_584x584.jpeg',
        'Пепперони Фреш с перцем', 803, 0, 4),
       ('https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/2ffc31bb-132c-4c99-b894-53f7107a1441.jpg',
        'Сырная', 245, 1, 6),
       ('https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/6652fec1-04df-49d8-8744-232f1032c44b.jpg',
        'Цыпленок барбекю', 295, 1, 4),
       ('https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/af553bf5-3887-4501-b88e-8f0f55229429.jpg',
        'Кисло-сладкий цыпленок', 275, 2, 2),
       ('https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/b750f576-4a83-48e6-a283-5a8efb68c35d.jpg',
        'Чизбургер-пицца', 415, 3, 8),
       ('https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/1e1a6e80-b3ba-4a44-b6b9-beae5b1fbf27.jpg',
        'Крэйзи пепперони', 580, 2, 2),
       ('https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/d2e337e9-e07a-4199-9cc1-501cc44cb8f8.jpg',
        'Пепперони', 675, 1, 9),
       ('https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/d48003cd-902c-420d-9f28-92d9dc5f73b4.jpg',
        'Маргарита', 450, 4, 10),
       ('https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/ec29465e-606b-4a04-a03e-da3940d37e0e.jpg',
        'Четыре сезона', 395, 0, 10),
       ('https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/30367198-f3bd-44ed-9314-6f717960da07.jpg',
        'Овощи и грибы 🌱', 285, 1, 7);

INSERT INTO type (name) VALUES ('тонкое'), ('традиционное');

INSERT INTO size (id) VALUES (26), (30), (40);

INSERT INTO pizza_type(pizza_id, type_id) VALUES (1, 1), (1, 2), (2, 1), (3, 1), (4, 2), (5, 1), (5, 2), (6, 1),
                                                 (7, 1), (7, 2), (8, 1), (8, 2), (9, 1), (9, 2), (10, 1), (10, 2);

INSERT INTO pizza_size(pizza_id, size_id) VALUES (1, 26), (1, 30), (1, 40), (2, 26), (2, 40), (3, 26), (3, 40),
                                                 (4, 26), (4, 30), (4, 40), (5, 26), (5, 30), (5, 40),
                                                 (6, 30), (6, 40), (7, 26), (7, 30), (7, 40),
                                                 (8, 26), (8, 30), (8, 40), (9, 26), (9, 30), (9, 40),
                                                 (10, 26), (10, 30), (10, 40);