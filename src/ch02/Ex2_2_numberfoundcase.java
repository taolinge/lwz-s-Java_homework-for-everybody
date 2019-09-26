package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Ex2_2_numberfoundcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
			System.out.print("亲输入两个文件夹名字");
		} else {
			String infile = args[0];
			String outfile = args[1];

			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(infile), "GBK"));
				String lineBuffer;
				StringBuffer ages = new StringBuffer();
				while (null != (lineBuffer = br.readLine())) {
					for (int i = 0; i < lineBuffer.length(); i++) {
						if ((lineBuffer.charAt(i) >= '0') && (lineBuffer.charAt(i) <= '9'))
							ages.append(lineBuffer.charAt(i));
					}
					ages.append(" \r \n");
				}
				br.close();
				FileOutputStream fos = new FileOutputStream(outfile);
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, "GBK"));
				bw.write(ages.toString());
				bw.close();

			} catch (UnsupportedEncodingException | FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.print("文件处理错误");
				System.out.print("输入文件名" + infile);
				System.out.print("输出文件名" + outfile);
				System.out.print("错误信息" + e.getMessage());
			}

		}
	}

}