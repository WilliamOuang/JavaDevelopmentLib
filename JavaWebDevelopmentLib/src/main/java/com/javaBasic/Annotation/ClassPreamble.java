package com.javaBasic.Annotation;

@interface ClassPreamble {
	   String author();
	   String date();
	   int currentRevision() default 1;
	   String lastModified() default "N/A";
	   String lastModifiedBy() default "N/A";
	   // Note use of array
	   String[] reviewers();
	}