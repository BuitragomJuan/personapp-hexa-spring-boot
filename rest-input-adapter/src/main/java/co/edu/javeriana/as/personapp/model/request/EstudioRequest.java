package co.edu.javeriana.as.personapp.model.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudioRequest {
    private String idProfession;
    private String idPerson;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate graduationDate;
    private String universityName;
    private String database;
}