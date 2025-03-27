package vnptpay.collection.adapter.partner.water.bentre;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vnptpay.message.common.CollectionErrorCode;

class CityWorkTest {
    private CityWork cityWork;

    @BeforeEach
    void setUp() {
        cityWork = new CityWork(
                "https://www.trungtamnuocbentre.vn/paymentctwservices",
                "ttnsbentrevnptpay",
                "tTNsBeNTrevNptp@yCn105",
                60);
    }

    @Test
    void testGetCustomerInfo() {
        CustomerlInfoHB result = (cityWork.getCustomerInfo("90604"));
    }

    @Test
    void testGetBillInfo() {
        ResponseCode responseCode = new ResponseCode();
        BillInfoHB billInfo = cityWork.getBillInfo("90604", responseCode
        );
    }

    @Test
    void testPayBill() {
        CollectionErrorCode result = cityWork.payBill("8766451");
    }

    @Test
    void testGetPayBill() {
        CollectionErrorCode result = cityWork.getPayBill("8766437");
    }

    @Test
    void testCancelPayBill() {
        CollectionErrorCode result = cityWork.cancelPayBill("8766437");
    }
}

