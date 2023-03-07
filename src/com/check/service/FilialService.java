package com.check.service;

import com.check.dao.IDao;
import com.check.model.Filial;


public class FilialService {

    private IDao<Filial> filialIDao;

    public FilialService(IDao<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }

    public Filial salvar(Filial filial) throws Exception {
        filialIDao.salvar(filial);
        return filial;
    }

}
