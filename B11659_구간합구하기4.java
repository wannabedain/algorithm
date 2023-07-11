//	입력을 Scanner로 받는 경우: 2500mS
//	BufferReader : 1600mS
//	StringBuilder : 700mS

package day01.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B11659_구간합구하기4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] sum = new int[N+1];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i=1; i<=N; i++) {
			sum[i] = sum[i-1]+ Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			sb.append(sum[end]-sum[start-1]).append("\n");
//			System.out.println(sum[end]-sum[start-1]);
		}
		System.out.println(sb);
	}

}
