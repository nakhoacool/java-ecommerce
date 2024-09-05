package com.khoanguyen.ecommerce.service.image;

import com.khoanguyen.ecommerce.dto.ImageDto;
import com.khoanguyen.ecommerce.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);

    void deleteImageById(Long id);

    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);

    void updateImage(MultipartFile file, Long imageId);
}
