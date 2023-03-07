package com.check.dao.impl;
import com.check.config.ConfiguracaoJDBC;
import com.check.dao.IDao;
import com.check.model.Filial;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.log4j.Logger;


public class FilialDao implements IDao<Filial> {

    //DECLARANDO A CONEXAO DO BANCO DE DADOS
    private ConfiguracaoJDBC configuracaoJDBC;


    //MÉTODO PARA IMPLEMENTAR A BLIBLIOTECA DO LOG4J
    private final static Logger logger = Logger.getLogger(FilialDao.class);


    //CONSTRUTOR
    public FilialDao(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }


    //MÉTODO PARA SALVAR AS FILAIS DENTRO DE UM ARRAYLIST
    @Override
    public Filial salvar(Filial filial) throws Exception {
        logger.debug("Salvando nova filial: " + filial.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO filial (id, nome_Filial, rua, numero, cidade, estado, is5Estrelas) VALUES " +
                "('%s','%s','%s','%s','%s','%s', '%s')", filial.getId(), filial.getNomeFilial(), filial.getRua(), filial.getNumero(),
                filial.getCidade(), filial.getEstado(), filial.getIs5Estrelas());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next())
                filial.setId(generatedKeys.getInt(1));
                statement.close();
                connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return filial;
    }


}
