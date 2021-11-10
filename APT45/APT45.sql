--  Utilize as tabelas e os registros criados durante a ATP44.
--  Dentro de uma única transação, adicione um páis, 3 estados e 6 cidades.

--  Selecione todas as cidades, seus estados e países. 
-- 	Deve exibir o id da cidade, o nome, o id do estado, o nome do estado, a sigla do estado, o id do país e a sigla do país.
--  Para a atividade do select, utilize: join, alias(as) para as tabelas e colunas para diferenciar as colunas nome e id entre as tabelas.


begin transaction; 

	insert into pais(nome, sigla) values('Brasil', 'BR');

	insert into estado(nome, sigla, pais_id) values('Paraiba', 'PB', 1);
	insert into estado(nome, sigla, pais_id) values('Tocantins', 'TO', 1);
	insert into estado(nome, sigla, pais_id) values('Maranhão', 'MA', 1);

	insert into cidade(nome, estado_id) values('João Pessoa', 2);
	insert into cidade(nome, estado_id) values('Areia', 2);
	insert into cidade(nome, estado_id) values('Augustinopolis', 3);
	insert into cidade(nome, estado_id) values('Xambioá', 3);
	insert into cidade(nome, estado_id) values('Imperatriz', 4);
	insert into cidade(nome, estado_id) values('Sao Luís', 4);
	
commit;
end;


select 
	c.id as "ProdutoId"
	,c.nome
	,e.id as "EstadoId"
	,e.nome
	,e.sigla
	,p.id as "PaísId"
	,p.nome 
	,p.sigla
from cidade as c
join estado as e on c.estado_id = e.id
join pais as p on e.pais_id = p.id
