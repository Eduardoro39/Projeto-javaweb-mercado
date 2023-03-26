CREATE TABLE cidade (
    id_cidade serial NOT NULL PRIMARY KEY,
    nome_cidade varchar(300) NOT NULL,
    uf_cidade char(2) NOT NULL
);

CREATE TABLE pessoa (
    id_pessoa serial NOT NULL PRIMARY KEY,
    nome_pessoa varchar(300) NOT NULL,
    email_pessoa varchar(300) NOT NULL UNIQUE,
    senha_pessoa text NOT NULL,
    tipo_pessoa char(1) NOT NULL
);

CREATE TABLE usuario (
    id_usuario serial NOT NULL PRIMARY KEY,
    data_cadastro_usuario date NOT NULL,
    foto_usuario bytea,
    id_pessoa int references pessoa(id_pessoa) on update restrict on delete restrict
);

CREATE TABLE funcionario (
    id_funcionario serial NOT NULL PRIMARY KEY,
    telefone_funcionario varchar(20) NOT NULL,
    endereco_funcionario varchar(300) NOT NULL,
    cep_funcionario varchar(8) NOT NULL,
    id_pessoa int references pessoa(id_pessoa) on update restrict on delete restrict,
    id_cidade int references cidade(id_cidade) on update restrict on delete restrict
);

CREATE TABLE mercadoria (
    id_mercadoria serial NOT NULL PRIMARY KEY,
    nome_mercadoria varchar(300) NOT NULL,
    preco_mercadoria decimal(10, 2),
    tipo_mercadoria varchar(300) NOT NULL,
    foto_mercadoria bytea
);

CREATE TABLE notificacao (
    id_notificacao serial NOT NULL PRIMARY KEY,
    descricao_notificacao varchar(300) NOT NULL,
    data_cadastro_notificacao date NOT NULL
);

CREATE TABLE promocao (
    id_promocao serial NOT NULL PRIMARY KEY,
    porcentagem_promocao varchar(3) NOT NULL,
    id_mercadoria int references mercadoria(id_mercadoria) on update restrict on delete restrict
);