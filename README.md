<h1>Desafio Cadastro de pessoas</h1>

<p>Desafio feito em JSF - Primefaces por João Paulo</p>

<h2>Conexão com o banco de dados:</h2>
<p>Você deve ter o PostgreSQL instalado, nele você irá criar um banco de dados com o nome de: bd-cadastro</p>

```
create database bd-cadastro;
```
<h2>Inserindo dados no persistence.xml</h2>
<p>No arquivo persistence.xml voce irá inserir seu usuário e senha do seu PostgreSQL:</p>

```
<property name="javax.persistence.jdbc.user" value="root"/>
<property name="javax.persistence.jdbc.password" value="12345"/>
```

<h2>Executando servidor</h2>
<p>Se você estiver usando o Eclipse ou o Netbeans, apenas basta executar o Servidor Tomcat e acessar o link no navegador:</p>

```
http://localhost:8080/cadastro-pessoas/Cadastro.xhtml
```
