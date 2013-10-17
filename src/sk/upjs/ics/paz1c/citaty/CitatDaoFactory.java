package sk.upjs.ics.paz1c.citaty;


import sk.upjs.ics.paz1c.citaty.CitatDao;
import sk.upjs.ics.paz1c.citaty.SuborovyCitatDao;

public enum CitatDaoFactory {
    INSTANCE;
    
    public CitatDao getCitatDao() {
        return new SuborovyCitatDao();
    }
}