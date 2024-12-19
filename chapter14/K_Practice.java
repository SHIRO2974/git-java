package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class K_Practice {
    public static void main(String[] args) {
        List<String> fileNames = Arrays.asList(
                "document.pdf", "image1.png", "video.mp4"
                , "presntation.ppt", "image2.png", "image3.jpg"
        );

        List<String> sortedFiles = fileNames.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedFiles);
        // [document.pdf, image1.png, image2.png, image3.jpg, presntation.ppt, video.mp4]

    }
}
