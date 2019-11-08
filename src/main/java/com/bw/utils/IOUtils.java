package com.bw.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class IOUtils {

	/**
	 * �����ļ�
	 * @param filePath  �ļ�·��
	 * @param splitstring	�и� ����
	 * @return
	 */
	private static List<Object[]> readFile(String filePath,String splitstring) {
		try {
			File file  = new File(filePath);
			//���ж�ȡ
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = "";
			
			List<Object[]> list = new ArrayList<Object[]>();
			while((str = br.readLine())!= null){
				String[] split = str.split(splitstring);
				list.add(split);
			}
			br.close();
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
