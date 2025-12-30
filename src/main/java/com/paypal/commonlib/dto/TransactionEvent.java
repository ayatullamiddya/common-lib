package com.paypal.commonlib.dto;


import java.time.LocalDateTime;
import java.util.Objects;

public class TransactionEvent{
    private Long senderId;
    private Long receiverId;
    private Double amount;
    private LocalDateTime timestamp;
    private String status;

    public TransactionEvent(Long senderId, Long receiverId, Double amount, LocalDateTime timestamp, String status) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.amount = amount;
        this.timestamp = timestamp;
        this.status = status;
    }

    public TransactionEvent() {
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        TransactionEvent that = (TransactionEvent) object;
        return java.util.Objects.equals(senderId, that.senderId) && java.util.Objects.equals(receiverId, that.receiverId) && java.util.Objects.equals(amount, that.amount) && java.util.Objects.equals(timestamp, that.timestamp) && java.util.Objects.equals(status, that.status);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), senderId, receiverId, amount, timestamp, status);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TransactionEvent{" +
                "senderId=" + senderId +
                ", receiverId=" + receiverId +
                ", amount=" + amount +
                ", timestamp=" + timestamp +
                ", status='" + status + '\'' +
                '}';
    }
}
