package com.catslsoft.image.upload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Controller
public class ImageUploadController {

    /*
     * ImageView는 파일 시스템에 있는 이미지 파일을 응답으로 돌려주는 역할을 합니다.
     */
    @Resource(name = "imageUploadView")
    ImageUploadView imageUploadView;

    @Autowired
    ImageUploadService imageUploadService;

    @RequestMapping("/uploadPage")
    public String uploadView() {
        return "upload";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    private String upload(@RequestParam MultipartFile imageFile, ModelMap modelMap) {
        ImageFile fileInfo = imageUploadService.save(imageFile);
        modelMap.put("imageFile", fileInfo);
        return "uploadComplete";
    }

    @RequestMapping("/image/{imageId}")
    private ImageUploadView getImage(@PathVariable String imageId, ModelMap modelMap) {
        ImageFile imageFile = imageUploadService.get(imageId);
        modelMap.put("imageFile", imageFile);
        return imageUploadView;
    }
}
