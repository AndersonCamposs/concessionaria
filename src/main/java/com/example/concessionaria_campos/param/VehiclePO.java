package com.example.concessionaria_campos.param;

import com.example.concessionaria_campos.dto.Create;
import com.example.concessionaria_campos.dto.Update;
import com.example.concessionaria_campos.enums.TransmissionType;
import com.example.concessionaria_campos.enums.VehicleStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehiclePO {
    private Long id;

    @NotBlank(message = "O campo 'modelo' é obrigatório.", groups = {Create.class, Update.class})
    private String model;

    @NotBlank(message = "O campo 'número do chassi' é obrigatório.", groups = {Create.class, Update.class})
    private String chassisNumber;

    @NotBlank(message = "O campo 'placa' é obrigatório.", groups = {Create.class, Update.class})
    private String plate;

    @NotNull(message = "O campo 'marca' é obrigatório.", groups = {Create.class, Update.class})
    private Long brandId;

    @NotNull(message = "O campo 'ano de fabricação' é obrigatório.", groups = {Create.class, Update.class})
    private Integer year;

    @NotNull(message = "O campo 'categoria' é obrigatório.", groups = {Create.class, Update.class})
    private Long categoryId;

    @NotNull(message = "O campo 'tipo de transmissão' é obrigatório.", groups = {Create.class, Update.class})
    private TransmissionType transmissionType;

    private VehicleStatus status;
}