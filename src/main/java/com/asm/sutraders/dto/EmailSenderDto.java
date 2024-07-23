package com.asm.sutraders.dto;

import java.util.List;

public class EmailSenderDto {
	private String fromName;
	private String messageText;
	private String sendName;
	private List<String> toName;
	private List<String> ccEmailId;
	private String subject;
	private List<String> bccEmailId;

	public List<String> getCcEmailId() {
		return ccEmailId;
	}

	public void setCcEmailId(List<String> ccEmailId) {
		this.ccEmailId = ccEmailId;
	}

	public List<String> getBccEmailId() {
		return bccEmailId;
	}

	public void setBccEmailId(List<String> bccEmailId) {
		this.bccEmailId = bccEmailId;
	}

	public String getSendName() {
		return sendName;
	}

	public void setSendName(String sendName) {
		this.sendName = sendName;
	}

	public List<String> getToName() {
		return toName;
	}

	public void setToName(List<String> toName) {
		this.toName = toName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

}
