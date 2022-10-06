package com.arkea.aicbackoffice.shared.commons.mapper;

import com.arkea.aicbackoffice.shared.service.bean.RechercheRequestBean;

import com.arkea.aicbackoffice.shared.service.bean.RechercheResponseBean;

import com.arkea.aicbackoffice.shared.service.bean.client.DistributeurBean;

import com.arkea.aicbackoffice.shared.service.bean.client.ScpiBean;

import com.arkea.aicservice.thrift.data.RechercheRequest;

import com.arkea.aicservice.thrift.data.RechercheResponse;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-05-16T09:05:53+0200",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"

)

public class RechercheMapperImpl implements RechercheMapper {

    @Override

    public RechercheRequest alimenter(RechercheRequestBean req) {

        if ( req == null ) {

            return null;
        }

        RechercheRequest rechercheRequest = new RechercheRequest();

        rechercheRequest.setCodeEfs( req.getCodeEfs() );

        return rechercheRequest;
    }

    @Override

    public RechercheResponseBean alimenter(RechercheResponse req) {

        if ( req == null ) {

            return null;
        }

        RechercheResponseBean rechercheResponseBean = new RechercheResponseBean();

        rechercheResponseBean.setContext( context( req.getContext() ) );

        List<DistributeurBean> list = listeDistributeur( req.getListeDistributeur() );

        if ( list != null ) {

            rechercheResponseBean.setListeDistributeur( list );
        }

        List<String> list_ = req.getListeEtat();

        if ( list_ != null ) {

            rechercheResponseBean.setListeEtat(       new ArrayList<String>( list_ )

            );
        }

        List<ScpiBean> list__ = listeScpi( req.getListeScpi() );

        if ( list__ != null ) {

            rechercheResponseBean.setListeScpi( list__ );
        }

        return rechercheResponseBean;
    }
}

