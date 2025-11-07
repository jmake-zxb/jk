package com.jk.common.core.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class SafeArithmeticCaptcha {
    private static final Random random = new Random();
    private final int width;
    private final int height;
    private String text;
    private String result;

    public SafeArithmeticCaptcha(int width, int height) {
        this.width = width;
        this.height = height;
        generate();
    }

    private void generate() {
        // 1~10
        int a = random.nextInt(10) + 1;
        // 1~10
        int b = random.nextInt(10) + 1;
        boolean isAdd = random.nextBoolean();
        if (isAdd) {
            this.text = a + " + " + b + " = ?";
            this.result = String.valueOf(a + b);
        } else {
            // 确保不出现负数
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            this.text = max + " - " + min + " = ?";
            this.result = String.valueOf(max - min);
        }
    }

    public String text() {
        return text;
    }

    public String result() {
        return result;
    }

    // 模拟 out 方法（需结合图形库，如使用 BufferedImage 生成图片）
    public void out(OutputStream out) throws IOException {
        // 这里你需要用 Java 2D 或其他方式绘制 text 到图片并输出
        // 为简化，此处仅示意
        throw new UnsupportedOperationException("需实现图形绘制逻辑");
    }
}
