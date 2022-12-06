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
  logado TINYINT(1) default '0' NOT NULL,
  PRIMARY KEY (id_usuario)
);

CREATE TABLE endereco (
   id_endereco int NOT NULL,
   bairro varchar(255) NOT NULL,
   rua varchar(255) NOT NULL,
   numero int NOT NULL,
  PRIMARY KEY (id_endereco)
);


CREATE TABLE equipe (
   id_equipe int NOT NULL AUTO_INCREMENT,
   nome varchar(255) NOT NULL,
   dono int NOT NULL,
   administrador int NOT NULL,
   descricao varchar(510) NOT NULL,
   diasDePratica enum('Segunda','Terça','Quarta','Quinta','Sexta','Sábado','Domingo') NOT NULL,
   linkWhatsapp varchar(300) NOT NULL,
   linkInstagram varchar(300) NOT NULL,
   cidade enum('Guanambi','Caitité','Igaporã','Pindaí','Candiba') NOT NULL,
   esporte enum('Futsal','Voleibol','Futebol','Futevolei','Basquete') NOT NULL,
   numDeAtletas int NOT NULL,
   id_usuario int NOT NULL,
   id_endereco int NOT NULL,
  PRIMARY KEY (id_equipe),
  UNIQUE KEY nome (nome),
  UNIQUE KEY dono (dono),
  UNIQUE KEY administrador (administrador),
  KEY id_usuario (id_usuario),
  KEY id_endereco (id_endereco),
  CONSTRAINT equipe_ibfk_1 FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario),
  CONSTRAINT equipe_ibfk_2 FOREIGN KEY (id_endereco) REFERENCES endereco (id_endereco)
);

CREATE TABLE listadejogadores (
   id_usuario int NOT NULL,
  id_equipe int NOT NULL,
  KEY id_usuario (id_usuario),
  KEY id_equipe (id_equipe),
  CONSTRAINT listadejogadores_ibfk_1 FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario),
  CONSTRAINT listadejogadores_ibfk_2 FOREIGN KEY (id_equipe) REFERENCES equipe (id_equipe)
);