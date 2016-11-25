package com.stomhong.util;

import android.os.Environment;
import android.os.StatFs;

import java.io.File;

/**
 * @author StomHong on 2016/9/22.
 */

public class SDCardUtil {
    private SDCardUtil() {
        throw new UnsupportedOperationException("cannot e instantiated");
    }

    /**
     * 判断SDCard是否可用
     *
     * @return
     */
    public static boolean isSDCardEnable() {
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }

    /**
     * 获取SDCard路径
     *
     * @return
     */
    public static String getSDCardPath() {
        return Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator;
    }

    /**
     * 获取SDCard的剩余容量 单位byte
     *
     * @return
     */
    public static long getSDCardAllSize() {
        if (isSDCardEnable()) {
            StatFs statFs = new StatFs(getSDCardPath());
            //获取空闲的数据块的数量
            long availableBlocks = statFs.getAvailableBlocks() - 4;
            //获取单个数据块的大小（byte）
            long freeBlocks = statFs.getAvailableBlocks();
            return freeBlocks * availableBlocks;
        }
        return 0;
    }

    /**
     *  
     *  获取指定路径所在空间的剩余可用容量字节数，单位byte 
     *   
     *  @param filePath 
     *  @return 容量字节 SDCard可用空间，内部存储可用空间 
     */
    public static long getFreeBytes(String filePath) {
        // 如果是sd卡的下的路径，则获取sd卡可用容量  
        if (filePath.startsWith(getSDCardPath())) {
            filePath = getSDCardPath();
        } else {// 如果是内部存储的路径，则获取内存存储的可用容量  
            filePath = Environment.getDataDirectory().getAbsolutePath();
        }
        StatFs stat = new StatFs(filePath);
        long availableBlocks = (long) stat.getAvailableBlocks() - 4;
        return stat.getBlockSize() * availableBlocks;
    }

    /**
     * 获取系统存储路径
     * @return
     */
    public static String getRootDirectoryPath(){
        return Environment.getRootDirectory().getAbsolutePath();
    }

    /**
     * @param fileName      文件名
     * @param extensionName 扩展名
     * @param path          文件存储路径
     */
    public static void save(String fileName, String extensionName, String path) {
        if (fileName == null) {
            throw new RuntimeException("文件名不能为空！");
        }
        if (extensionName == null) {
            throw new RuntimeException("文件扩展名不能为空！");
        }

    }
}
