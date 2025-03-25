package model;

public class Room {
    private String roomId;
    private String roomName;
    private Double area;
    private Double price;
    private String Status;

    public Room() {
    }

    public Room(String roomId, String roomName, Double area, Double price, String status) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.area = area;
        this.price = price;
        Status = status;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", roomName='" + roomName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", Status='" + Status + '\'' +
                '}';
    }
}
