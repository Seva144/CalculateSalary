import com.example.demo2.service.ServiceCalculate;
import com.groupstp.isdayoff.IsDayOff;
import com.groupstp.isdayoff.IsDayOffDateType;
import com.groupstp.isdayoff.enums.DayType;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {


    @Test
    public void test(){
        IsDayOff isDayOff = IsDayOff.Builder().build();
        ServiceCalculate calculate = new ServiceCalculate(2001, "JANUARY", 21000.0, isDayOff);
        System.out.println(calculate);
    }

}
