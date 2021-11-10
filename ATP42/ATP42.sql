-- ATP42
--  Utilize as tabelas criadas durante a atividade prática 41.
--  Insira 3 categorias na tabela categoria.
--  Insira 6 produtos na tabela produto.
--  Altere a descrição de dois produtos.
--  Delete um produto e uma categoria. 
--  Altere uma categoria de um produto.
--  Altere o preço de todos os produtos tirando R$1,00 do preço atual.

drop table produto;
drop table categoria;

create table categoria(
	id int primary key generated always as identity
	,nome varchar(50) not null
	,descricao varchar(50) null
);

create table produto(
	id int generated always as identity
	,nome varchar(50) not null
	,descricao varchar(50) not null
	,codigo int null
	,preco float not null
	,categoria_id int not null
	,constraint fk_categoria foreign key(categoria_id) references categoria(id)
);


insert into categoria(nome, descricao)  values ('eletrodomesticos', 'blalklsdf');
insert into categoria(nome, descricao)  values ('higiene pessoal', 'fsdfdsfsf');
insert into categoria(nome, descricao)  values ('alimentos', 'rtreytrytry');

insert into produto(nome, descricao, preco, categoria_id)
values('microondas', 'dsfsdf', 500, 1);
insert into produto(nome, descricao, preco, categoria_id)
values('geladeira', 'dsfsdf', 1500, 1);

insert into produto(nome, descricao, preco, categoria_id)
values('barbeador', 'uoiuitrtor', 200, 2);
insert into produto(nome, descricao, preco, categoria_id)
values('sabonete', 'uoiieoreio', 4, 2);

insert into produto(nome, descricao, preco, categoria_id)
values('camarao', 'kljljgfkg', 100, 3);
insert into produto(nome, descricao, preco, categoria_id)
values('carne', 'kljlkjlj', 50, 3);


update produto 
	set
		descricao = 'promocao'
	where 
		id < 3;
	
	
delete from produto 
	where id = 6 or id=5;

	
delete from categoria 
	where id = 3;
	

update produto 
	set
		categoria_id = 2
	where 
		id = 1;

update produto 
	set
		preco = preco - 1;