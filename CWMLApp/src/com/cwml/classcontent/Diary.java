package com.cwml.classcontent;

public class Diary extends AbstractDiary implements java.io.Serializable {

	// Constructors

		/** default constructor */
		public Diary() {
		}

		/** full constructor */
		public Diary(String content, String title, String time, String username,
				String other) {
			super(content, title, time, username, other);
		}
}
