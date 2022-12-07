create database ArenaAPP;
use ArenaAPP;

CREATE TABLE usuario (
  id_usuario int NOT NULL AUTO_INCREMENT,
  email varchar(255) NOT NULL,
  nome varchar(255) NOT NULL,
  dataDeNascimento DATE NOT NULL,
  senha varchar(255) NOT NULL,
  sexo enum('M', 'F') NOT NULL,
  cidade varchar(30) NOT NULL,
  descricao varchar(510) default '' NOT NULL,
  posicao_esporte varchar(30) default '' NOT NULL,
  logado BOOLEAN default '0' NOT NULL,
  PRIMARY KEY (id_usuario)
);

select * from usuario;

CREATE TABLE endereco (
   id_endereco int NOT NULL,
   bairro varchar(255) NOT NULL,
   rua varchar(255) NOT NULL,
   numero int NOT NULL,
  PRIMARY KEY (id_endereco)
);


CREATE TABLE equipe (
   id_equipe int NOT NULL AUTO_INCREMENT,
   nome varchar(255) UNIQUE NOT NULL,
   dono int NOT NULL,
   adm int NOT NULL,
   descricao varchar(510) NOT NULL,
   PraticaDom BOOLEAN DEFAULT '0' NOT NULL,
   PraticaSeg BOOLEAN DEFAULT '0' NOT NULL,
   PraticaTer BOOLEAN DEFAULT '0' NOT NULL,
   PraticaQua BOOLEAN DEFAULT '0' NOT NULL,
   PraticaQui BOOLEAN DEFAULT '0' NOT NULL,
   PraticaSex BOOLEAN DEFAULT '0' NOT NULL,
   PraticaSab BOOLEAN DEFAULT '0' NOT NULL,
   linkWhatsapp varchar(300) NOT NULL,
   linkInstagram varchar(300) NOT NULL,
   cidade varchar(30) NOT NULL,
   esporte varchar(30) NOT NULL,
   numDeAtletas int NOT NULL,
   id_jogadores int NOT NULL,
   id_endereco int NOT NULL,
  PRIMARY KEY (id_equipe),
  KEY id_usuario (id_usuario),
  KEY id_endereco (id_endereco),
  CONSTRAINT equipe_ibfk_1 FOREIGN KEY (id_jogadores) REFERENCES usuario (id_jogadores),
  CONSTRAINT equipe_ibfk_2 FOREIGN KEY (id_endereco) REFERENCES endereco (id_endereco),
  CONSTRAINT equipe_ibfk_3 FOREIGN KEY (dono) REFERENCES usuario (id_usuario),
  CONSTRAINT equipe_ibfk_4 FOREIGN KEY (adm) REFERENCES usuario (id_usuario)
);

CREATE TABLE jogadores (
  id_jogadores int auto_increment not null,
  id_usuario int NOT NULL,
  id_equipe int NOT NULL,
  CONSTRAINT listadejogadores_ibfk_1 FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario),
  CONSTRAINT listadejogadores_ibfk_2 FOREIGN KEY (id_equipe) REFERENCES equipe (id_equipe),
  CONSTRAINT PK_listadejogadores PRIMARY KEY (id_equipe)
);

drop database arenaapp;