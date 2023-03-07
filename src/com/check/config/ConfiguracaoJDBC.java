package com.check.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {

    //ATRIBUTOS
    private String jdbcDriver;
    private String dbUrl;
    private String nomeUsuario;
    private String senha;


    //CONSTRUTOR COM DADOS DA CONEZAO DO BANCO H2
    public ConfiguracaoJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:hoteis;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    //MÉTODO REALIZANDO A CONEXÃO
    public Connection conectarComBancoDeDados(){

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(dbUrl, nomeUsuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
