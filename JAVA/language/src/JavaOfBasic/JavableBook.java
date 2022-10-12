package JavaBasic;

import java.io.IOException;

public class JavableBook implements AutoCloseable {
    public static void main(String[] args) {
        try {
            // play();
            resourcePlay();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    @Override
    public void close() throws IOException {
        System.out.println("자원 해제!!");
    }

    public String page(int pageNumber) throws IOException {
        return pageNumber + "입니다!";
    }

    static void play() throws IOException {

        JavableBook book = new JavableBook();
        JavableVideo video = new JavableVideo();
        try {
            try {
                System.out.println(book.page(150));
                System.out.println(video.scene(2));
            } finally {
                video.close();
            }
        } finally {
            book.close();
        }
    }

    static void resourcePlay() throws IOException {
        try (JavableBook book = new JavableBook();
                JavableVideo video = new JavableVideo();) {
            System.out.println(book.page(200));
            System.out.println(video.scene(2));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

class JavableVideo implements AutoCloseable {
    public String scene(int time) throws IOException {
        return time + "시간 입니다.";
    }

    @Override
    public void close() throws IOException {
        System.out.println("자원 해제!!");
    }
}
