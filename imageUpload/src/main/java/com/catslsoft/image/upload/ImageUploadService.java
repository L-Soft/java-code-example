package com.catslsoft.image.upload;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class ImageUploadService {
    private Map imageFilesMap;

    public ImageUploadService () {
        init();
    }

    private void init () {
        imageFilesMap = new HashMap();
    }

    public ImageFile get (String id) {
        return (ImageFile)imageFilesMap.get(id);
    }

    public ImageFile save(MultipartFile multipartFile) {
        String getId = UUID.randomUUID().toString();
        ImageFile imageFile = null;
        try {
            String saveFileName = saveToFile(multipartFile, getId);
            imageFile = new ImageFile (getId
                    , multipartFile.getContentType()
                    , saveFileName
                    , (int)multipartFile.getSize());

            imageFilesMap.put(getId, imageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageFile;
    }

    private String saveToFile(MultipartFile multipartFile, String getId) throws IOException {
        String fileName = multipartFile.getOriginalFilename();
        byte[] bytes = multipartFile.getBytes();
        String saveFileName = getId + "." + getExtension(fileName);
        String savePath = ImageFile.IMAGE_DIR + saveFileName;

        /* 파일 쓰기 */
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(savePath));
        bos.write(bytes);
        bos.flush();
        bos.close();

        return saveFileName;
    }

    private String getExtension(String fileName) {
        String[] names = fileName.split("\\.");
        return names.length != 2 ? "" : names[1];
    }
}
