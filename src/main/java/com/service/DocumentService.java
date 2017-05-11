package com.service;

import com.Entities.Document;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.repository.DocumentRepository;


@Service
@Transactional
public class DocumentService {

    private DocumentRepository DocumentRepository;

    public Document createDocument(Document Document){

        return DocumentRepository.save(Document);
    }

    public Document updateDocument(Document Document){

        return DocumentRepository.findOneById(Document.getId());
    }

    public void deleteDocument(Document Document){

        DocumentRepository.delete(Document);
    }
}
