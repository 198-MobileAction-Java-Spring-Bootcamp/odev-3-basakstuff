package com.basaker.mobileactionbootcamp.usr.converter;

import com.basaker.mobileactionbootcamp.usr.dto.UsrUserDto;
import com.basaker.mobileactionbootcamp.usr.dto.UsrUserSaveRequestDto;
import com.basaker.mobileactionbootcamp.usr.dto.UsrUserUpdateRequestDto;
import com.basaker.mobileactionbootcamp.usr.entity.UsrUser;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-19T19:42:24+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class UsrUserMapperImpl implements UsrUserMapper {

    @Override
    public UsrUser convertToUsrUser(UsrUserUpdateRequestDto usrUserUpdateRequestDto) {
        if ( usrUserUpdateRequestDto == null ) {
            return null;
        }

        UsrUser usrUser = new UsrUser();

        usrUser.setId( usrUserUpdateRequestDto.getId() );
        usrUser.setName( usrUserUpdateRequestDto.getName() );
        usrUser.setSurname( usrUserUpdateRequestDto.getSurname() );
        usrUser.setUsername( usrUserUpdateRequestDto.getUsername() );
        usrUser.setPassword( usrUserUpdateRequestDto.getPassword() );

        return usrUser;
    }

    @Override
    public UsrUserDto convertToUsrUserDto(UsrUser usrUser) {
        if ( usrUser == null ) {
            return null;
        }

        UsrUserDto usrUserDto = new UsrUserDto();

        usrUserDto.setId( usrUser.getId() );
        usrUserDto.setName( usrUser.getName() );
        usrUserDto.setSurname( usrUser.getSurname() );
        usrUserDto.setUsername( usrUser.getUsername() );

        return usrUserDto;
    }

    @Override
    public List<UsrUserDto> convertToUsrUserDtoList(List<UsrUser> usrUserList) {
        if ( usrUserList == null ) {
            return null;
        }

        List<UsrUserDto> list = new ArrayList<UsrUserDto>( usrUserList.size() );
        for ( UsrUser usrUser : usrUserList ) {
            list.add( convertToUsrUserDto( usrUser ) );
        }

        return list;
    }

    @Override
    public UsrUser convertToUsrUser(UsrUserSaveRequestDto usrUserSaveRequestDto) {
        if ( usrUserSaveRequestDto == null ) {
            return null;
        }

        UsrUser usrUser = new UsrUser();

        usrUser.setName( usrUserSaveRequestDto.getName() );
        usrUser.setSurname( usrUserSaveRequestDto.getSurname() );
        usrUser.setUsername( usrUserSaveRequestDto.getUsername() );
        usrUser.setPassword( usrUserSaveRequestDto.getPassword() );

        return usrUser;
    }
}
