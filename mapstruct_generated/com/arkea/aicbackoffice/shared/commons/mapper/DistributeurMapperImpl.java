package com.arkea.aicbackoffice.shared.commons.mapper;

import com.arkea.aicbackoffice.shared.service.bean.client.DistributeurBean;

import com.arkea.aicservice.thrift.data.Distributeur;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-05-16T09:05:53+0200",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"

)

public class DistributeurMapperImpl implements DistributeurMapper {

    @Override

    public DistributeurBean alimenter(Distributeur req) {

        if ( req == null ) {

            return null;
        }

        DistributeurBean distributeurBean = new DistributeurBean();

        distributeurBean.setCodeEfs( req.getCodeEfs() );

        distributeurBean.setCodeDistributeur( req.getCodeDistributeur() );

        distributeurBean.setLibelleDistributeur( req.getLibelleDistributeur() );

        return distributeurBean;
    }

    @Override

    public Distributeur alimenter(DistributeurBean req) {

        if ( req == null ) {

            return null;
        }

        Distributeur distributeur = new Distributeur();

        distributeur.setCodeEfs( req.getCodeEfs() );

        distributeur.setCodeDistributeur( req.getCodeDistributeur() );

        distributeur.setLibelleDistributeur( req.getLibelleDistributeur() );

        return distributeur;
    }
}

