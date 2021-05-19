package com.guigu.tian.controller.hesijie;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@CrossOrigin
public class Files {

    @RequestMapping(value = "/files")
    @ResponseBody
    public void uplodafil(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {


        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        // 判断表单的提交内容方式是否支持文件上传
        if(!ServletFileUpload.isMultipartContent(request))
            throw new RuntimeException("当前请求不支持文件上传");

        // 以下是文件上传的主要代码
        // 1. 上传文件用到的两个工具类
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload sfu = new ServletFileUpload(factory);

        // 2. 设置相关参数
        // 设置上传的单个文件的大小
        sfu.setFileSizeMax(1024*10000);
        // 设置上传的总文件的大小
        sfu.setSizeMax(1024*20000);

        try {
            // 3. 通过请求解析出表单项
            List<FileItem> fileItems = sfu.parseRequest(request);

            for(FileItem item: fileItems) {
                if(item.isFormField()) // 非文件项
                    handleFormFiled(item);
                else // 文件项
                    handleFileField(item);
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }


    }
    private void handleFormFiled(FileItem item) {}

    private void handleFileField(FileItem item) {
        // 上传文件的内容类型
        String type = item.getContentType();
        if(!type.startsWith("image")){
            try {
                System.out.println(item.getString("utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return;
        }

        String name = item.getName();

        System.out.println("图片名字"+name);
        // 上传文件的名字
        String fileName = item.getName();  //  -----------不生成唯一名字
        // 后缀名
//        String extendName = fileName.substring(fileName.lastIndexOf("."));
//        // 生成UUID   唯一
//        UUID uuid = UUID.randomUUID();
//        String newFileName = uuid.toString()+extendName;
//          System.out.println(newFileName+"===========");

        // 创建一个存放文件指定的目录，要求是按照日期命名
//        Date da=new Date();
//        SimpleDateFormat sim=new SimpleDateFormat("yyy-mm-dd");
//        String format = sim.format(da);

        //System.out.println(format+"====");


//        java.io.File fi=new java.io.File("D:\\项目\\后端webpack\\webpack\\tian_web\\src\\main\\webapp\\img",format);
      //  if(!fi.isFile()){ //判断是否有该文件包
         //   fi.mkdir(); //没有就创建一个    //不使用时间文件夹
            try {
                java.io.File fil=new java.io.File("D:\\vueS3项目\\tiantianback\\tian_web\\src\\main\\webapp\\shanghu",fileName);

                item.write(fil);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

       // }
    }
}
