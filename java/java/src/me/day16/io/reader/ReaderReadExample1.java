package me.day16.io.reader;

import java.io.*;

public class ReaderReadExample1 {
    public static void main(String[] args) {
        try {
            String path = ReaderReadExample1.class.getResource("").getPath();
            Reader reader = new FileReader(path + "input_kor.txt"); // 정상 출력. 한국어 깨지지 않음 (2 바이트씩 읽음)
//            Reader reader = new FileReader(path + "input_eng.txt"); //  정상 출력
            int readByte;

            // 읽을 수 있는 마지막 바이트까지 루프를 돌며 한 문자씩 읽음
            while ((readByte = reader.read()) != -1) {
                System.out.print((char) readByte);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
