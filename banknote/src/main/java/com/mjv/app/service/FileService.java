package com.mjv.app.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileService {

    public List<String> readFile(String fileName) {
        File f = new File(fileName);
        try {
            if (!f.exists())
                f.createNewFile();

            List<String> fileContent = new ArrayList<String>();
            String lineContent = null;
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()) {
                lineContent = scanner.nextLine();
                fileContent.add(lineContent);
            }
            return fileContent;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void writeFile(String fileName, List<String> fileContent) {
        File f = new File(fileName);
        try {
            FileWriter fileWriter = new FileWriter(f);
            for (String line : fileContent) {
                fileWriter.write(line);
                fileWriter.write("\r\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
