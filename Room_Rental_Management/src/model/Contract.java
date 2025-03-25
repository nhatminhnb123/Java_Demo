package model;

public class Contract {
    private String contractId;
    private String roomId;
    private String customerId;

    public Contract() {
    }

    public Contract(String contractId, String roomId, String customerId) {
        this.contractId = contractId;
        this.roomId = roomId;
        this.customerId = customerId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId='" + contractId + '\'' +
                ", roomId='" + roomId + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
