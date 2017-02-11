package com.lark.dao.pojo;

public class RoomDevice {
    private Integer id;

    private Integer roomId;

    private Integer deviceId;

    public RoomDevice(Integer id, Integer roomId, Integer deviceId) {
        this.id = id;
        this.roomId = roomId;
        this.deviceId = deviceId;
    }

    public RoomDevice() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }
}