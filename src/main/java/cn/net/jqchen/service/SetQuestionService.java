package cn.net.jqchen.service;

import cn.net.jqchen.model.Backpwd;

public interface SetQuestionService {
    void setQuestion(Backpwd backpwd);
    boolean confirmQuestion(String userAccount);
}
