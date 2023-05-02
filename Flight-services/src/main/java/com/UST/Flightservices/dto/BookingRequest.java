package com.UST.Flightservices.dto;

import com.UST.Flightservices.entity.Passangerinfo;
import com.UST.Flightservices.entity.Paymentinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class BookingRequest {

    private Passangerinfo passangerinfo;
    private Paymentinfo paymentinfo;


}
