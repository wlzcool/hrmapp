package com.zhiguogongfang.hrmapp.service.Impl;

import com.zhiguogongfang.hrmapp.domain.Document;
import com.zhiguogongfang.hrmapp.mapper.DocumentMapper;
import com.zhiguogongfang.hrmapp.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentMapper documentMapper;

    @Override
    public List<Document> findDocument() {
        return null;
    }

    @Override
    public void removeDocumentById(Integer id) {
        documentMapper.deleteById(id);
    }

    @Override
    public Document findDocumentById(Integer id) {
        return documentMapper.selectById(id);
    }

    @Override
    public void addDocument(Document document) {
        documentMapper.save(document);
    }

    @Override
    public void modifyDocument(Document document) {
        documentMapper.update(document);
    }
}
