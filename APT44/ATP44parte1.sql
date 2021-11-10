--  Utilize as tabelas criadas durante a ATP41 e os registros criados durante a ATP42.
--  Crie uma estrutura de transação para executar duas inserções. Entao, utilize o 
-- conjunto de begin, transaction, commit e end para criar um bloco de instruções.
--  Dentro do bloco, execute a inserção de um produto novo e uma categoria nova. 
-- Faça com que o produto contenha o id de uma categoria inexistente para que ocorra um erro. 
-- Verifique que nenhum dos dados foi inserido.


begin transaction;
	
	insert into categoria(nome, descricao)  values ('bebidas', 'noanoanoo');

	insert into produto(nome, descricao, preco, categoria_id)
	values('paracentamol', 'glkdgd', 5, 100);

commit; 
end;