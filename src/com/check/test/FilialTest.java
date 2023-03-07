package com.check.test;
import com.check.config.ConfiguracaoJDBC;
import com.check.dao.impl.FilialDao;
import com.check.model.Filial;
import com.check.service.FilialService;
import org.junit.jupiter.api.Test;


public class FilialTest {

   public FilialService filialService = new FilialService(new FilialDao(new ConfiguracaoJDBC()));

    @Test
    void deveSalvarFiliais () throws Exception {
        Filial filial1 = new Filial(1, "Canabis", "rua jõao da boca", "45B", "SP", "SP", "true");
        filialService.salvar(filial1);

        Filial filial2 = new Filial(2, "Spin", "rua marquinhos oliveira", "15", "SP", "SP", "false");
        filialService.salvar(filial2);

        Filial filial3 = new Filial(3, "Resort", "rua maximiliano", "600", "SP", "SP", "false");
        filialService.salvar(filial3);

        Filial filial4 = new Filial(4, "FocaBrava", "rua sargento geraldo", "100A", "SP", "SP", "true");
        filialService.salvar(filial4);

        Filial filial5 = new Filial(5, "TarzanCipó", "rua interlagos", "40", "SP", "SP", "true");
        filialService.salvar(filial5);
       }


}
