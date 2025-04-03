package me.owtz.sys.domain.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_features")
public class Features extends BaseItens{

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

}