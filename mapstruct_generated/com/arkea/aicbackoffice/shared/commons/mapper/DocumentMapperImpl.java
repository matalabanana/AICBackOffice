package com.arkea.aicbackoffice.shared.commons.mapper;

import com.arkea.aicbackoffice.shared.service.bean.client.DocumentBean;

import com.arkea.aicservice.thrift.data.Document;

import java.util.Arrays;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-05-16T09:05:53+0200",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"

)

public class DocumentMapperImpl implements DocumentMapper {

    @Override

    public DocumentBean alimenter(Document req) {

        if ( req == null ) {

            return null;
        }

        DocumentBean documentBean = new DocumentBean();

        if ( req.getContenu() != null ) {

            byte[] contenu = req.getContenu();

            documentBean.setContenu( Arrays.copyOf( contenu, contenu.length ) );
        }

        documentBean.setLibelle( req.getLibelle() );

        documentBean.setDateCreation( req.getDateCreation() );

        return documentBean;
    }

    @Override

    public Document alimenter(DocumentBean req) {

        if ( req == null ) {

            return null;
        }

        Document document = new Document();

        document.setLibelle( req.getLibelle() );

        if ( req.getContenu() != null ) {

            byte[] contenu = req.getContenu();

            document.setContenu( Arrays.copyOf( contenu, contenu.length ) );
        }

        document.setDateCreation( req.getDateCreation() );

        return document;
    }
}

