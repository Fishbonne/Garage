DELETE FROM brand;
DELETE FROM color;
DELETE FROM country;
DELETE FROM cars;

INSERT INTO country (name) VALUES ('Germany');
INSERT INTO country (name) VALUES ('Japan');
INSERT INTO country (name) VALUES ('South Korea');
INSERT INTO country (name) VALUES ('Italy');

INSERT INTO color (name) VALUES ('black');
INSERT INTO color (name) VALUES ('red');
INSERT INTO color (name) VALUES ('silver');
INSERT INTO color (name) VALUES ('white');
INSERT INTO color (name) VALUES ('yellow');

INSERT INTO brand (name) VALUES ('BMW');
INSERT INTO brand (name) VALUES ('Mercedes');
INSERT INTO brand (name) VALUES ('Toyota');
INSERT INTO brand (name) VALUES ('Kia');
INSERT INTO brand (name) VALUES ('Alfa Romeo');

INSERT INTO cars (model, releaseYear, brandId, colorId, countryId) VALUES ('320d', 2016, '1', '1', '1');
INSERT INTO cars (model, releaseYear, brandId, colorId, countryId) VALUES ('200AWD', 2017, '2', '2', '1');
INSERT INTO cars (model, releaseYear, brandId, colorId, countryId) VALUES ('RAV4', 2014, '3', '3', '2');
INSERT INTO cars (model, releaseYear, brandId, colorId, countryId) VALUES ('Ceed', 2012, '4', '4', '3');
INSERT INTO cars (model, releaseYear, brandId, colorId, countryId) VALUES ('4C', 2013, '5', '5', '4');