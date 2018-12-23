package com.zhiguogongfang.hrmapp.service;

import com.zhiguogongfang.hrmapp.domain.Dept;
import com.zhiguogongfang.hrmapp.domain.Document;

import java.util.List;

public interface DocumentService {
    List<Document> findDocument();
    void removeDocumentById(Integer id);
    Document findDocumentById(Integer id);
    void addDocument(Document document);
    void modifyDocument(Document document);
}
