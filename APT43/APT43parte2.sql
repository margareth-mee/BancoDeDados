--  Para os próximos exercícios, caso necessário, utilize o JOIN para unir as duas tabelas.
--  Liste os dados das colunas Id, nome e preço da tabela Produto e os dados id, nome e 
--  descrição da tabela Categoria para as linhas que possuem um preço maior que 0.
--  Liste os dados de todas as colunas da tabela Produto que possuem categoria com Id maior que 2.
--  Liste os dados de todas as colunas da tabela Categoria e o os dados da coluna nome da tabela Produto, 
--  para as categorias que estão sendo utilizadas por produtos.

select 
*
from produto 
where categoria_id > 2;

select 
	p.id as "ProdutoId"
	,p.nome
	,p.descricao
	,p.codigo
	,p.preco
	,c.id as "CategoriaId"
	,c.nome
	,c.descricao
from produto as p
join categoria as c on p.categoria_id = c.id;
