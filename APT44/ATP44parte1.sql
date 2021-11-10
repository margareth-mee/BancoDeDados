--  Utilize as tabelas criadas durante a ATP41 e os registros criados durante a ATP42.
--  Crie uma estrutura de transa��o para executar duas inser��es. Entao, utilize o 
-- conjunto de begin, transaction, commit e end para criar um bloco de instru��es.
--  Dentro do bloco, execute a inser��o de um produto novo e uma categoria nova. 
-- Fa�a com que o produto contenha o id de uma categoria inexistente para que ocorra um erro. 
-- Verifique que nenhum dos dados foi inserido.


begin transaction;
	
	insert into categoria(nome, descricao)  values ('bebidas', 'noanoanoo');

	insert into produto(nome, descricao, preco, categoria_id)
	values('paracentamol', 'glkdgd', 5, 100);

commit; 
end;