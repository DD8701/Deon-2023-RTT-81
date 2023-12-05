package com.example.FileUpload.exception;

/*Wants me to add... The serializable class FileStorageException does
* not declare a static final serialVersionUID field of type long*/
public class FileStorageException extends RuntimeException {

	   private String msg;

	   public FileStorageException(String msg) {
	       this.msg = msg;
	   }

	   public String getMsg() {
	       return msg;
	   }

	   public void setMsg(String msg) {
	       this.msg = msg;
	   }
	}
