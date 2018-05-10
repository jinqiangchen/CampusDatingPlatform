package cn.net.jqchen.service.impl;

import cn.net.jqchen.dao.DynamicMapper;
import cn.net.jqchen.dao.PhotoMapper;
import cn.net.jqchen.dao.VideoMapper;
import cn.net.jqchen.model.*;
import cn.net.jqchen.service.UploadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class UploadServiceImpl implements UploadService{
    @Resource
    private DynamicMapper dynamicMapper;
    @Resource
    private PhotoMapper photoMapper;
    @Resource
    private VideoMapper videoMapper;
    @Override
    public Integer addPhoto(String account, String name, String note) {
        Photo photo=new Photo();
        photo.setOwerId(account);
        photo.setPhotoName(name);
        String url="/pic/"+name;
        photo.setPhotoUrl(url);
        photo.setPhotoNote(note);
        java.util.Date datetime=new java.util.Date();
        //Date registTime=new Date(datetime.getTime());
        java.sql.Timestamp creatTime=new Timestamp(datetime.getTime());
        photo.setCreateTime(creatTime);
        photoMapper.insertSelective(photo);
        PhotoExample example=new PhotoExample();
        PhotoExample.Criteria criteria=example.createCriteria();
        criteria.andOwerIdEqualTo(account).andPhotoNameEqualTo(name);
        List<Photo> list=photoMapper.selectByExample(example);
        if(list!=null||list.size()!=0)
            return list.get(0).getPhotoId();
        else {
        return  0;
            }
    }

    @Override
    public void addDynamic(String account,String text,Integer photoId,Integer videoId) {
        Dynamic dynamic=new Dynamic();
        dynamic.setPublisherId(account);
        dynamic.setText(text);
        if(photoId!=0){ dynamic.setPhotoId(photoId);}
        if(videoId!=0){ dynamic.setVideoId(videoId);}
        java.util.Date datetime=new java.util.Date();
        //Date registTime=new Date(datetime.getTime());
        java.sql.Timestamp creatTime=new Timestamp(datetime.getTime());
        dynamic.setCreateTime(creatTime);
        dynamicMapper.insertSelective(dynamic);
    }

    @Override
    public Integer addVideo(String account, String name, String note) {
        Video video=new Video();
        video.setOwerId(account);
        video.setVideoName(name);
        String url="/video/"+name;
        video.setVideoUrl(url);
        video.setVideoNote(note);
        java.util.Date datetime=new java.util.Date();
        //Date registTime=new Date(datetime.getTime());
        java.sql.Timestamp creatTime=new Timestamp(datetime.getTime());
        video.setCreateTime(creatTime);
        videoMapper.insertSelective(video);
        VideoExample example=new VideoExample();
        VideoExample.Criteria criteria=example.createCriteria();
        criteria.andOwerIdEqualTo(account).andVideoNameEqualTo(name);
        List<Video> list=videoMapper.selectByExample(example);
        if(list!=null||list.size()!=0)
            return list.get(0).getVideoId();
        else {
            return  0;
        }
    }
}
