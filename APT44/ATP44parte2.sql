--  Crie uma tabela Carros com id, marca e modelo. 
--  Insira dois novos carros dentro desta tabela. 
--  Execute todos os comandos em uma única transação.
--  Crie uma tabela país com id(PK), nome e sigla.
--  Crie uma tabela estado com id(PK), nome, sigla e pais_id(FK);
--  Crie uma tabela cidade com id(PK), nome e estado_id(FK);
--  Adicione um país, um estado e uma cidade. Execute os DDL e DML em uma mesma transação 


begin transaction;

	create table carro(
		id int generated always as identity
		,marca varchar(50) not null
		,modelo varchar(50) not null
	);
	
	insert into carro(marca, modelo) values('VW', 'algum');
	insert into carro(marca, modelo) values('Fiat', 'uno');
	
commit;
end;


begin transaction;

	create table pais(
		id int primary key generated always as identity
		,nome varchar(50) not null
		,sigla varchar(50) not null
	);

	create table estado(
		id int primary key generated always as identity
		,nome varchar(50) not null
		,sigla varchar(50) not null
		,pais_id int not null
		,constraint fk_pais foreign key(pais_id) references pais(id)
	);

	create table cidade(
		id int primary key generated always as identity
		,nome varchar(50) not null
		,estado_id int not null
		,constraint fk_estado foreign key(estado_id) references estado(id)
	);

	insert into pais(nome, sigla) values('Brasil', 'BR');
	insert into estado(nome, sigla, pais_id) values('Paraiba', 'PB', 1);
	insert into cidade(nome, estado_id) values('Campina Grande', 1);
	
commit;
end;

--select * from pais;
--select * from estado;
--select * from cidade;