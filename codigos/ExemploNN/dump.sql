--  teste para verificar se tudo está ok 
--  SELECT empregado.nome, empregado.id as emp FROM empregado 
--  inner join empregado_projeto on (empregado.id = empregado_projeto.empregado_id) 
--  inner join projeto on (projeto.id = empregado_projeto.projeto_id);
	
-- SELECT projeto.nome as projeto_nome, empregado.nome as empregado_nome, * FROM empregado  inner join empregado_projeto on (empregado.id = empregado_projeto.empregado_id)  inner join projeto on (projeto.id = empregado_projeto.projeto_id); 




-- CREATE TABLE empregado (
-- 	id serial primary key,
-- 	nome text
-- );


-- CREATE TABLE projeto (
-- 	id serial primary key,
-- 	nome text
-- );


-- CREATE TABLE empregado_projeto (
-- 	empregado_id int REFERENCES empregado (id),
-- 	projeto_id int REFERENCES projeto(id),
-- 	primary key (empregado_id, projeto_id)
-- );

-- INSERT INTO empregado (nome) values ('Marcio');
--INSERT INTO projeto (nome) values ('Projeto 3');
-- INSERT INTO empregado_projeto (empregado_id, projeto_id) VALUES (3, 2); -- 3 Marcio, 2 Projeto 2

-- perceba que somente projetos com empregados são mostrados. O Projeto 3 (Recem adicionado não aparece)
-- com right join o problema eh corrigido
-- SELECT projeto.nome as projeto_nome, empregado.nome as empregado_nome, * FROM empregado inner join empregado_projeto on (empregado.id = empregado_projeto.empregado_id) right join projeto on (projeto.id = empregado_projeto.projeto_id) order by projeto.nome 
