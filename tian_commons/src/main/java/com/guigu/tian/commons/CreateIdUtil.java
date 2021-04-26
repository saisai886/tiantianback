package com.guigu.tian.commons;


import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 生成ID工具类
 */
public class CreateIdUtil {


    //生成ID方法   check为选择哪种类型的ID 100、200、201
    //sqlId 为数据库查询返回的最后一条ID （按时间排的时间为最后的）
    public  static  String  createid(String check,String sqlId){

        String retrunvalue="";
        String  value=check.substring(0,3);
        String xuanze="";

        switch (value){
            //注意100情况下check值不需要加后面6位流水号
            case "100":

                if (sqlId.equals("")){
                    retrunvalue=check+"000001";
                }else {
                    String oneshujuku = sqlId;
                    String fanzhuan = oneshujuku.substring(oneshujuku.length() - 6, oneshujuku.length());
                    int parseInt = Integer.parseInt(fanzhuan);
                    if (String.valueOf(parseInt).length() == 1) {
                        retrunvalue = check + "00000" + (Integer.parseInt(fanzhuan) + 1);
                    }
                    if (String.valueOf(parseInt).length() == 2) {
                        retrunvalue = check + "0000" + (Integer.parseInt(fanzhuan) + 1);
                    }
                    if (String.valueOf(parseInt).length() == 3) {
                        retrunvalue = check + "000" + (Integer.parseInt(fanzhuan) + 1);
                    }
                    if (String.valueOf(parseInt).length() == 4) {
                        retrunvalue = check + "00" + (Integer.parseInt(fanzhuan) + 1);
                    }
                    if (String.valueOf(parseInt).length() == 5) {
                        retrunvalue = check + "0" + (Integer.parseInt(fanzhuan) + 1);
                    }
                    if (String.valueOf(parseInt).length() == 6) {
                        retrunvalue = check + (Integer.parseInt(fanzhuan) + 1);
                    }
                }
                break;
            case "200":
                //数据库操作返回最近的序列号数
                xuanze="200";
                retrunvalue = panduan(sqlId,xuanze);
                break;
            case "201":
                xuanze="201";
                retrunvalue=panduan(sqlId,xuanze);
                break;
            case "300":
                xuanze="300";
                retrunvalue=panduan(sqlId,xuanze);
                break;
            case "301":
                xuanze="301";
                retrunvalue=panduan(sqlId,xuanze);
                break;
            case "400":
                xuanze="400";
                retrunvalue=panduan(sqlId,xuanze);
                break;
            case "401":
                xuanze="401";
                retrunvalue=panduan(sqlId,xuanze);
                break;
            case "402":
                xuanze="402";
                retrunvalue=panduan(sqlId,xuanze);
                break;
        }
        return retrunvalue;
    }

    //100除外的数据处理方法
    public  static String  panduan(String zhi,String xuanze) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date now = new Date();
        String format = simpleDateFormat.format(now);

        if (zhi.equals("")) {
            return xuanze + format + "0001";
        } else {
            String datesubstr = format.substring(0, 6);
            String zhisubstr = zhi.substring(3, 9);
            if (datesubstr.equals(zhisubstr)) {
                long shu = Long.parseLong(zhi) + 1;
                String newzhi = String.valueOf(shu);
                return xuanze + format + newzhi.substring(newzhi.length() - 4, newzhi.length());
            } else {
                return xuanze + format + "0001";
            }
        }

    }

}
