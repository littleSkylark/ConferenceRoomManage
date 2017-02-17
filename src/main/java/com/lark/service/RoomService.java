package com.lark.service;

import com.lark.dao.mapper.DeviceMapper;
import com.lark.dao.mapper.RoomDeviceMapper;
import com.lark.dao.mapper.RoomMapper;
import com.lark.dao.pojo.Device;
import com.lark.dao.pojo.Room;
import com.lark.dao.pojo.RoomDevice;
import com.lark.message.RoomShow;
import com.lark.utils.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by skylark on 2017/2/13.
 */
@Service
public class RoomService {

    @Autowired
    private RoomMapper roomMapper;
    @Autowired
    private RoomDeviceMapper roomDeviceMapper;
    @Autowired
    private DeviceMapper deviceMapper;

    public List<RoomShow> queryRoomByCompanyId(int companyId) {
        List<Room> rooms = roomMapper.selectRoomNameByCompanyId(companyId);
        List<RoomShow> roomShows=new LinkedList<>();
        for (Room room : rooms) {
            RoomShow roomShow=new RoomShow();
            roomShow.setId(room.getId());
            roomShow.setName(room.getName()+" ( "+room.getMinNum()+"~"+room.getMaxNum()+"人 )");
            roomShow.setStartTime(DateFormat.toTime(room.getBeginTime()));
            roomShow.setEndTime(DateFormat.toTime(room.getEndTime()));
/**/
            List<String> deviceNames=new LinkedList<>();
            List<RoomDevice> roomDevices = roomDeviceMapper.selectByRoomId(room.getId());
            for (RoomDevice roomDevice : roomDevices) {
                Device device = deviceMapper.selectByPrimaryKey(roomDevice.getDeviceId());
                deviceNames.add(device.getName());
            }
            roomShow.setDeviceNames(deviceNames);

            roomShows.add(roomShow);
        }
        return roomShows;
    }
}
