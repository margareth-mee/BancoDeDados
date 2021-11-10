--  Utilize as tabelas criadas durante a ATP41 e os registros criados durante a ATP42.
--  Liste todos os dados de todas as colunas da tabela Categoria.
--  Liste todos os dados de todas as colunas da tabela Produto.
--  Liste os dados de todas as colunas da tabela Categoria, 
--  para as linhas que possuam uma descrição preenchida.
--  Liste os dados das colunas Id, nome e preço da tabela Produto, 
--  para as linhas que possuem um nome iniciando com C.


select * from produto;
select * from categoria;

select * from categoria where descricao != ''

select 
	nome
	,preco
from produto
where nome like 'c%';
