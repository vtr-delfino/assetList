-- noinspection SqlNoDataSourceInspectionForFile

INSERT INTO tb_asset_list (name) VALUES ('Residencial')
INSERT INTO tb_asset_list (name) VALUES ('Não Residencial')

INSERT INTO tb_assets (title, zip_code, address, address_number, description, asset_value, asset_use, img_url) VALUES ('Office', 05061450, 'Rua Cerro Cora', 20, 'Prédio em construção', 10158575.58, 'Residencial', 'https://t3.ftcdn.net/jpg/00/83/92/82/360_F_83928200_mYGZqB0ozTtSS6J5EtW9834mjb5tLW6x.jpg')
INSERT INTO tb_assets (title, zip_code, address, address_number, description, asset_value, asset_use, img_url) VALUES ('MASP', 00000000, 'Avenida Paulista', 726, 'Museu de Arte de São Paulo', 158581589.85, 'Residencial', 'https://as1.ftcdn.net/v2/jpg/03/15/45/86/1000_F_315458621_hJL1tWQvhVgNzrUka9BFk17pFowhUe11.jpg')
INSERT INTO tb_assets (title, zip_code, address, address_number, description, asset_value, asset_use, img_url) VALUES ('Palacio', 00000000, 'Brasilia', 1, 'Palácio do Planalto', 15548658.59, 'Não Residencial', 'https://as1.ftcdn.net/v2/jpg/00/87/62/52/1000_F_87625207_EJYAMDUbhcovXm1frf1g3vTzAlTUHIuL.jpg')
INSERT INTO tb_assets (title, zip_code, address, address_number, description, asset_value, asset_use, img_url) VALUES ('Galpão', 00000000, 'Estrada do Guarujá', 1589, 'Galpão logístico', 15554878.59, 'Não Residencial', 'https://as2.ftcdn.net/v2/jpg/01/04/21/09/1000_F_104210905_Mhags5Md82Sf4axxs4Kx8L4Ux5xb8YhL.jpg')
INSERT INTO tb_assets (title, zip_code, address, address_number, description, asset_value, asset_use, img_url) VALUES ('Loja de Rua', 00000000, 'Avenida Itaquaquecetuba', 98, 'Loja de rua com fachada espelhada', 195878.59, 'Não Residencial', 'https://as2.ftcdn.net/v2/jpg/00/30/43/89/1000_F_30438960_QyTfzStXFvIGynmOmmhqIAqeiXuCS2Ai.jpg')

INSERT INTO tb_belonging (list_id, asset_id, position) VALUES (1, 1, 0)
INSERT INTO tb_belonging (list_id, asset_id, position) VALUES (1, 2, 1)

INSERT INTO tb_belonging (list_id, asset_id, position) VALUES (2, 3, 0)
INSERT INTO tb_belonging (list_id, asset_id, position) VALUES (2, 4, 1)
INSERT INTO tb_belonging (list_id, asset_id, position) VALUES (2, 5, 2)