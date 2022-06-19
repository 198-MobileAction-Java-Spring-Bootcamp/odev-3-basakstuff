package com.basaker.mobileactionbootcamp.vhc.converter;

import com.basaker.mobileactionbootcamp.usr.entity.UsrUser;
import com.basaker.mobileactionbootcamp.vhc.dto.VhcVehicleDto;
import com.basaker.mobileactionbootcamp.vhc.dto.VhcVehicleSaveRequestDto;
import com.basaker.mobileactionbootcamp.vhc.dto.VhcVehicleUpdateRequestDto;
import com.basaker.mobileactionbootcamp.vhc.entity.VhcVehicle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-19T19:42:25+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class VhcVehicleMapperImpl implements VhcVehicleMapper {

    @Override
    public VhcVehicleDto convertToVhcVehicleDto(VhcVehicle vhcVehicle) {
        if ( vhcVehicle == null ) {
            return null;
        }

        VhcVehicleDto vhcVehicleDto = new VhcVehicleDto();

        vhcVehicleDto.setUsrUserId( vhcVehicleUsrUserId( vhcVehicle ) );
        vhcVehicleDto.setId( vhcVehicle.getId() );
        vhcVehicleDto.setModel( vhcVehicle.getModel() );
        vhcVehicleDto.setPlate( vhcVehicle.getPlate() );
        vhcVehicleDto.setBrand( vhcVehicle.getBrand() );

        return vhcVehicleDto;
    }

    @Override
    public List<VhcVehicleDto> convertToVhcVehicleDtoList(List<VhcVehicle> vhcVehicleList) {
        if ( vhcVehicleList == null ) {
            return null;
        }

        List<VhcVehicleDto> list = new ArrayList<VhcVehicleDto>( vhcVehicleList.size() );
        for ( VhcVehicle vhcVehicle : vhcVehicleList ) {
            list.add( convertToVhcVehicleDto( vhcVehicle ) );
        }

        return list;
    }

    @Override
    public VhcVehicle convertToVhcVehicle(VhcVehicleSaveRequestDto vhcVehicleSaveRequestDto) {
        if ( vhcVehicleSaveRequestDto == null ) {
            return null;
        }

        VhcVehicle vhcVehicle = new VhcVehicle();

        vhcVehicle.setModel( vhcVehicleSaveRequestDto.getModel() );
        vhcVehicle.setPlate( vhcVehicleSaveRequestDto.getPlate() );
        vhcVehicle.setBrand( vhcVehicleSaveRequestDto.getBrand() );

        return vhcVehicle;
    }

    @Override
    public VhcVehicle convertToVhcVehicleUpdate(VhcVehicleUpdateRequestDto VvcVehicleUpdateRequestDto) {
        if ( VvcVehicleUpdateRequestDto == null ) {
            return null;
        }

        VhcVehicle vhcVehicle = new VhcVehicle();

        vhcVehicle.setId( VvcVehicleUpdateRequestDto.getId() );
        vhcVehicle.setModel( VvcVehicleUpdateRequestDto.getModel() );
        vhcVehicle.setPlate( VvcVehicleUpdateRequestDto.getPlate() );
        vhcVehicle.setBrand( VvcVehicleUpdateRequestDto.getBrand() );

        return vhcVehicle;
    }

    private Long vhcVehicleUsrUserId(VhcVehicle vhcVehicle) {
        if ( vhcVehicle == null ) {
            return null;
        }
        UsrUser usrUser = vhcVehicle.getUsrUser();
        if ( usrUser == null ) {
            return null;
        }
        Long id = usrUser.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
