--  Para os pr�ximos exerc�cios, caso necess�rio, utilize o JOIN para unir as duas tabelas.
--  Liste os dados das colunas Id, nome e pre�o da tabela Produto e os dados id, nome e 
--  descri��o da tabela Categoria para as linhas que possuem um pre�o maior que 0.
--  Liste os dados de todas as colunas da tabela Produto que possuem categoria com Id maior que 2.
--  Liste os dados de todas as colunas da tabela Categoria e o os dados da coluna nome da tabela Produto, 
--  para as categorias que est�o sendo utilizadas por produtos.

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
