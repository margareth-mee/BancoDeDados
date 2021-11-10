--  Adicione duas novas colunas em carro. As colunas devem ser: chassi e ano.
--	As duas colunas devem ser de preenchimento obrigatório. 
--	Remove a coluna códido, da tabela Produto.
--	Delete a tabela Carro.
--  Adicione uma nova coluna na tabela Produto. A coluna deve ser o id da categoria e não deve permitir nulos.
--  Adicione uma constraint a coluna id de categoria da tabela Produto. A constraint deve ser uma Foreign Key para a coluna Id, da tabela Categoria.

alter table carro
add column chassi varchar(200) not null,
add column ano int not null;

alter table produto 
drop column codigo;

drop table carro;

alter table produto
add column categoria_id int not null,
add constraint fk_categoria foreign key(categoria_id) references categoria(id);
