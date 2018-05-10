package cn.net.jqchen.service;

public interface UploadService {
    Integer addPhoto(String account,String name,String note);
    void addDynamic(String account,String text,Integer photoId,Integer videoId);
    Integer addVideo(String account,String name,String note);
}
