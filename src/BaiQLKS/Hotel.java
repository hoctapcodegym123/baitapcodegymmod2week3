package BaiQLKS;

public class Hotel {
    private String typeRoom;
    private double cost;
    private String idRoom;

    public Hotel() {
    }

    public Hotel(String typeRoom, double cost, String idRoom) {
        this.typeRoom = typeRoom;
        this.cost = cost;
        this.idRoom = idRoom;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "typeRoom='" + typeRoom + '\'' +
                ", cost=" + cost +
                ", idRoom='" + idRoom + '\'' +
                '}';
    }
}
