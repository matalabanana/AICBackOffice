package com.arkea.aicbackoffice.shared.commons.mapper;

import com.arkea.aicbackoffice.shared.service.bean.MiseAJourRequestBean;

import com.arkea.aicbackoffice.shared.service.bean.MiseAJourResponseBean;

import com.arkea.aicservice.thrift.data.Document;

import com.arkea.aicservice.thrift.data.MiseAJourRequest;

import com.arkea.aicservice.thrift.data.MiseAJourResponse;

import java.util.List;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-05-16T09:05:53+0200",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"

)

public class MiseAJourMapperImpl implements MiseAJourMapper {

    @Override

    public MiseAJourRequest alimenter(MiseAJourRequestBean req) {

        if ( req == null ) {

            return null;
        }

        MiseAJourRequest miseAJourRequest = new MiseAJourRequest();

        miseAJourRequest.setTypeMiseAJour( req.getTypeMiseAJour() );

        miseAJourRequest.setNumeroContrat( req.getNumeroContrat() );

        List<Document> list = map( req.getDocuments() );

        if ( list != null ) {

            miseAJourRequest.setDocuments( list );
        }

        miseAJourRequest.setCommentaire( req.getCommentaire() );

        return miseAJourRequest;
    }

    @Override

    public MiseAJourResponseBean alimenter(MiseAJourResponse req) {

        if ( req == null ) {

            return null;
        }

        MiseAJourResponseBean miseAJourResponseBean = new MiseAJourResponseBean();

        miseAJourResponseBean.setContext( map( req.getContext() ) );

        return miseAJourResponseBean;
    }
}

