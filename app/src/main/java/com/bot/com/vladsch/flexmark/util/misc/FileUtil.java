package com.vladsch.flexmark.util.misc;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/* loaded from: classes.dex */
public class FileUtil {
    public static String getDotExtension(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return (lastIndexOf <= 0 || lastIndexOf <= name.lastIndexOf(File.separatorChar)) ? FlexmarkHtmlConverter.DEFAULT_NODE : name.substring(lastIndexOf);
    }

    public static String getFileContent(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    return sb.toString();
                }
                sb.append(readLine);
                sb.append(SequenceUtils.EOL);
            }
        } catch (IOException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static byte[] getFileContentBytes(File file) {
        try {
            return Files.readAllBytes(file.toPath());
        } catch (IOException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static byte[] getFileContentBytesWithExceptions(File file) {
        return Files.readAllBytes(file.toPath());
    }

    public static String getFileContentWithExceptions(File file) {
        StringBuilder sb = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                inputStreamReader.close();
                fileInputStream.close();
                return sb.toString();
            }
            sb.append(readLine);
            sb.append(SequenceUtils.EOL);
        }
    }

    public static String getNameOnly(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return (lastIndexOf <= 0 || lastIndexOf <= name.lastIndexOf(File.separatorChar)) ? name : name.substring(0, lastIndexOf);
    }

    public static boolean isChildOf(File file, File file2) {
        String path = file.getPath();
        String str = File.separator;
        return Utils.suffixWith(path, str).startsWith(Utils.suffixWith(file2.getPath(), str));
    }

    public static String pathSlash(File file) {
        String path = file.getPath();
        int lastIndexOf = path.lastIndexOf(File.separatorChar);
        return lastIndexOf != -1 ? path.substring(0, lastIndexOf + 1) : FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public static File plus(File file, String str) {
        return new File(file, str);
    }
}
