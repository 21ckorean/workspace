CREATE TABLE products (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    category VARCHAR(20),
    price INT,
    stock_quantity INT,
    expiry_date DATE,
    supplier_id INT
);

INSERT INTO products VALUES 
(1, '초코우유', '음료', 1500, 10, '2025-12-31', 101),
(2, '삼각김밥', '간편식', 1200, 5, '2025-01-15', 102),
(3, '생수', '음료', 800, 50, NULL, 101),
(4, '컵라면', '간편식', 1800, 0, '2026-05-20', NULL),
(5, '감자칩', '과자', 2500, 15, '2026-01-10', 103),
(6, '콜라', '음료', 2000, 20, '2025-11-20', 101),
(7, '샌드위치', '간편식', 3200, 2, '2025-01-12', 102),
(8, '껌', '과자', 500, NULL, NULL, 104);


SELECT * FROM products;

#난이도 하 
#1.
SELECT NAME AS '상품명', PRICE AS '판매가'
FROM products;

#2.
SELECT *
FROM products
WHERE CATEGORY = '음료';

#3.
SELECT NAME
FROM products
WHERE PRICE <= 1000;

#4.
SELECT NAME
FROM products
WHERE STOCK_QUANTITY = NULL;

#5
SELECT *
FROM products
WHERE ID IN (1, 3, 5);

#
