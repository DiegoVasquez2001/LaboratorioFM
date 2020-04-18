USE db_film_magic;

INSERT INTO alquiler VALUES(default, '2020/04/17', '2020/05/16', 35608077);
INSERT INTO alquiler VALUES(default, '2020/05/18', '2020/06/17', 35608077);

SELECT*FROM cliente;
SELECT*FROM filmaciones;

INSERT INTO pelicula_alquiler VALUES('FILM40355', 1, 25);
INSERT INTO pelicula_alquiler VALUES('FILM40355', 1, 25);
INSERT INTO pelicula_alquiler VALUES('FILM95737', 1, 50);
INSERT INTO pelicula_alquiler VALUES('FILM40355', 2, 100);
INSERT INTO pelicula_alquiler VALUES('FILM95737', 2, 50);

SELECT nombre_cliente, fecha_alquiler, sum(precio_alquiler) FROM pelicula_alquiler
INNER JOIN filmaciones ON filmaciones.id_filme = pelicula_alquiler.fk_filme
INNER JOIN alquiler ON alquiler.id_alquiler = pelicula_alquiler.fk_alquiler
INNER JOIN cliente ON cliente.dpi_cliente = alquiler.fk_cliente
WHERE YEAR(Fecha_alquiler)=2020 
