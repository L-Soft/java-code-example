package com.catslsoft.image.upload;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

@Component("imageUploadView")
public class ImageUploadView  extends AbstractView {
    @Override
    protected void renderMergedOutputModel(Map<String, Object> map,
                                           HttpServletRequest httpServletRequest,
                                           HttpServletResponse httpServletResponse) throws Exception {
        ImageFile imageFile = (ImageFile)map.get("imageFile");
        httpServletResponse.setContentLength(imageFile.getContentLength()); /* 파일의 길이 */
        httpServletResponse.setContentType(imageFile.getContentType()); /* 타입 이미지 */

        byte[] bytes = readFile(imageFile.getFileName());
        write(httpServletResponse, bytes);
    }

    private byte[] readFile (String fileName) throws IOException {
        String path = ImageFile.IMAGE_DIR + fileName;

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        int length = bis.available();
        byte[] bytes = new byte[length];
        bis.read(bytes);
        bis.close();

        return bytes;
    }

    private void write (HttpServletResponse res, byte[] bytes) throws IOException {
        OutputStream output = res.getOutputStream();
        output.write(bytes);
        output.flush();
    }
}
