package pl.newbies.doorcodes;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by adidaser1 on 11.12.2017.
 */

@Entity
public class Gate {

    @Id
    private Long id;


    public String name;
    public String code;
    @Generated(hash = 2120593570)
    public Gate(Long id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
    @Generated(hash = 833346218)
    public Gate() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }

//TODO stworzyc creata

    public void create() {
        DaoSession daoSession = (App.getInstance()).getDaoSession();
        GateDao gateDao = daoSession.getGateDao();
        Gate gate = new Gate();
        gate.name = this.name;
        gate.code = this.code;
        gateDao.save(gate);

    }
}