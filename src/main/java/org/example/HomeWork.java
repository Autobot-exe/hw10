package org.example;


import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Решить задачу https://codeforces.com/contest/356/problem/A
     */
    @SneakyThrows
    public void championship(InputStream in, OutputStream out) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        PrintWriter writer = new PrintWriter(out);

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        int[] defeatedBy = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            defeatedBy[i] = 0;
        }

        for (int i = 0; i < m; ++i) {
            tokenizer = new StringTokenizer(reader.readLine());
            int l = Integer.parseInt(tokenizer.nextToken());
            int r = Integer.parseInt(tokenizer.nextToken());
            int x = Integer.parseInt(tokenizer.nextToken());

            for (int j = l; j <= r; ++j) {
                if (j != x && defeatedBy[j] == 0) {
                    defeatedBy[j] = x;
                }
            }
        }

        for (int i = 1; i <= n; ++i) {
            writer.print(defeatedBy[i]);
            if (i < n) {
                writer.print(" ");
            }
        }

        writer.flush();
    }
}