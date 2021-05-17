package com.guigu.tian.controller.hesijie;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.tian.entity.Shopcangku;
import com.guigu.tian.service.hesijie.Hsj_CangkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("cangku")
public class Hsj_CangkuController {

             @Autowired
             private Hsj_CangkuService hsj_cangkuService;



             @RequestMapping("cangkuShowPage")
             @ResponseBody
             public IPage<Shopcangku> cangkuShow(@RequestParam(defaultValue = "1")Integer pageNo,
                                                 @RequestParam(defaultValue = "5") Integer pageSize,
                                                 Shopcangku shopcangku){
                 QueryWrapper<Shopcangku> wrapper=new QueryWrapper<Shopcangku>();
                 if(!StringUtils.isEmpty(shopcangku.getScname())){
                     wrapper.like("scname",shopcangku.getScname());  // where  name like '%val%'
                 }
                 IPage<Shopcangku> page = hsj_cangkuService.page(new Page<Shopcangku>(pageNo, pageSize), wrapper);
                 return page;
             }

             @RequestMapping("cangkuInsert")
             @ResponseBody
             public String cangkuInsert(@RequestBody Shopcangku shopcangku){
                 boolean save = hsj_cangkuService.save(shopcangku);

                 return save ? "add success" : "add fail";
             }
             @RequestMapping("cangkuQueryId")
             @ResponseBody
             public Shopcangku cangkuQueryId(int scid){
                 Shopcangku byId = hsj_cangkuService.getById(scid);
                 return byId;
             }
             @RequestMapping("cangkuUpdate")
             @ResponseBody
             public String cangkuUpdate(@RequestBody Shopcangku shopcangku){
                  boolean b = hsj_cangkuService.updateById(shopcangku);
                 return b ? "edit success" : "edit fail";
             }

             @RequestMapping("cangkuDeleteId")
             @ResponseBody
             public String cangkuDeleteId(int scid){
                 boolean b = hsj_cangkuService.removeById(scid);
                 return b ? "delete success" : "delete fail";
             }






}
