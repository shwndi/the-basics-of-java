package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExportDmp {
	public static void main(String[] args) {
		expFile();
		//impFile();
		//"COSS_R2_CHENXING_NSBD_0624"
	}
 
	// 从oracle导出
	public static void expFile() {
		String[] cmds = new String[3];
		String commandBuf = "exp arluwak/arluwak@192.168.2.211:1521/ora211 " + 
				" tables=(AR_EXECL_INFO) file=d://test.dmp log=d://test.log";
		cmds[0] = "cmd";
		cmds[1] = "/C";
		cmds[2] = commandBuf.toString();
		Process process = null;
		try {
			process = Runtime.getRuntime().exec(cmds);
		} catch (IOException e) {
			e.printStackTrace();
		}
//		boolean shouldClose = false;
		/*
		 * try { InputStreamReader isr = new
		 * InputStreamReader(process.getErrorStream()); BufferedReader br = new
		 * BufferedReader(isr); String line = null;
		 * 
		 * //打印出读取的oracle导出信息 while ((line = br.readLine()) != null) {
		 * System.out.println(line); if (line.indexOf("????") != -1) { shouldClose =
		 * true; break; } } } catch (IOException ioe) { shouldClose = true; }
		 */
//		if (shouldClose)
//			process.destroy();
//		int exitVal;
//		try {
//			exitVal = process.waitFor();
//			System.out.print(exitVal);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
 
	// 导入oracle
	//fromuser=COSS_R2_CHENXING_NSBD_0605 touser=" + user
	public static void impFile() {
		String[] cmds = new String[3];
//		String commandBuf = "imp SCJG_WRITE/SCJG_WRITE@192.168.2.165:1521/SCJG "
//				+ " file=d://dmptest.dmp log=d://test.log fromuser=arluwak touser=SCJG_WRITE full=y ignore=y";
		String commandBuf = "imp arluwak/arluwak@192.168.2.211:1521/ora211 "
				+ " tables=(AR_EXECL_INFO) file=d://test.dmp log=d://test.log  full=y ignore=y";
		cmds[0] = "cmd";
		cmds[1] = "/C";
		cmds[2] = commandBuf.toString();
		Process process = null;
		try {
			process = Runtime.getRuntime().exec(cmds);
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean shouldClose = false;
		try {
			InputStreamReader isr = new InputStreamReader(process.getErrorStream());
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				if (line.indexOf("????") != -1) {
					shouldClose = true;
					break;
				}
			}
		} catch (IOException ioe) {
			shouldClose = true;
		}
		if (shouldClose)
			process.destroy();
		int exitVal;
		try {
			exitVal = process.waitFor();
			System.out.print(exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
