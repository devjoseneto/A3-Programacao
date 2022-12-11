create database if not exists ArenaAPP;
use ArenaAPP;

CREATE TABLE if not exists usuario (
  id_usuario int auto_increment PRIMARY KEY,
  fk_equipe int unique,
  email varchar(255) NOT NULL,
  nome varchar(255) NOT NULL,
  dataDeNascimento DATE NOT NULL,
  senha varchar(255) NOT NULL,
  sexo enum('M', 'F') NOT NULL,
  biografia varchar(510) default '' NOT NULL,
  cidade varchar(30) NOT null,
  logado BOOLEAN default '0' NOT NULL
);

CREATE TABLE if not exists endereco (
   id_endereco int auto_increment primary key,
   bairro varchar(255) NOT NULL,
   rua varchar(255) NOT NULL,
   numero int NOT NULL,
   cidade varchar(30) NOT NULL
);


CREATE TABLE if not exists equipe (
   id_equipe int NOT NULL auto_increment primary KEY,
   nome varchar(255) UNIQUE NOT NULL,
   fk_dono int unique,
   fk_adm int unique,
   descricao varchar(510) default '' NOT NULL,
   PraticaDom BOOLEAN DEFAULT '0' NOT NULL,
   PraticaSeg BOOLEAN DEFAULT '0' NOT NULL,
   PraticaTer BOOLEAN DEFAULT '0' NOT NULL,
   PraticaQua BOOLEAN DEFAULT '0' NOT NULL,
   PraticaQui BOOLEAN DEFAULT '0' NOT NULL,
   PraticaSex BOOLEAN DEFAULT '0' NOT NULL,
   PraticaSab BOOLEAN DEFAULT '0' NOT NULL,
   linkWhatsapp varchar(300) default '' NOT NULL,
   linkInstagram varchar(300) default '' NOT NULL,
   esporte varchar(30) NOT NULL,
   fk_endereco int,
   foreign key (fk_dono) references usuario(id_usuario),
   foreign key (fk_adm) references usuario(id_usuario),
   foreign key (fk_endereco) references endereco(id_endereco)
);

ALTER TABLE usuario ADD CONSTRAINT fk_equipe
FOREIGN KEY(fk_equipe) REFERENCES equipe(id_equipe);

insert into endereco (rua, bairro, numero, cidade) values ('ABC', 'def', '1', 'Guanambi') return id_endereco;
select id_endereco from endereco;
insert into equipe (nome, descricao, fk_dono, PraticaDom, PraticaSeg, PraticaTer, PraticaQua, PraticaQui, PraticaSex, PraticaSab, esporte, fk_endereco)
values ('Admin Team 2', 'a', '1', 0, 1, 1, 1, 1, 1, 0, 'futebol', '1');
select * from endereco;
select * from equipe;
select * from equipe WHERE nome = '';
select * from usuario;
select * from endereco WHERE id_endereco = 1;
select * from equipe WHERE nome = ('Admin FC');
select id_endereco from endereco where rua = 'ADM STREET' and bairro = 'CENTRO' and numero = 1 and cidade = 'Guanambi-BA';

alter table usuario
CHANGE descricao biografia  varchar(510);

desc usuario;
drop database arenaapp; 

update usuario set biografia = 'Oi, eu sou o José' where id_usuario = 1;
update usuario
set nome = 'Admin 001',
email = 'admin@gmail.com',
dataDeNascimento = '2000-01-01',
senha = '12345678',
sexo = 'F',
biografia = 'Admin',
cidade = 'Igaporã-BA'
where id_usuario = 1;

update Equipe
set nome = 'Admin 001',
descricao = 'Equipe de Volei',
PraticaDom = '1',
PraticaSeg = '1',
PraticaTer = '1',
PraticaQua = '1',
PraticaQui = '1',
PraticaSex = '1',
PraticaSab = '1',
esporte = 'Volei'
where id_equipe = 2;

update endereco
set rua = '',
bairro = '',
numero = '10',
cidade = 'Caetite-BA'
where id_endereco = '2';