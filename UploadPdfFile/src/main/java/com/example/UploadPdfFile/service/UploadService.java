package com.example.UploadPdfFile.service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UploadService {

	private final static String FILE_EXTENSION = ".pdf";

	public void encryptPDFFile(String path, String fileName, MultipartFile multipartFile, String clientID)
			throws IOException {

		boolean isFilePDF = isFilePDF(fileName);
		if (isFilePDF) {
			String fullPath = path + "/" + clientID;
			// Create client directory
			createDirectory(fullPath);
			// Loading the pdf file
			InputStream inputStream = multipartFile.getInputStream();
			PDDocument pdDocument = PDDocument.load(inputStream);
			// Creating instance of AccessPermission
			AccessPermission ap = new AccessPermission();
			// Creating instance
			StandardProtectionPolicy stpp = new StandardProtectionPolicy("test", "test", ap);
			//StandardProtectionPolicy stpp = new StandardProtectionPolicy("test", "", ap);
			// Setting the length of Encryption key
			stpp.setEncryptionKeyLength(128);
			// Setting the permission
			stpp.setPermissions(ap);
			// Protecting the PDF file
			pdDocument.protect(stpp);
			// Saving and closing the the PDF Document
			pdDocument.save(fullPath + "/" + fileName);
			pdDocument.close();
			
			// Upload the encrypted PDF file to the directory
            uploadFile(fullPath, fileName); 
            
		} else {
			throw new IOException("The file should have PDF format.");
		}

	}

	private static void createDirectory(String dirPath) {
		Path p = Paths.get(dirPath);
		if (!Files.isDirectory(p, LinkOption.NOFOLLOW_LINKS)) {
			try {
				Files.createDirectory(p);
			} catch (IOException e) {
				log.error("Creating directory failed: {} ", e.getMessage());
			}
		}
	}
	
    private static void uploadFile(String fullPath, String fileName) throws IOException {
        // Add logic to upload the file to the specified directory (e.g., using file storage service)
        // For simplicity, this example assumes direct file copying
        Path sourcePath = Paths.get(fullPath + "/" + fileName);
        Path destinationPath = Paths.get("src/main/resources" + "/" + fileName);
        Files.copy(sourcePath, destinationPath);
    }
    
	private static boolean isFilePDF(String fileName) {
		return fileName != null && fileName.endsWith(FILE_EXTENSION);
	}
//	private String generateRandomPassword() {
//        // Generate a random password using SecureRandom
//        SecureRandom secureRandom = new SecureRandom();
//        byte[] passwordBytes = new byte[16]; // Adjust the length as needed
//        secureRandom.nextBytes(passwordBytes);
//
//        // Convert the random bytes to a base64-encoded string
//        return Base64.getEncoder().encodeToString(passwordBytes);
//    }
}
