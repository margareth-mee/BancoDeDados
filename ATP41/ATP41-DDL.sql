-- DDL ATP41
-- Utilize o programa DBeaver e o banco de dados postgres para realizar as atividades.
-- Crie uma tabela de Produto com as seguintes colunas: id(identidade e incremental), 
-- nome, descrição, codigo e preço. Todas devem ser de preenchimento obrigatório.

-- Crie uma tabela de Categoria com as seguintes colunas: id(identidade e incremental),
-- nome, descrição. Apenas a coluna descrição deve permitir valores nulos.

-- Crie uma tabela de Carro com as seguintes colunas: id(identidade e incremental), 
-- modelo e marca. Todas devem ser de preenchimento obrigatório.


create table produto(
	id int generated always as identity
	,nome varchar(50) not null
	,descricao varchar(50) not null
	,codigo int null
	,preco float not null
);

create table categoria(
	id int primary key generated always as identity
	,nome varchar(50) not null
	,descricao varchar(50) null
);

create table carro(
	id int generated always as identity
	,modelo varchar(50) not null
	,marca varchar(50) not null
);